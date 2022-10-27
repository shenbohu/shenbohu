
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
 *         &lt;element name="GetResultPicByBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getResultPicByBarcodeResult"
})
@XmlRootElement(name = "GetResultPicByBarcodeResponse")
public class GetResultPicByBarcodeResponse {

    @XmlElement(name = "GetResultPicByBarcodeResult")
    protected String getResultPicByBarcodeResult;

    /**
     * ��ȡgetResultPicByBarcodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetResultPicByBarcodeResult() {
        return getResultPicByBarcodeResult;
    }

    /**
     * ����getResultPicByBarcodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetResultPicByBarcodeResult(String value) {
        this.getResultPicByBarcodeResult = value;
    }

}
