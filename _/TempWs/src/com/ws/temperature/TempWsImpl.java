package com.ws.temperature;


import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.ws.temperature.TempWs;
import javax.jws.WebService;

@WebService(name = "TempWsImpl", serviceName = "TempWs", endpointInterface = "com.ws.temperature.TempWs")
public class TempWsImpl implements TempWs {
	public float toCelsius(float fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

	public float toFahrenheit(float celsius) {
		return (celsius * 9/5) + 32;
	}

}