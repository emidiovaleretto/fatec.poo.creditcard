package fatec.poo.creditcard.domain.models;

import fatec.poo.creditcard.domain.irepos.IUserRepository;
import fatec.poo.creditcard.domain.models.enums.Action;
import fatec.poo.creditcard.domain.models.enums.Permition;
import fatec.poo.creditcard.domain.models.factories.UserFactory;
import fatec.poo.creditcard.domain.vo.UserVO;
import fatec.poo.creditcard.infra.repos.UserRepositoryImpl;

public class User {
	private UserVO values;
	
	public User() {
		this.values = new UserVO();
	}
	
	public User(UserVO vo) {
		this.values = vo;
	}
	
	public User(String user, String password) {
		UserFactory factory = new UserFactory();
		
		this.values = factory
						.setUser(user)
						.setPassword(password)
						.buildVO();
	}
	
	public boolean hasPermition(Action action) {
		// TO-DO arquivo de config
		switch (action) {
			case READ:
				return true;
			case CREATE:
				return true;
			case UPDATE:
				return this.getPermition().equals(Permition.ADMIN);
			case DELETE:
				return this.getPermition().equals(Permition.ADMIN);
			case LOGIN:
				return this.getPermition() != null;
			default:
				return false;
		}
	}
	
	public UserVO search() {
		IUserRepository repos = new UserRepositoryImpl();
		
		UserVO userVO = repos.search(this.values);
		
		return userVO;
	}
	
	public UserVO getVO() { return this.values; }
	
	public void setVO(UserVO vo) { this.values = vo; }
	
	public boolean isValidUser() { return (this.getPermition() != null); }
	
	public Permition getPermition() { return this.values.permition; }
}
