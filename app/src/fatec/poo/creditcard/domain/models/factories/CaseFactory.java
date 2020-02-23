package fatec.poo.creditcard.domain.models.factories;

import fatec.poo.creditcard.domain.models.BankAccount;
import fatec.poo.creditcard.domain.models.CEP;
import fatec.poo.creditcard.domain.models.CPF;
import fatec.poo.creditcard.domain.models.CardNumber;
import fatec.poo.creditcard.domain.models.Case;
import fatec.poo.creditcard.domain.models.enums.Bank;
import fatec.poo.creditcard.domain.models.enums.Status;
import fatec.poo.creditcard.domain.vo.CaseVO;

public class CaseFactory {
	private CaseVO vo;
	
	public CaseFactory() { this.vo = new CaseVO(); }
	
	public CaseFactory setCode(Long code) {
		this.vo.code = code; return this;
	}
	
	public CaseFactory setCode(String code) {
		this.vo.code = Long.parseLong(code); return this;
	}
	
	public CaseFactory setName(String name) {
		this.vo.name = name; return this;
	}
	
	public CaseFactory setCPF(CPF cpf) {
		this.vo.cpf = cpf; return this;
	}
	
	public CaseFactory setCPF(String cpf) {
		this.vo.cpf = new CPF(cpf); return this;
	}
	
	public CaseFactory setBank(Bank bank) {
		this.vo.bank = bank; return this;
	}
	
	public CaseFactory setBankAccount(BankAccount bankAccount) {
		this.vo.bankAccount = bankAccount; return this;
	}
	
	public CaseFactory setCardNumber(CardNumber cardNumber) {
		this.vo.cardNumber = cardNumber; return this;
	}
	
	public CaseFactory setValue(double value) {
		this.vo.value = value; return this;
	}
	
	public CaseFactory setCEP(CEP cep) {
		this.vo.cep = cep; return this;
	}
	
	public CaseFactory setCEP(String cep) {
		this.vo.cep = new CEP(cep); return this;
	}
	
	public CaseFactory setSalary(double salary) {
		this.vo.salary = salary; return this;
	}
	
	public CaseFactory setStatus(Status status) {
		this.vo.status = status; return this;
	}
	
	public CaseVO buildVO() {
		return this.vo;
	}
	
	public Case buildCase() {
		// TODO - Regras de obrigatoriedade
		return new Case(this.vo);
	}
}
