package com.bohu.service;


import com.bohu.entity.Result;

public interface RestTemplateService {


    Result healthCodeStatusById(String id) throws Exception;

    Result nucleicById(String id);

    Result AllDevice();

}
