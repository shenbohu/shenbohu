
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
 *         &lt;element name="GetFileBase64ByNameResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getFileBase64ByNameResult"
})
@XmlRootElement(name = "GetFileBase64ByNameResponse")
public class GetFileBase64ByNameResponse {

    @XmlElement(name = "GetFileBase64ByNameResult")
    protected String getFileBase64ByNameResult;

    /**
     * ��ȡgetFileBase64ByNameResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFileBase64ByNameResult() {
        return getFileBase64ByNameResult;
    }

    /**
     * ����getFileBase64ByNameResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFileBase64ByNameResult(String value) {
        this.getFileBase64ByNameResult = value;
    }

}
