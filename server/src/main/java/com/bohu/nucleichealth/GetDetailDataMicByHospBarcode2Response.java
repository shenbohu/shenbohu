
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
 *         &lt;element name="GetDetailDataMicByHospBarcode2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataMicByHospBarcode2Result"
})
@XmlRootElement(name = "GetDetailDataMicByHospBarcode2Response")
public class GetDetailDataMicByHospBarcode2Response {

    @XmlElement(name = "GetDetailDataMicByHospBarcode2Result")
    protected String getDetailDataMicByHospBarcode2Result;

    /**
     * ��ȡgetDetailDataMicByHospBarcode2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataMicByHospBarcode2Result() {
        return getDetailDataMicByHospBarcode2Result;
    }

    /**
     * ����getDetailDataMicByHospBarcode2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataMicByHospBarcode2Result(String value) {
        this.getDetailDataMicByHospBarcode2Result = value;
    }

}
