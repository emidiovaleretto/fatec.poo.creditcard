package fatec.poo.creditcard.application.controllers;

import fatec.poo.creditcard.domain.models.enums.Action;

import javax.swing.JFrame;

import fatec.poo.creditcard.domain.models.User;
import fatec.poo.creditcard.domain.models.ViewFlyweight;
import fatec.poo.creditcard.domain.vo.UserVO;
import fatec.poo.creditcard.infra.utils.PopUp;
import fatec.poo.creditcard.presentation.icontrollers.ILoginController;

public class LoginController implements ILoginController {
	private static JFrame view = ViewFlyweight.LOGIN;
	
	public LoginController() {}
	
	@Override
	public void login(String user, String password) {
		User model = new User(user, password);
		
		model.setVO(model.search());
		
		UserVO sessionUser = (model.isValidUser())? model.getVO(): new UserVO();
		
		SessionController.setSessionUser(sessionUser);
		
		if (SessionController.hasPermition(Action.LOGIN)) {
			
			this.switchView(ViewFlyweight.MENU);
			
		} else {
			
			PopUp.pop("Por favor insira um usuário e senha válidos!");
			
		}
	}

	private void switchView(JFrame nextView) {
		
		this.setVisible(false);
		
		nextView.setVisible(true);
		
	}
	
	private void setVisible(boolean visibility) {
		view.setVisible(visibility);
	}
	
	public void execute() { this.setVisible(true); }
}
