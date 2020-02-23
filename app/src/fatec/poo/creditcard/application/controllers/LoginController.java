package fatec.poo.creditcard.application.controllers;

import fatec.poo.creditcard.domain.models.enums.Action;
import fatec.poo.creditcard.domain.models.User;
import fatec.poo.creditcard.domain.models.enums.View;
import fatec.poo.creditcard.domain.vo.UserVO;
import fatec.poo.creditcard.infra.utils.PopUp;
import fatec.poo.creditcard.presentation.icontrollers.ILoginController;

public class LoginController implements ILoginController {

	@Override
	public void login(String user, String password) {
		User model = new User(user, password);
		
		model.setVO(model.search());
		
		UserVO sessionUser = (model.isValidUser())? model.getVO(): new UserVO();
		
		SessionController.setSessionUser(sessionUser);
		
		if (SessionController.hasPermition(Action.LOGIN)) {
			
			this.switchView(View.MENU);
			
		} else {
			PopUp.pop("Por favor insira um usuário e senha válidos!");
		}
	}

	private void switchView(View view) {
		// TODO Auto-generated method stub
	}
	
}
