
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
 *         &lt;element name="GetDetailDataTCTWithPicByPageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataTCTWithPicByPageResult"
})
@XmlRootElement(name = "GetDetailDataTCTWithPicByPageResponse")
public class GetDetailDataTCTWithPicByPageResponse {

    @XmlElement(name = "GetDetailDataTCTWithPicByPageResult")
    protected String getDetailDataTCTWithPicByPageResult;

    /**
     * ��ȡgetDetailDataTCTWithPicByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataTCTWithPicByPageResult() {
        return getDetailDataTCTWithPicByPageResult;
    }

    /**
     * ����getDetailDataTCTWithPicByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataTCTWithPicByPageResult(String value) {
        this.getDetailDataTCTWithPicByPageResult = value;
    }

}
