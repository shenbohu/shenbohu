
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
 *         &lt;element name="ExportBySerialNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "exportBySerialNumberResult"
})
@XmlRootElement(name = "ExportBySerialNumberResponse")
public class ExportBySerialNumberResponse {

    @XmlElement(name = "ExportBySerialNumberResult")
    protected String exportBySerialNumberResult;

    /**
     * ��ȡexportBySerialNumberResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportBySerialNumberResult() {
        return exportBySerialNumberResult;
    }

    /**
     * ����exportBySerialNumberResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportBySerialNumberResult(String value) {
        this.exportBySerialNumberResult = value;
    }

}
