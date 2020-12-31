
package com.ws.temperature.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "toCelsius", namespace = "http://temperature.ws.bean.com")
@XmlType(name = "toCelsius", namespace = "http://temperature.ws.bean.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class ToCelsius {

    @XmlElement(name = "fahrenheit", namespace = "")
    private float fahrenheit;

    public float getFahrenheit() {
        return this.fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

}
