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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}InterruptionDescription" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}InterruptionDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}InterruptionReason" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}InternalReferenceIdentifier" minOccurs="0"/>
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
    "interruptionDescription",
    "interruptionDateTime",
    "interruptionReason",
    "internalReferenceIdentifier"
})
@XmlRootElement(name = "InterruptionInformation")
public class InterruptionInformation {

    @XmlElement(name = "InterruptionDescription")
    protected String interruptionDescription;
    @XmlElement(name = "InterruptionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interruptionDateTime;
    @XmlElement(name = "InterruptionReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interruptionReason;
    @XmlElement(name = "InternalReferenceIdentifier")
    protected String internalReferenceIdentifier;

    /**
     * Gets the value of the interruptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterruptionDescription() {
        return interruptionDescription;
    }

    /**
     * Sets the value of the interruptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterruptionDescription(String value) {
        this.interruptionDescription = value;
    }

    /**
     * Gets the value of the interruptionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInterruptionDateTime() {
        return interruptionDateTime;
    }

    /**
     * Sets the value of the interruptionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInterruptionDateTime(XMLGregorianCalendar value) {
        this.interruptionDateTime = value;
    }

    /**
     * Gets the value of the interruptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterruptionReason() {
        return interruptionReason;
    }

    /**
     * Sets the value of the interruptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterruptionReason(String value) {
        this.interruptionReason = value;
    }

    /**
     * Gets the value of the internalReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalReferenceIdentifier() {
        return internalReferenceIdentifier;
    }

    /**
     * Sets the value of the internalReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalReferenceIdentifier(String value) {
        this.internalReferenceIdentifier = value;
    }

}
