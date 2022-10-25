package com.bohu.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Device
 * @Author shenbohu
 * @Date 2022/8/2615:23
 * @Version 1.0
 **/

@Data
public class Device {

    private String sim;
    private String alarmData;
    private boolean accopen;
    private boolean gpsstatus;
    private boolean bdsstatus;
    private int locatestatus;
    private boolean isRegistering;
    private String latitudeStatus;
    private String longitudeStatus;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal gcj_lon;
    private BigDecimal gcj_lat;
    private int height;
    private int speed;
    private int direction;
    private Date gpsTime;
    private Date saveTime;

    //  String url = "http://118.123.172.205:2095/receiver/allCarPositions";
    //        String forObject = restTemplate.getForObject(url, String.class);
    //        List<Device> devices = JSON.parseArray(forObject, Device.class);
    //        List<Device> d = new ArrayList<>();
    //        devices.forEach(dev -> {
    //            if (dev.getSim().equals("736083019524")) {
    //                d.add(dev);
    //            }
    //        });
}
