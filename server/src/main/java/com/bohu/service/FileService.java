package com.bohu.service;


import com.bohu.entity.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileService {

    Result uploadTeacherImg(List<MultipartFile> files, Map map);

    Result downloadTeacherImg(String url);

    Result uploadThumbnails(MultipartFile file) throws IOException;
}
