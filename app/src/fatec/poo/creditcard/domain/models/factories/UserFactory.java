package fatec.poo.creditcard.domain.models.factories;

import fatec.poo.creditcard.domain.models.User;
import fatec.poo.creditcard.domain.models.enums.Permition;
import fatec.poo.creditcard.domain.vo.UserVO;

public class UserFactory {
	private UserVO vo;
	
	public UserFactory() {
		this.vo = new UserVO();
	}
			
	public UserFactory setID(long id) {
		this.vo.id = id;
		return this;
	}
	
	public UserFactory setUser(String user) {
		this.vo.user = user;
		return this;
	}
	
	public UserFactory setPassword(String password) {
		this.vo.password = password;
		return this;
	}
	
	public UserFactory setPermition(Permition permition) {
		this.vo.permition = permition;
		return this;
	}
	
	public UserVO buildVO() {
		return this.vo;
	}
	
	public User buildUser() {
		return new User(this.vo);
	}
}
