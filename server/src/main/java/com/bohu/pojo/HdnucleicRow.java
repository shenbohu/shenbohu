package com.bohu.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName Hdnucleic
 * @Author shenbohu
 * @Date 2022/6/815:51
 * @Version 1.0
 **/
@Data
public class HdnucleicRow {

    private String sampleInfoId;

    private String sampleReportId;

    private Date createTime;

    private String sampleName;

    private String cardId;

    private String productCode;

    private String mobile;

    private String isPositive;

    private String reportType;

    private String sampleSex;

    private String sampleTestDatePre;

    private String sampleTestTimePre;

    private String sampleTestDateSims;

    private String sampleTestTimeSims;

}
