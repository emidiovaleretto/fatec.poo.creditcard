package fatec.poo.creditcard.application.controllers;

import fatec.poo.creditcard.domain.models.enums.Action;
import fatec.poo.creditcard.domain.models.User;
import fatec.poo.creditcard.domain.vo.UserVO;

public class SessionController {
	private static UserVO user = new UserVO();
	
	public static void setSessionUser(UserVO userVO) {
		user = userVO;
	}
	
	public static boolean hasPermition(Action action) {
		return new User(user).hasPermition(action);
	}
}
