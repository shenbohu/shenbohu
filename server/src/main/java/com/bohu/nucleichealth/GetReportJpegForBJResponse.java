
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
 *         &lt;element name="GetReportJpegForBJResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getReportJpegForBJResult"
})
@XmlRootElement(name = "GetReportJpegForBJResponse")
public class GetReportJpegForBJResponse {

    @XmlElement(name = "GetReportJpegForBJResult")
    protected String getReportJpegForBJResult;

    /**
     * ��ȡgetReportJpegForBJResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportJpegForBJResult() {
        return getReportJpegForBJResult;
    }

    /**
     * ����getReportJpegForBJResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportJpegForBJResult(String value) {
        this.getReportJpegForBJResult = value;
    }

}
