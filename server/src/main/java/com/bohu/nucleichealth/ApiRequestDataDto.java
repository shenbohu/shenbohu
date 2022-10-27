package com.bohu.nucleichealth;

import lombok.Data;

/**
 * @ClassName ApiRequestDataDto
 * @Author shenbohu
 * @Date 2022/7/2509:50
 * @Version 1.0
 **/
@Data
public class ApiRequestDataDto {

    private String body;
    private String interfaceCode;
    private String nonceStr;
    private Long timestamp;
}
