package sk.fillo.ws.provider;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file="handler-chain.xml")
public class TimeService {

	@WebMethod
	public long providerTimeMillis() {
		return System.currentTimeMillis();
	}

}
