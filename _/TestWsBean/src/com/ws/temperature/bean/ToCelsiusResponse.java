
package com.ws.temperature.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "toCelsiusResponse", namespace = "http://temperature.ws.bean.com")
@XmlType(name = "toCelsiusResponse", namespace = "http://temperature.ws.bean.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class ToCelsiusResponse {

    @XmlElement(name = "returnFahrenheit", namespace = "")
    private float returnFahrenheit;

    public float getReturnFahrenheit() {
        return this.returnFahrenheit;
    }

    public void setReturnFahrenheit(float returnFahrenheit) {
        this.returnFahrenheit = returnFahrenheit;
    }

}
