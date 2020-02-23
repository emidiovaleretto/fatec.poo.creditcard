package fatec.poo.creditcard.domain.models;

import java.util.InputMismatchException;

import fatec.poo.creditcard.domain.models.enums.Bank;

public class CardNumber {
	private Long number;
		
		public CardNumber(Bank bank, String number) {
			
			if (BankAccount.isValidDigit(bank, number))
				this.number = Long.parseLong(number);
			
			else
				throw new InputMismatchException("digito invalido para o banco selecionado");
			
		}
		
		public Long getNumber() {
			return this.number;
		}
		
		public static boolean isValidDigit(Bank bank, String number) {
			// TODO - arquivo de configuração ou validação em banco
			return true;
		}
}
