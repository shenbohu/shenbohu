
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
 *         &lt;element name="GetPathDetailDataWithPicResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPathDetailDataWithPicResult"
})
@XmlRootElement(name = "GetPathDetailDataWithPicResponse")
public class GetPathDetailDataWithPicResponse {

    @XmlElement(name = "GetPathDetailDataWithPicResult")
    protected String getPathDetailDataWithPicResult;

    /**
     * ��ȡgetPathDetailDataWithPicResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPathDetailDataWithPicResult() {
        return getPathDetailDataWithPicResult;
    }

    /**
     * ����getPathDetailDataWithPicResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPathDetailDataWithPicResult(String value) {
        this.getPathDetailDataWithPicResult = value;
    }

}
