
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
 *         &lt;element name="GetDABarcodeByHospCode2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDABarcodeByHospCode2Result"
})
@XmlRootElement(name = "GetDABarcodeByHospCode2Response")
public class GetDABarcodeByHospCode2Response {

    @XmlElement(name = "GetDABarcodeByHospCode2Result")
    protected String getDABarcodeByHospCode2Result;

    /**
     * ��ȡgetDABarcodeByHospCode2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDABarcodeByHospCode2Result() {
        return getDABarcodeByHospCode2Result;
    }

    /**
     * ����getDABarcodeByHospCode2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDABarcodeByHospCode2Result(String value) {
        this.getDABarcodeByHospCode2Result = value;
    }

}
