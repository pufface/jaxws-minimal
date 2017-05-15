package sk.fillo.ws.consumer;

import sk.fillo.ws.consumer.def.TimeService;

public class Consumer {

	private static final String WS_URL = "http://localhost:8888/jax-ws-provider/TimeServiceService";

	public static void main(String[] args) {
		TimeService service = WsClientFactory.build(WS_URL);
		System.out.println("Calling ws: " + WS_URL);
		long response = service.providerTimeMillis();
		System.out.println("Response: " + response);
	}

}
