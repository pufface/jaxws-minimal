package sk.fillo.ws.consumer;

import javax.xml.ws.BindingProvider;

import sk.fillo.ws.consumer.def.TimeService;
import sk.fillo.ws.consumer.def.TimeServiceService;

public class WsClientFactory {

	public static TimeService build(String endpointUrl) {
		TimeService service = new TimeServiceService().getTimeServicePort();
		BindingProvider bp = (BindingProvider)service;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
		return service;
	}

}
