
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
 *         &lt;element name="GetDABarcodeByHospCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDABarcodeByHospCodeResult"
})
@XmlRootElement(name = "GetDABarcodeByHospCodeResponse")
public class GetDABarcodeByHospCodeResponse {

    @XmlElement(name = "GetDABarcodeByHospCodeResult")
    protected String getDABarcodeByHospCodeResult;

    /**
     * ��ȡgetDABarcodeByHospCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDABarcodeByHospCodeResult() {
        return getDABarcodeByHospCodeResult;
    }

    /**
     * ����getDABarcodeByHospCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDABarcodeByHospCodeResult(String value) {
        this.getDABarcodeByHospCodeResult = value;
    }

}
