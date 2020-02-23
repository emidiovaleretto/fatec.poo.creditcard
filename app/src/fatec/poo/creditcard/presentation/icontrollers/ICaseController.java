package fatec.poo.creditcard.presentation.icontrollers;

import fatec.poo.creditcard.domain.vo.CaseVO;

public interface ICaseController {

	public void createCase(CaseVO caseVO);
	
	public void updateCase(CaseVO caseVO);
	
	public void deleteCase(Long id);
	
	public CaseVO searchCase(Long id);
}
