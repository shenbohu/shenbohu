package com.bohu.controller;

import com.alibaba.fastjson.JSON;
import com.bohu.entity.Result;
import com.bohu.pojo.User;
import com.bohu.service.FileService;
import com.bohu.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName FileUploadController
 * @Author shenbohu
 * @Date 2021/6/201:07 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("/file")
//@CrossOrigin // 解决跨域
public class FileController {


    @Resource
    private FileService fileService;

    /**
     * 上传文件
     *
     * @return
     */
    @PostMapping("upload")
    public Result uploadTeacherImg(@RequestParam("files") List<MultipartFile>  files ,
                                   @RequestParam(required = false) Map map) {
       return fileService.uploadTeacherImg(files ,map);
    }

    /***
     * @Description:
     * @Author: shenbohu
     * @Date: 2021/6/20 12:18 下午
     * @Param: [url]
     * @return: 下载文件到本地
     **/
    @PostMapping(value = "/download")
    public Result downloadTeacherImg(@RequestParam("url") String url) throws Exception {
        return fileService.downloadTeacherImg(url);
    }




    @PostMapping("uploadThumbnails")
    public Result uploadThumbnails(@RequestParam("file") MultipartFile file , HttpServletRequest request) throws  Exception{
        Claims authorization = JwtUtil.parseJWT(request.getHeader("Authorization"));
        String s = authorization.getSubject();
        s = s.substring(1, s.length() - 1);
        String[] strs = s.split(",");
        Map<String, String> map = new HashMap<String, String>();
        for (String string : strs) {
            String key = string.split("=")[0].trim();
            String value = string.split("=")[1];
            map.put(key, value);
        }

        String name = map.get("name");
        String username = map.get("username");


        return fileService.uploadThumbnails(file);

    }
    
}
