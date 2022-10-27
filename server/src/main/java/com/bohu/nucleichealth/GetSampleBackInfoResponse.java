
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
 *         &lt;element name="GetSampleBackInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSampleBackInfoResult"
})
@XmlRootElement(name = "GetSampleBackInfoResponse")
public class GetSampleBackInfoResponse {

    @XmlElement(name = "GetSampleBackInfoResult")
    protected String getSampleBackInfoResult;

    /**
     * ��ȡgetSampleBackInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSampleBackInfoResult() {
        return getSampleBackInfoResult;
    }

    /**
     * ����getSampleBackInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSampleBackInfoResult(String value) {
        this.getSampleBackInfoResult = value;
    }

}
