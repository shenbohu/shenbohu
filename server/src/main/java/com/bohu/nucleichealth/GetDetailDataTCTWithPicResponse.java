
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
 *         &lt;element name="GetDetailDataTCTWithPicResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataTCTWithPicResult"
})
@XmlRootElement(name = "GetDetailDataTCTWithPicResponse")
public class GetDetailDataTCTWithPicResponse {

    @XmlElement(name = "GetDetailDataTCTWithPicResult")
    protected String getDetailDataTCTWithPicResult;

    /**
     * ��ȡgetDetailDataTCTWithPicResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataTCTWithPicResult() {
        return getDetailDataTCTWithPicResult;
    }

    /**
     * ����getDetailDataTCTWithPicResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataTCTWithPicResult(String value) {
        this.getDetailDataTCTWithPicResult = value;
    }

}
