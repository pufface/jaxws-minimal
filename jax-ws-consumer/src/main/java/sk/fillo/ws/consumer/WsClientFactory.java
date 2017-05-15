package sk.fillo.ws.consumer;

import javax.xml.ws.BindingProvider;

import sk.fillo.ws.consumer.def.Service;
import sk.fillo.ws.consumer.def.ServiceService;

public class WsClientFactory {

	public static Service build(String endpointUrl) {
		Service service = new ServiceService().getServicePort();
		BindingProvider bp = (BindingProvider)service;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointUrl);
		return service;
	}

}
