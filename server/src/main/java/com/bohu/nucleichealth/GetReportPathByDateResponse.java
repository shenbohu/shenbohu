
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
 *         &lt;element name="GetReportPathByDateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getReportPathByDateResult"
})
@XmlRootElement(name = "GetReportPathByDateResponse")
public class GetReportPathByDateResponse {

    @XmlElement(name = "GetReportPathByDateResult")
    protected String getReportPathByDateResult;

    /**
     * ��ȡgetReportPathByDateResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetReportPathByDateResult() {
        return getReportPathByDateResult;
    }

    /**
     * ����getReportPathByDateResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetReportPathByDateResult(String value) {
        this.getReportPathByDateResult = value;
    }

}
