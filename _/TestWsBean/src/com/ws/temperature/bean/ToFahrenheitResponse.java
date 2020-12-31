
package com.ws.temperature.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "toFahrenheitResponse", namespace = "http://temperature.ws.bean.com")
@XmlType(name = "toFahrenheitResponse", namespace = "http://temperature.ws.bean.com")
@XmlAccessorType(XmlAccessType.FIELD)
public class ToFahrenheitResponse {

    @XmlElement(name = "returnCelsius", namespace = "")
    private float returnCelsius;

    public float getReturnCelsius() {
        return this.returnCelsius;
    }

    public void setReturnCelsius(float returnCelsius) {
        this.returnCelsius = returnCelsius;
    }

}
