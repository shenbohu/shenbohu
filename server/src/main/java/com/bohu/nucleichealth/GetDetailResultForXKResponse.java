
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
 *         &lt;element name="GetDetailResultForXKResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailResultForXKResult"
})
@XmlRootElement(name = "GetDetailResultForXKResponse")
public class GetDetailResultForXKResponse {

    @XmlElement(name = "GetDetailResultForXKResult")
    protected String getDetailResultForXKResult;

    /**
     * ��ȡgetDetailResultForXKResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailResultForXKResult() {
        return getDetailResultForXKResult;
    }

    /**
     * ����getDetailResultForXKResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailResultForXKResult(String value) {
        this.getDetailResultForXKResult = value;
    }

}
