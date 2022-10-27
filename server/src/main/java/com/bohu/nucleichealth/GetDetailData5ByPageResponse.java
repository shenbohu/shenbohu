
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
 *         &lt;element name="GetDetailData5ByPageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailData5ByPageResult"
})
@XmlRootElement(name = "GetDetailData5ByPageResponse")
public class GetDetailData5ByPageResponse {

    @XmlElement(name = "GetDetailData5ByPageResult")
    protected String getDetailData5ByPageResult;

    /**
     * ��ȡgetDetailData5ByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailData5ByPageResult() {
        return getDetailData5ByPageResult;
    }

    /**
     * ����getDetailData5ByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailData5ByPageResult(String value) {
        this.getDetailData5ByPageResult = value;
    }

}
