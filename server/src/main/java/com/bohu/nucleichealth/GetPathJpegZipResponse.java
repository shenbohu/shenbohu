
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
 *         &lt;element name="GetPathJpegZipResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPathJpegZipResult"
})
@XmlRootElement(name = "GetPathJpegZipResponse")
public class GetPathJpegZipResponse {

    @XmlElement(name = "GetPathJpegZipResult")
    protected String getPathJpegZipResult;

    /**
     * ��ȡgetPathJpegZipResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPathJpegZipResult() {
        return getPathJpegZipResult;
    }

    /**
     * ����getPathJpegZipResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPathJpegZipResult(String value) {
        this.getPathJpegZipResult = value;
    }

}
