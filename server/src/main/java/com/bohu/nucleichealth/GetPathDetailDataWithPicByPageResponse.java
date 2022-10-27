
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
 *         &lt;element name="GetPathDetailDataWithPicByPageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPathDetailDataWithPicByPageResult"
})
@XmlRootElement(name = "GetPathDetailDataWithPicByPageResponse")
public class GetPathDetailDataWithPicByPageResponse {

    @XmlElement(name = "GetPathDetailDataWithPicByPageResult")
    protected String getPathDetailDataWithPicByPageResult;

    /**
     * ��ȡgetPathDetailDataWithPicByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPathDetailDataWithPicByPageResult() {
        return getPathDetailDataWithPicByPageResult;
    }

    /**
     * ����getPathDetailDataWithPicByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPathDetailDataWithPicByPageResult(String value) {
        this.getPathDetailDataWithPicByPageResult = value;
    }

}
