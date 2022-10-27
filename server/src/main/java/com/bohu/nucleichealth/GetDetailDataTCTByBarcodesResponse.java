
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
 *         &lt;element name="GetDetailDataTCTByBarcodesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataTCTByBarcodesResult"
})
@XmlRootElement(name = "GetDetailDataTCTByBarcodesResponse")
public class GetDetailDataTCTByBarcodesResponse {

    @XmlElement(name = "GetDetailDataTCTByBarcodesResult")
    protected String getDetailDataTCTByBarcodesResult;

    /**
     * ��ȡgetDetailDataTCTByBarcodesResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataTCTByBarcodesResult() {
        return getDetailDataTCTByBarcodesResult;
    }

    /**
     * ����getDetailDataTCTByBarcodesResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataTCTByBarcodesResult(String value) {
        this.getDetailDataTCTByBarcodesResult = value;
    }

}
