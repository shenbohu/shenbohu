
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
 *         &lt;element name="GetDetailDataGSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataGSResult"
})
@XmlRootElement(name = "GetDetailDataGSResponse")
public class GetDetailDataGSResponse {

    @XmlElement(name = "GetDetailDataGSResult")
    protected String getDetailDataGSResult;

    /**
     * ��ȡgetDetailDataGSResult���Ե�ֵ��
     * 
     * @return
     *     possible object iss
     *     {@link String }
     *     
     */
    public String getGetDetailDataGSResult() {
        return getDetailDataGSResult;
    }

    /**
     * ����getDetailDataGSResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataGSResult(String value) {
        this.getDetailDataGSResult = value;
    }

}
