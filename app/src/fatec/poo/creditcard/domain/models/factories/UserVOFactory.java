package fatec.poo.creditcard.domain.models.factories;

import fatec.poo.creditcard.domain.models.enums.Permition;
import fatec.poo.creditcard.domain.vo.UserVO;

public class UserVOFactory {
	private UserVO vo;
	
	public UserVOFactory() {
		this.vo = new UserVO();
	}
			
	public UserVOFactory setID(long id) {
		this.vo.id = id;
		return this;
	}
	
	public UserVOFactory setUser(String user) {
		this.vo.user = user;
		return this;
	}
	
	public UserVOFactory setPassword(String password) {
		this.vo.password = password;
		return this;
	}
	
	public UserVOFactory setPermition(Permition permition) {
		this.vo.permition = permition;
		return this;
	}
	
	public UserVO build() {
		return this.vo;
	}
}
