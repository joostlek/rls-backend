//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageHeader"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}WagonNumberFreight"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AcceptanceInterchangePoint"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DangerousGoodsIndication" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}OperationalTrainNumber"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainID" minOccurs="0"/>
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
    "messageHeader",
    "wagonNumberFreight",
    "acceptanceInterchangePoint",
    "dangerousGoodsIndication",
    "operationalTrainNumber",
    "trainID"
})
@XmlRootElement(name = "WagonInterchangeSubNoticeMessage")
public class WagonInterchangeSubNoticeMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "WagonNumberFreight", required = true)
    protected String wagonNumberFreight;
    @XmlElement(name = "AcceptanceInterchangePoint", required = true)
    protected AcceptanceInterchangePoint acceptanceInterchangePoint;
    @XmlElement(name = "DangerousGoodsIndication")
    protected DanGoodsType dangerousGoodsIndication;
    @XmlElement(name = "OperationalTrainNumber", required = true)
    protected String operationalTrainNumber;
    @XmlElement(name = "TrainID")
    protected CompositIdentifierOperationalType trainID;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the wagonNumberFreight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWagonNumberFreight() {
        return wagonNumberFreight;
    }

    /**
     * Sets the value of the wagonNumberFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWagonNumberFreight(String value) {
        this.wagonNumberFreight = value;
    }

    /**
     * Gets the value of the acceptanceInterchangePoint property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceInterchangePoint }
     *     
     */
    public AcceptanceInterchangePoint getAcceptanceInterchangePoint() {
        return acceptanceInterchangePoint;
    }

    /**
     * Sets the value of the acceptanceInterchangePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceInterchangePoint }
     *     
     */
    public void setAcceptanceInterchangePoint(AcceptanceInterchangePoint value) {
        this.acceptanceInterchangePoint = value;
    }

    /**
     * Gets the value of the dangerousGoodsIndication property.
     * 
     * @return
     *     possible object is
     *     {@link DanGoodsType }
     *     
     */
    public DanGoodsType getDangerousGoodsIndication() {
        return dangerousGoodsIndication;
    }

    /**
     * Sets the value of the dangerousGoodsIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link DanGoodsType }
     *     
     */
    public void setDangerousGoodsIndication(DanGoodsType value) {
        this.dangerousGoodsIndication = value;
    }

    /**
     * Gets the value of the operationalTrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalTrainNumber() {
        return operationalTrainNumber;
    }

    /**
     * Sets the value of the operationalTrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalTrainNumber(String value) {
        this.operationalTrainNumber = value;
    }

    /**
     * Gets the value of the trainID property.
     * 
     * @return
     *     possible object is
     *     {@link CompositIdentifierOperationalType }
     *     
     */
    public CompositIdentifierOperationalType getTrainID() {
        return trainID;
    }

    /**
     * Sets the value of the trainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositIdentifierOperationalType }
     *     
     */
    public void setTrainID(CompositIdentifierOperationalType value) {
        this.trainID = value;
    }

}