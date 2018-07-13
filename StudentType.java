
package ru.raiffeisen.cources;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StudAge" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentType", propOrder = {
    "studName",
    "studAge"
})
public class StudentType {

    @XmlElement(name = "StudName", required = true)
    protected String studName;
    @XmlElement(name = "StudAge", required = true)
    protected BigInteger studAge;

    /**
     * Gets the value of the studName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudName() {
        return studName;
    }

    /**
     * Sets the value of the studName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudName(String value) {
        this.studName = value;
    }

    /**
     * Gets the value of the studAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStudAge() {
        return studAge;
    }

    /**
     * Sets the value of the studAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStudAge(BigInteger value) {
        this.studAge = value;
    }

}
