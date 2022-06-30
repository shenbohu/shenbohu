package com.bohu;

import com.bohu.dao.Appstore.OrderMapper;
import com.bohu.pojo.Order;
import com.bohu.pojo.TUser;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @ClassName OrderTest
 * @Author shenbohu
 * @Date 2021/12/3111:58 AM
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ServiceApplication.class})
public class OrderTest {

     @Autowired
     OrderMapper orderMapper;



    @Test
    public  void insertOrderTest() {
//        for (int i = 0; i < 10; i++) {
//            Order order = new Order();
//            order.setType("111");
//            order.setOid(Integer.toString(i));
//            TUser tUser = new TUser();
//            tUser.setName("11111");
//
//
//        }
        String d = "2018-05-14T03:51:50Z";
        Date date = DateUtil.parse(d);

        System.out.println(date);

    }



}
