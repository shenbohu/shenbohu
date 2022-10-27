
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
 *         &lt;element name="GetDetailByHospCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailByHospCodeResult"
})
@XmlRootElement(name = "GetDetailByHospCodeResponse")
public class GetDetailByHospCodeResponse {

    @XmlElement(name = "GetDetailByHospCodeResult")
    protected String getDetailByHospCodeResult;

    /**
     * ��ȡgetDetailByHospCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailByHospCodeResult() {
        return getDetailByHospCodeResult;
    }

    /**
     * ����getDetailByHospCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailByHospCodeResult(String value) {
        this.getDetailByHospCodeResult = value;
    }

}
