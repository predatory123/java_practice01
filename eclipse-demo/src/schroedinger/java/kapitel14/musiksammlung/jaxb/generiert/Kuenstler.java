//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.12 at 02:25:54 PM CEST 
//


package schroedinger.java.kapitel14.musiksammlung.jaxb.generiert;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kuenstler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kuenstler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alben" type="{http://www.galileocomputing.de/schroedinger/musiksammlung}alben"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kuenstler", propOrder = {
    "name",
    "alben"
})
public class Kuenstler {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Alben alben;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the alben property.
     * 
     * @return
     *     possible object is
     *     {@link Alben }
     *     
     */
    public Alben getAlben() {
        return alben;
    }

    /**
     * Sets the value of the alben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alben }
     *     
     */
    public void setAlben(Alben value) {
        this.alben = value;
    }

}