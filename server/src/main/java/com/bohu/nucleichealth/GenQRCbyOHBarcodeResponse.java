
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
 *         &lt;element name="GenQRCbyOHBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "genQRCbyOHBarcodeResult"
})
@XmlRootElement(name = "GenQRCbyOHBarcodeResponse")
public class GenQRCbyOHBarcodeResponse {

    @XmlElement(name = "GenQRCbyOHBarcodeResult")
    protected String genQRCbyOHBarcodeResult;

    /**
     * ��ȡgenQRCbyOHBarcodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenQRCbyOHBarcodeResult() {
        return genQRCbyOHBarcodeResult;
    }

    /**
     * ����genQRCbyOHBarcodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenQRCbyOHBarcodeResult(String value) {
        this.genQRCbyOHBarcodeResult = value;
    }

}
