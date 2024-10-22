
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
 *         &lt;element name="returnFahrenheit" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "returnFahrenheit"
})
@XmlRootElement(name = "toCelsiusResponse")
public class ToCelsiusResponse {

    protected float returnFahrenheit;

    /**
     * Gets the value of the returnFahrenheit property.
     * 
     */
    public float getReturnFahrenheit() {
        return returnFahrenheit;
    }

    /**
     * Sets the value of the returnFahrenheit property.
     * 
     */
    public void setReturnFahrenheit(float value) {
        this.returnFahrenheit = value;
    }

}
