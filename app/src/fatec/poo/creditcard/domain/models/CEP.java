package fatec.poo.creditcard.domain.models;

import java.util.InputMismatchException;

public class CEP {
	private String cep;
	
	public CEP(String cep) {
		if (CEP.isValid(cep)) 
			this.cep = cep;
		else
			throw new InputMismatchException("CEP Inválido!");
	}
	
	public String getCEP() {
		return this.cep;
	}
	
	public static boolean isValid(String cep) {
		return cep.length() == 8;
	}
}
