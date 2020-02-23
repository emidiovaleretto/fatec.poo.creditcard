package fatec.poo.creditcard.application;

import fatec.poo.creditcard.application.controllers.LoginController;
import fatec.poo.creditcard.domain.models.ViewFlyweight;

public class Main {
	public static void main(String[] args) {
		new LoginController().execute();
	}
}
