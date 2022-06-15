package com.bohu.controller;

import com.bohu.entity.Result;
import com.bohu.service.RestTemplateService;
import org.springframework.web.bind.annotation.*;
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
    public Result healthCodeStatusById(@PathVariable(name = "id") String id ) throws Exception {
        return restTemplateService.healthCodeStatusById(id);
    }


}
