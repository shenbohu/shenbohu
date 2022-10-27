
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
 *         &lt;element name="GetPathDetailDataSRResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPathDetailDataSRResult"
})
@XmlRootElement(name = "GetPathDetailDataSRResponse")
public class GetPathDetailDataSRResponse {

    @XmlElement(name = "GetPathDetailDataSRResult")
    protected String getPathDetailDataSRResult;

    /**
     * ��ȡgetPathDetailDataSRResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPathDetailDataSRResult() {
        return getPathDetailDataSRResult;
    }

    /**
     * ����getPathDetailDataSRResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPathDetailDataSRResult(String value) {
        this.getPathDetailDataSRResult = value;
    }

}
