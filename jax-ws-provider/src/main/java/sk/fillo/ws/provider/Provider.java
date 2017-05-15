package sk.fillo.ws.provider;

import javax.xml.ws.Endpoint;

public class Provider {

	private static final String WS_PATH = "http://localhost:8888/jax-ws-provider/TimeServiceService";

	public static void main(String[] args) {
		Endpoint.publish(WS_PATH, new TimeService());
		System.out.println("Service is listening on: " + WS_PATH);
	}

}
