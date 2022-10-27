
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
 *         &lt;element name="GetDetailByCodeDAResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailByCodeDAResult"
})
@XmlRootElement(name = "GetDetailByCodeDAResponse")
public class GetDetailByCodeDAResponse {

    @XmlElement(name = "GetDetailByCodeDAResult")
    protected String getDetailByCodeDAResult;

    /**
     * ��ȡgetDetailByCodeDAResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailByCodeDAResult() {
        return getDetailByCodeDAResult;
    }

    /**
     * ����getDetailByCodeDAResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailByCodeDAResult(String value) {
        this.getDetailByCodeDAResult = value;
    }

}
