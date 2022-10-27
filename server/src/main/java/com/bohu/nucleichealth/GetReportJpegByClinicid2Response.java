
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
 *         &lt;element name="GetReportJpegByClinicid2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getReportJpegByClinicid2Result"
})
@XmlRootElement(name = "GetReportJpegByClinicid2Response")
public class GetReportJpegByClinicid2Response {

    @XmlElement(name = "GetReportJpegByClinicid2Result")
    protected String getReportJpegByClinicid2Result;

    /**
     * ��ȡgetReportJpegByClinicid2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportJpegByClinicid2Result() {
        return getReportJpegByClinicid2Result;
    }

    /**
     * ����getReportJpegByClinicid2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportJpegByClinicid2Result(String value) {
        this.getReportJpegByClinicid2Result = value;
    }

}
