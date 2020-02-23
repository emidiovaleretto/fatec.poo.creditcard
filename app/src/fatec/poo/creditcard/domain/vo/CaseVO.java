package fatec.poo.creditcard.domain.vo;

import fatec.poo.creditcard.domain.models.enums.Bank;
import fatec.poo.creditcard.domain.models.enums.Status;
import fatec.poo.creditcard.domain.models.BankAccount;
import fatec.poo.creditcard.domain.models.CEP;
import fatec.poo.creditcard.domain.models.CPF;
import fatec.poo.creditcard.domain.models.CardNumber;

public class CaseVO {
	public long code;
	public String name;
	public CPF cpf;
	public Bank bank;
	public BankAccount bankAccount;
	public CardNumber cardNumber;
	public double value;
	public CEP cep;
	public double salary;
	public Status status;
}
