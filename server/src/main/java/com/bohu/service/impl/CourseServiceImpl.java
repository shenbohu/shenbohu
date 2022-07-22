package com.bohu.service.impl;


//import cn.dev33.satoken.secure.SaSecureUtil;
//import cn.dev33.satoken.session.SaSession;
//import cn.dev33.satoken.stp.SaTokenInfo;
//import cn.dev33.satoken.stp.StpUtil;
//import com.bohu.config.ShardingJdbcConfig;
import com.bohu.dao.Sharding.CourseMapper;
import com.bohu.entity.PageResult;
        import com.bohu.entity.YmlConfig;
        import com.bohu.pojo.Course;
        import com.bohu.service.CourseService;
        import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
        import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;
import java.util.*;


/**
 * @ClassName UserServiceImpl
 * @Author shenbohu
 * @Date 2021/5/1910:20 上午
 * @Version 1.0
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Autowired
    private YmlConfig ymlConfig;


    @Override
    public PageResult getallcourse(String pageNum, String pageSize) {
        List<Course> courses = new ArrayList<>();
        HintManager hintManager = HintManager.getInstance() ;
        hintManager.setMasterRouteOnly();
        PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        courses = courseMapper.selectAll();
        PageInfo pageInfo = new PageInfo(courses);
        return  PageResult.ok(pageInfo.getTotal(), courses);
    }


}
