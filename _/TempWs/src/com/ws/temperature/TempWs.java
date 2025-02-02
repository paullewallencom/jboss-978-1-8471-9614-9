
package com.ws.temperature;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "TempWs", targetNamespace = "http://temperature.ws.com")
public interface TempWs {


    /**
     * 
     * @param fahrenheit
     * @return
     *     returns float
     */
    @WebMethod(action = "http://temperature.ws.com/toCelsius")
    @WebResult(name = "returnFahrenheit", targetNamespace = "")
    @RequestWrapper(localName = "toCelsius", targetNamespace = "http://temperature.ws.com", className = "com.ws.temperature.ToCelsius")
    @ResponseWrapper(localName = "toCelsiusResponse", targetNamespace = "http://temperature.ws.com", className = "com.ws.temperature.ToCelsiusResponse")
    public float toCelsius(
        @WebParam(name = "fahrenheit", targetNamespace = "")
        float fahrenheit);

    /**
     * 
     * @param celsius
     * @return
     *     returns float
     */
    @WebMethod(action = "http://temperature.ws.com/toFahrenheit")
    @WebResult(name = "returnCelsius", targetNamespace = "")
    @RequestWrapper(localName = "toFahrenheit", targetNamespace = "http://temperature.ws.com", className = "com.ws.temperature.ToFahrenheit")
    @ResponseWrapper(localName = "toFahrenheitResponse", targetNamespace = "http://temperature.ws.com", className = "com.ws.temperature.ToFahrenheitResponse")
    public float toFahrenheit(
        @WebParam(name = "celsius", targetNamespace = "")
        float celsius);

}
