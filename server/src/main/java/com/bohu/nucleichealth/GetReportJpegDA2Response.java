
package com.bohu.nucleichealth;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReportJpegDA2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getReportJpegDA2Result"
})
@XmlRootElement(name = "GetReportJpegDA2Response")
public class GetReportJpegDA2Response {

    @XmlElement(name = "GetReportJpegDA2Result")
    protected String getReportJpegDA2Result;

    /**
     * ��ȡgetReportJpegDA2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportJpegDA2Result() {
        return getReportJpegDA2Result;
    }

    /**
     * ����getReportJpegDA2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportJpegDA2Result(String value) {
        this.getReportJpegDA2Result = value;
    }

}
