
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
 *         &lt;element name="GetSampleInfoFromDA2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSampleInfoFromDA2Result"
})
@XmlRootElement(name = "GetSampleInfoFromDA2Response")
public class GetSampleInfoFromDA2Response {

    @XmlElement(name = "GetSampleInfoFromDA2Result")
    protected String getSampleInfoFromDA2Result;

    /**
     * ��ȡgetSampleInfoFromDA2Result���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSampleInfoFromDA2Result() {
        return getSampleInfoFromDA2Result;
    }

    /**
     * ����getSampleInfoFromDA2Result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSampleInfoFromDA2Result(String value) {
        this.getSampleInfoFromDA2Result = value;
    }

}
