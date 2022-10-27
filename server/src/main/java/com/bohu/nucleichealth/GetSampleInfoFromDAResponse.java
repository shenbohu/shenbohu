
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
 *         &lt;element name="GetSampleInfoFromDAResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSampleInfoFromDAResult"
})
@XmlRootElement(name = "GetSampleInfoFromDAResponse")
public class GetSampleInfoFromDAResponse {

    @XmlElement(name = "GetSampleInfoFromDAResult")
    protected String getSampleInfoFromDAResult;

    /**
     * ��ȡgetSampleInfoFromDAResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSampleInfoFromDAResult() {
        return getSampleInfoFromDAResult;
    }

    /**
     * ����getSampleInfoFromDAResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSampleInfoFromDAResult(String value) {
        this.getSampleInfoFromDAResult = value;
    }

}
