
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
 *         &lt;element name="GetSampleInfoFromDA3Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSampleInfoFromDA3Result"
})
@XmlRootElement(name = "GetSampleInfoFromDA3Response")
public class GetSampleInfoFromDA3Response {

    @XmlElement(name = "GetSampleInfoFromDA3Result")
    protected String getSampleInfoFromDA3Result;

    /**
     * ��ȡgetSampleInfoFromDA3Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSampleInfoFromDA3Result() {
        return getSampleInfoFromDA3Result;
    }

    /**
     * ����getSampleInfoFromDA3Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSampleInfoFromDA3Result(String value) {
        this.getSampleInfoFromDA3Result = value;
    }

}
