package sk.fillo.ws.consumer;

import sk.fillo.ws.consumer.def.Service;

public class Consumer {

	private static final String WS_URL = "http://localhost:8888/jax-ws-provider/ws";

	public static void main(String[] args) {
		Service service = WsClientFactory.build(WS_URL);
		int response = service.addNumbers(10, 10);
		System.out.println("Response: " + response);
	}

}
