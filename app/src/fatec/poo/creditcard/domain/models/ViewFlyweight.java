package fatec.poo.creditcard.domain.models;

import javax.swing.JFrame;

import fatec.poo.creditcard.presentation.views.CaseView;
import fatec.poo.creditcard.presentation.views.LoginView;
import fatec.poo.creditcard.presentation.views.MenuView;

public class ViewFlyweight {
	public static final MenuView MENU = new MenuView();
	
	public static final LoginView LOGIN = new LoginView();
	
	public static final CaseView CASE = new CaseView();
	
	public JFrame getMenuView() { return MENU; }
	
	public JFrame getLoginView() { return LOGIN; }
	
	public JFrame getCaseView() { return CASE; }
}
