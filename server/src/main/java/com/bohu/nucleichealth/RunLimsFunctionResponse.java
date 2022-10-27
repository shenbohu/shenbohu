
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
 *         &lt;element name="RunLimsFunctionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "runLimsFunctionResult"
})
@XmlRootElement(name = "RunLimsFunctionResponse")
public class RunLimsFunctionResponse {

    @XmlElement(name = "RunLimsFunctionResult")
    protected String runLimsFunctionResult;

    /**
     * ��ȡrunLimsFunctionResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunLimsFunctionResult() {
        return runLimsFunctionResult;
    }

    /**
     * ����runLimsFunctionResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunLimsFunctionResult(String value) {
        this.runLimsFunctionResult = value;
    }

}
