package fatec.poo.creditcard.domain.irepos;

import fatec.poo.creditcard.domain.vo.CaseVO;

public interface ICaseRepository {
	public CaseVO search(Long code);
	
	public void update(CaseVO vo);
	
	public void delete(Long code);
	
	public void create(CaseVO vo);
}
