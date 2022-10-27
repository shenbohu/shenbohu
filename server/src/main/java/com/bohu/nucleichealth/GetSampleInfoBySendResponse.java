
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
 *         &lt;element name="GetSampleInfoBySendResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSampleInfoBySendResult"
})
@XmlRootElement(name = "GetSampleInfoBySendResponse")
public class GetSampleInfoBySendResponse {

    @XmlElement(name = "GetSampleInfoBySendResult")
    protected String getSampleInfoBySendResult;

    /**
     * ��ȡgetSampleInfoBySendResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSampleInfoBySendResult() {
        return getSampleInfoBySendResult;
    }

    /**
     * ����getSampleInfoBySendResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSampleInfoBySendResult(String value) {
        this.getSampleInfoBySendResult = value;
    }

}
