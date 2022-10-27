
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
 *         &lt;element name="GetSept9PDFReportResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSept9PDFReportResult"
})
@XmlRootElement(name = "GetSept9PDFReportResponse")
public class GetSept9PDFReportResponse {

    @XmlElement(name = "GetSept9PDFReportResult")
    protected String getSept9PDFReportResult;

    /**
     * ��ȡgetSept9PDFReportResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetSept9PDFReportResult() {
        return getSept9PDFReportResult;
    }

    /**
     * ����getSept9PDFReportResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetSept9PDFReportResult(String value) {
        this.getSept9PDFReportResult = value;
    }

}
