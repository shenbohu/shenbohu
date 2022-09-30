package com.bohu.controller;

import com.bohu.entity.Result;
import com.bohu.service.RestTemplateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @ClassName FileUploadController
 * @Author shenbohu
 * @Date 2021/6/201:07 上午
 * @Version 1.0
 **/
@RestController
@RequestMapping("/rest")
//@CrossOrigin // 解决跨域
public class RestTemplateController {
    @Resource
    private RestTemplateService restTemplateService;

    @GetMapping(value = "healthCodeStatusById/{id}")
    public Result healthCodeStatusById(@PathVariable(name = "id") String id) throws Exception {
        return restTemplateService.healthCodeStatusById(id);
    }


    @GetMapping(value = "nucleicById/{id}")
    public Result nucleicById(@PathVariable(name = "id") String id) throws Exception {
        return restTemplateService.nucleicById(id);
    }

    @GetMapping(value = "AllDevice")
    public Result AllDevice() {
        return restTemplateService.AllDevice();
    }

}
