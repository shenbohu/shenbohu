
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
 *         &lt;element name="GetDetailByHospCode4Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailByHospCode4Result"
})
@XmlRootElement(name = "GetDetailByHospCode4Response")
public class GetDetailByHospCode4Response {

    @XmlElement(name = "GetDetailByHospCode4Result")
    protected String getDetailByHospCode4Result;

    /**
     * ��ȡgetDetailByHospCode4Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailByHospCode4Result() {
        return getDetailByHospCode4Result;
    }

    /**
     * ����getDetailByHospCode4Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailByHospCode4Result(String value) {
        this.getDetailByHospCode4Result = value;
    }

}
