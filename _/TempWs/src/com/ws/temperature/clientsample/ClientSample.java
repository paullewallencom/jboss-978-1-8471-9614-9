package com.ws.temperature.clientsample;

import com.ws.temperature.*;

public class ClientSample {

	public static void main(String[] args) {
	 System.out.println("***********************");
	 System.out.println("Create Web Service Client...");
	 TempWsService service1 = new TempWsService();
	 System.out.println("Create Web Service...");
	 TempWs port1 = service1.getConverterTempSOAP();
	 System.out.println("Call Web Service Operation...");
	 System.out.println("Server said: 150 Fahrenheit = "+port1.toCelsius(150)+" Celsius");
	 System.out.println("Server said: 65.55 Celsius = "+port1.toFahrenheit(65.55f)+ " Fahrenheit");
	 System.out.println("***********************");
	 System.out.println("Call Over!");
	}
}

