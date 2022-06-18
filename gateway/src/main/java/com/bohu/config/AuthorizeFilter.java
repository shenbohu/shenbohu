package com.bohu.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Robod
 * @date 2020/8/5 11:07
 */
@Component
@Slf4j
public class AuthorizeFilter implements GlobalFilter, Ordered {

    private static final String AUTHORIZE_TOKEN = "Authorization";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
     //   log.info(request.getURI().toString());
        ServerHttpResponse response = exchange.getResponse();
        if (needlessToken(request.getPath().toString())) {
            return chain.filter(exchange);
        }
        //从头中获取Token
        String token = request.getHeaders().getFirst(AUTHORIZE_TOKEN);
        boolean hasTokenInHeader = true;
        //请求头中没有Token就从参数中获取
        if (StringUtils.isEmpty(token)) {
            token = request.getQueryParams().getFirst(AUTHORIZE_TOKEN);
            hasTokenInHeader = false;
        }
        //参数中再没有Token就从Cookie中获取
        if (StringUtils.isEmpty(token)) {
            HttpCookie cookie = request.getCookies().getFirst(AUTHORIZE_TOKEN);
            if (cookie != null) {
                token = cookie.getValue();
            }
        }
        //还是没有Token就拦截
        response.setStatusCode(HttpStatus.SEE_OTHER);
        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
        Map map = new HashMap();
        map.put("flag", false);
        map.put("code", 303);
        map.put("message", "没有token/token错误");
        DataBuffer dataBuffer = response.bufferFactory().wrap(JSON.toJSONString(map).getBytes());
        if (StringUtils.isEmpty(token)) {
            return response.writeWith(Flux.just(dataBuffer));
            //return response.setComplete();
        } else {
            if (!hasTokenInHeader) {
                if (!(token.startsWith("brarer") || token.startsWith("Bearer"))) {
                    token = "Bearer" + token;
                }
                request.mutate().header("Authorization", token);
            }
        }
        //Token不为空就校验Token
        try {
            JwtUtil.parseJWT(token);
        } catch (Exception e) {
            //报异常说明Token是错误的，拦截
            return response.writeWith(Flux.just(dataBuffer));
            // return response.setComplete();
        }
        return chain.filter(exchange);
    }

    //判断指定的uri是否不需要token就可以访问，true表示不需要
    public boolean needlessToken(String uri) {
        List<String> urls = new ArrayList<>();
        urls.add("/server/user/add");
        urls.add("/server/user/login");
        urls.add("/server/user/logins");
        if (urls.contains(uri)) {
            return true;
        }
        return false;
    }


    @Override
    public int getOrder() {
        return 0;
    }

}
