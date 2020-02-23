package fatec.poo.creditcard.domain.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class CPF {
	private String cpf;
	
	public CPF(String cpf) {
		
		if (CPF.isCPF(cpf)) this.cpf = cpf;
		
		else throw new InputMismatchException("cpf inválido");
		
	}
	
	public String getCPF() {
		return this.cpf; 
	}
	
	private static boolean isCPF(String CPF) {
		// TODO - refactor
		ArrayList<String> invalidInputs = new ArrayList<>(
				Arrays.asList(
						"00000000000",
						"11111111111",
						"22222222222",
						"33333333333",
						"44444444444",
						"55555555555",
						"66666666666",
						"77777777777",
						"88888888888",
						"99999999999"
				)
		);
		
        if (invalidInputs.contains(CPF) || (CPF.length() != 11))
        	return false;
          
        char dig10, dig11;
        int sm, i, r, num, peso;
         
        try {
        	
            sm = 0;
            
            peso = 10;
            
            for (i = 0; i < 9; i++) {
            	
            	num = (int)(CPF.charAt(i) - 48);
            	
            	sm = sm + (num * peso);
            	
            	peso = peso - 1;
            	
            }
          
            r = 11 - (sm % 11);
            
            dig10 = ((r == 10) || (r == 11))? '0': (char)(r + 48);
          
            sm = 0;
            
            peso = 11;
            
            for(i = 0; i < 10; i++) {
            	
            	num = (int)(CPF.charAt(i) - 48);
            	
            	sm = sm + (num * peso);
            	
            	peso = peso - 1;
            	
            }
          
            r = 11 - (sm % 11);
            
            dig11 = ((r == 10) || (r == 11))? '0' : (char)(r + 48);

            return ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)));
            
        } catch (InputMismatchException erro) { return false; }
    }
}
