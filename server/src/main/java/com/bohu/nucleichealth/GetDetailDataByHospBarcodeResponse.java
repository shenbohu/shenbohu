
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
 *         &lt;element name="GetDetailDataByHospBarcodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataByHospBarcodeResult"
})
@XmlRootElement(name = "GetDetailDataByHospBarcodeResponse")
public class GetDetailDataByHospBarcodeResponse {

    @XmlElement(name = "GetDetailDataByHospBarcodeResult")
    protected String getDetailDataByHospBarcodeResult;

    /**
     * ��ȡgetDetailDataByHospBarcodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataByHospBarcodeResult() {
        return getDetailDataByHospBarcodeResult;
    }

    /**
     * ����getDetailDataByHospBarcodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataByHospBarcodeResult(String value) {
        this.getDetailDataByHospBarcodeResult = value;
    }

}
