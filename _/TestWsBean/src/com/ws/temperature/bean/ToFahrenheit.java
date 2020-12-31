
package com.ws.temperature.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "toFahrenheit", namespace = "http://temperature.ws.bean.com")
@XmlType(name = "toFahrenheit", namespace = "http://temperature.ws.bean.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class ToFahrenheit {

    @XmlElement(name = "celsius", namespace = "")
    private float celsius;

    public float getCelsius() {
        return this.celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

}
