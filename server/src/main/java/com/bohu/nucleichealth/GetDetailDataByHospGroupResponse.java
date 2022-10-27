
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
 *         &lt;element name="GetDetailDataByHospGroupResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDetailDataByHospGroupResult"
})
@XmlRootElement(name = "GetDetailDataByHospGroupResponse")
public class GetDetailDataByHospGroupResponse {

    @XmlElement(name = "GetDetailDataByHospGroupResult")
    protected String getDetailDataByHospGroupResult;

    /**
     * ��ȡgetDetailDataByHospGroupResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDetailDataByHospGroupResult() {
        return getDetailDataByHospGroupResult;
    }

    /**
     * ����getDetailDataByHospGroupResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDetailDataByHospGroupResult(String value) {
        this.getDetailDataByHospGroupResult = value;
    }

}
