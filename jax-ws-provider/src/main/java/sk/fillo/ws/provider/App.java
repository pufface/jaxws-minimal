package sk.fillo.ws.provider;

import javax.xml.ws.Endpoint;

public class App {

	private static final String WS_PATH = "http://localhost:8888/ws/provider";

	public static void main(String[] args) {
		Endpoint.publish(WS_PATH, new Service());
		System.out.println("Service is listening on: " + WS_PATH);
	}

}
