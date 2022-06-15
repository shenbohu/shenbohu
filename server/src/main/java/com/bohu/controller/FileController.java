package com.bohu.controller;

import com.bohu.entity.Result;
import com.bohu.service.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
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
    public Result uploadThumbnails(@RequestParam("file") MultipartFile file) throws  Exception{
        return fileService.uploadThumbnails(file);

    }
    
}
