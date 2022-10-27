
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
 *         &lt;element name="GetDetailDataTCTByBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataTCTByBarcodeResult"
})
@XmlRootElement(name = "GetDetailDataTCTByBarcodeResponse")
public class GetDetailDataTCTByBarcodeResponse {

    @XmlElement(name = "GetDetailDataTCTByBarcodeResult")
    protected String getDetailDataTCTByBarcodeResult;

    /**
     * ��ȡgetDetailDataTCTByBarcodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataTCTByBarcodeResult() {
        return getDetailDataTCTByBarcodeResult;
    }

    /**
     * ����getDetailDataTCTByBarcodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataTCTByBarcodeResult(String value) {
        this.getDetailDataTCTByBarcodeResult = value;
    }

}
