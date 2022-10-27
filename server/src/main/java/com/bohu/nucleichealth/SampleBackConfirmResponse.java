
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
 *         &lt;element name="SampleBackConfirmResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sampleBackConfirmResult"
})
@XmlRootElement(name = "SampleBackConfirmResponse")
public class SampleBackConfirmResponse {

    @XmlElement(name = "SampleBackConfirmResult")
    protected String sampleBackConfirmResult;

    /**
     * ��ȡsampleBackConfirmResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleBackConfirmResult() {
        return sampleBackConfirmResult;
    }

    /**
     * ����sampleBackConfirmResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleBackConfirmResult(String value) {
        this.sampleBackConfirmResult = value;
    }

}
