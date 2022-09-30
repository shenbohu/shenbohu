package com.bohu.controller;

import com.bohu.entity.PageResult;
import com.bohu.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;


    @GetMapping(value = "getallcourse/{pageNum}/{pageSize}")
    public PageResult getallcourse(@PathVariable("pageNum") String pageNum, @PathVariable("pageSize") String pageSize) {
        return courseService.getallcourse(pageNum, pageSize);
    }

}
