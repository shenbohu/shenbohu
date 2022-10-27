
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
 *         &lt;element name="GetDetailDataByHospBarcode2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataByHospBarcode2Result"
})
@XmlRootElement(name = "GetDetailDataByHospBarcode2Response")
public class GetDetailDataByHospBarcode2Response {

    @XmlElement(name = "GetDetailDataByHospBarcode2Result")
    protected String getDetailDataByHospBarcode2Result;

    /**
     * ��ȡgetDetailDataByHospBarcode2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataByHospBarcode2Result() {
        return getDetailDataByHospBarcode2Result;
    }

    /**
     * ����getDetailDataByHospBarcode2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataByHospBarcode2Result(String value) {
        this.getDetailDataByHospBarcode2Result = value;
    }

}
