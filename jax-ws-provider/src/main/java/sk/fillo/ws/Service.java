package sk.fillo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Service {
	
	@WebMethod(action = "addNumbers")
	public int addNumbers(int number1, int number2) {
		if (number1 < 0 || number2 < 0) {
			throw new RuntimeException("Negative number cant be added!");
		}
		return number1 + number2;
	}

}
