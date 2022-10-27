
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
 *         &lt;element name="GetDetailByHospCode3Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailByHospCode3Result"
})
@XmlRootElement(name = "GetDetailByHospCode3Response")
public class GetDetailByHospCode3Response {

    @XmlElement(name = "GetDetailByHospCode3Result")
    protected String getDetailByHospCode3Result;

    /**
     * ��ȡgetDetailByHospCode3Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailByHospCode3Result() {
        return getDetailByHospCode3Result;
    }

    /**
     * ����getDetailByHospCode3Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailByHospCode3Result(String value) {
        this.getDetailByHospCode3Result = value;
    }

}
