package com.ws.temperature.bean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "TempWsBean", targetNamespace = "http://temperature.ws.bean.com")
public class TempWsBean {


    @WebMethod(action = "http://temperature.ws.bean.com/toCelsius")
    @WebResult(name = "returnFahrenheit", targetNamespace = "")
    @RequestWrapper(localName = "toCelsius", targetNamespace = "http://temperature.ws.bean.com", className = "com.ws.temperature.bean.ToCelsius")
    @ResponseWrapper(localName = "toCelsiusResponse", targetNamespace = "http://temperature.ws.bean.com", className = "com.ws.temperature.bean.ToCelsiusResponse")
    public float toCelsius(
        @WebParam(name = "fahrenheit", targetNamespace = "")
        float fahrenheit){
    	return (fahrenheit - 32) * 5/9;
    }
    
    @WebMethod(action = "http://temperature.ws.bean.com/toFahrenheit")
    @WebResult(name = "returnCelsius", targetNamespace = "")
    @RequestWrapper(localName = "toFahrenheit", targetNamespace = "http://temperature.ws.bean.com", className = "com.ws.temperature.bean.ToFahrenheit")
    @ResponseWrapper(localName = "toFahrenheitResponse", targetNamespace = "http://temperature.ws.bean.com", className = "com.ws.temperature.bean.ToFahrenheitResponse")
    public float toFahrenheit(
        @WebParam(name = "celsius", targetNamespace = "")
        float celsius){
    	return (celsius * 9/5) + 32;
    }

}
