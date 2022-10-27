
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
 *         &lt;element name="GetPathWithPicByPageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPathWithPicByPageResult"
})
@XmlRootElement(name = "GetPathWithPicByPageResponse")
public class GetPathWithPicByPageResponse {

    @XmlElement(name = "GetPathWithPicByPageResult")
    protected String getPathWithPicByPageResult;

    /**
     * ��ȡgetPathWithPicByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPathWithPicByPageResult() {
        return getPathWithPicByPageResult;
    }

    /**
     * ����getPathWithPicByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPathWithPicByPageResult(String value) {
        this.getPathWithPicByPageResult = value;
    }

}
