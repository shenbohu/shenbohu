package com.bohu.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GetObjectRequest;
import com.bohu.entity.Result;
import com.bohu.service.FileService;
import com.bohu.utils.AlOssFile;
import com.bohu.utils.ConstantPropertiesUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class FileServiceImpl implements FileService {

    @Override
    public Result uploadTeacherImg(List<MultipartFile> files, Map map) {
        List<Map> maps = new ArrayList<>();
        files.forEach(file -> {
            Map filemap = AlOssFile.uploadTeacherImg(file);
            maps.add(filemap);
        });
        return Result.ok(maps);

    }

    @Override
    public Result downloadTeacherImg(String url) {
        String endpoint = ConstantPropertiesUtil.ENDPOINT;
        String accessKeyId = ConstantPropertiesUtil.KEYID;
        String accessKeySecret = ConstantPropertiesUtil.KEYSECRET;
        String bucketName = ConstantPropertiesUtil.BUCKETNAME;
        String objectName = url;
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        String uuid = url.substring(0, url.lastIndexOf("."));
        url = url.substring(url.lastIndexOf("/") + 1);
        if (uuid.length() > 47 && url.length() > 36) {
            url = url.substring(36);
        }
        ossClient.getObject(new GetObjectRequest(bucketName, objectName), new File("/Users/shenbohu/Downloads/" + url));
        ossClient.shutdown();
        return Result.ok();
        //imgurl:http://shenbohu.oss-cn-hangzhou.aliyuncs.com/2021/06/20/65481890-d793-4571-893d-3548b59e236a需求汇总.xlsx"

    }

    @Override
    public Result uploadThumbnails(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        String name = file.getName();
        String originalFilename = file.getOriginalFilename();
        OutputStream out  = new FileOutputStream("/Users/shenbohu/Downloads/" + originalFilename);
        byte temp[] = new byte[1024];
        int size = -1;
        while ((size = inputStream.read(temp)) != -1) { // 每次读取1KB，直至读完
            out.write(temp, 0, size);
        }

        //Thumbnails.of(inputStream).scale(1f).outputQuality(0.3f).toOutputStream(out);
        return Result.ok("我是你爸爸");
    }
}
