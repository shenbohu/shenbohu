
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
 *         &lt;element name="GetDetailDataByHospInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataByHospInfoResult"
})
@XmlRootElement(name = "GetDetailDataByHospInfoResponse")
public class GetDetailDataByHospInfoResponse {

    @XmlElement(name = "GetDetailDataByHospInfoResult")
    protected String getDetailDataByHospInfoResult;

    /**
     * ��ȡgetDetailDataByHospInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataByHospInfoResult() {
        return getDetailDataByHospInfoResult;
    }

    /**
     * ����getDetailDataByHospInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataByHospInfoResult(String value) {
        this.getDetailDataByHospInfoResult = value;
    }

}
