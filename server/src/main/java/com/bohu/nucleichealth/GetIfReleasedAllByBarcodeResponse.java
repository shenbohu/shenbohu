
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
 *         &lt;element name="GetIfReleasedAllByBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getIfReleasedAllByBarcodeResult"
})
@XmlRootElement(name = "GetIfReleasedAllByBarcodeResponse")
public class GetIfReleasedAllByBarcodeResponse {

    @XmlElement(name = "GetIfReleasedAllByBarcodeResult")
    protected String getIfReleasedAllByBarcodeResult;

    /**
     * ��ȡgetIfReleasedAllByBarcodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetIfReleasedAllByBarcodeResult() {
        return getIfReleasedAllByBarcodeResult;
    }

    /**
     * ����getIfReleasedAllByBarcodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetIfReleasedAllByBarcodeResult(String value) {
        this.getIfReleasedAllByBarcodeResult = value;
    }

}
