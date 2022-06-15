package com.bohu;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@SpringBootApplication(exclude = SpringBootConfiguration.class)
//@EnableEurekaClient //开启Eureka客户端
//@MapperScan("com.bohu.dao")
@EnableFeignClients(basePackages = "com.bohu.feign")
@EnableDiscoveryClient
public class ServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
        System.out.println("\n------ 启动成功 ------");
    }

}
