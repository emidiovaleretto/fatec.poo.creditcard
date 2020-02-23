package fatec.poo.creditcard.domain.irepos;

import fatec.poo.creditcard.domain.vo.UserVO;

public interface IUserRepository {
	public UserVO search(UserVO vo);
	
	public void update(UserVO vo);
	
	public void delete(UserVO vo);
	
	public void create(UserVO vo);
}
