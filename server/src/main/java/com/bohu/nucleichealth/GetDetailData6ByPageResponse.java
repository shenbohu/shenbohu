
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
 *         &lt;element name="GetDetailData6ByPageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailData6ByPageResult"
})
@XmlRootElement(name = "GetDetailData6ByPageResponse")
public class GetDetailData6ByPageResponse {

    @XmlElement(name = "GetDetailData6ByPageResult")
    protected String getDetailData6ByPageResult;

    /**
     * ��ȡgetDetailData6ByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailData6ByPageResult() {
        return getDetailData6ByPageResult;
    }

    /**
     * ����getDetailData6ByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailData6ByPageResult(String value) {
        this.getDetailData6ByPageResult = value;
    }

}
