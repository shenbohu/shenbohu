
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
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hospName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hospBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="begDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "clientID",
    "clientGUID",
    "hospName",
    "hospBarcode",
    "dataType",
    "begDate",
    "endDate"
})
@XmlRootElement(name = "GetDetailDataByHospBarcode")
public class GetDetailDataByHospBarcode {

    @XmlElement(name = "ClientID")
    protected String clientID;
    @XmlElement(name = "ClientGUID")
    protected String clientGUID;
    protected String hospName;
    protected String hospBarcode;
    @XmlElement(name = "DataType")
    @XmlSchemaType(name = "unsignedByte")
    protected short dataType;
    protected String begDate;
    protected String endDate;

    /**
     * ��ȡclientID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * ����clientID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * ��ȡclientGUID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGUID() {
        return clientGUID;
    }

    /**
     * ����clientGUID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGUID(String value) {
        this.clientGUID = value;
    }

    /**
     * ��ȡhospName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospName() {
        return hospName;
    }

    /**
     * ����hospName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospName(String value) {
        this.hospName = value;
    }

    /**
     * ��ȡhospBarcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospBarcode() {
        return hospBarcode;
    }

    /**
     * ����hospBarcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospBarcode(String value) {
        this.hospBarcode = value;
    }

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     */
    public short getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     */
    public void setDataType(short value) {
        this.dataType = value;
    }

    /**
     * ��ȡbegDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegDate() {
        return begDate;
    }

    /**
     * ����begDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegDate(String value) {
        this.begDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
