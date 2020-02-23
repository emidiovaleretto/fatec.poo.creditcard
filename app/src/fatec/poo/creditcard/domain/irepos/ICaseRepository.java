package fatec.poo.creditcard.domain.irepos;

import fatec.poo.creditcard.domain.vo.CaseVO;

public interface ICaseRepository {
	public CaseVO search(CaseVO vo);
	
	public void update(CaseVO vo);
	
	public void delete(CaseVO vo);
	
	public void create(CaseVO vo);
}
