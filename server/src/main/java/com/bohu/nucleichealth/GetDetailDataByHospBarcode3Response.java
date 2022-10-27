
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
 *         &lt;element name="GetDetailDataByHospBarcode3Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataByHospBarcode3Result"
})
@XmlRootElement(name = "GetDetailDataByHospBarcode3Response")
public class GetDetailDataByHospBarcode3Response {

    @XmlElement(name = "GetDetailDataByHospBarcode3Result")
    protected String getDetailDataByHospBarcode3Result;

    /**
     * ��ȡgetDetailDataByHospBarcode3Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataByHospBarcode3Result() {
        return getDetailDataByHospBarcode3Result;
    }

    /**
     * ����getDetailDataByHospBarcode3Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataByHospBarcode3Result(String value) {
        this.getDetailDataByHospBarcode3Result = value;
    }

}
