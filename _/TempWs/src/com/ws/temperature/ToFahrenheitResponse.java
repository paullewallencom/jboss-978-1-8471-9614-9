
package com.ws.temperature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="returnCelsius" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "returnCelsius"
})
@XmlRootElement(name = "toFahrenheitResponse")
public class ToFahrenheitResponse {

    protected float returnCelsius;

    /**
     * Gets the value of the returnCelsius property.
     * 
     */
    public float getReturnCelsius() {
        return returnCelsius;
    }

    /**
     * Sets the value of the returnCelsius property.
     * 
     */
    public void setReturnCelsius(float value) {
        this.returnCelsius = value;
    }

}
