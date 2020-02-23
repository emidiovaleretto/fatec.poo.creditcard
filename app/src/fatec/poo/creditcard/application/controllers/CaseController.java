package fatec.poo.creditcard.application.controllers;

import fatec.poo.creditcard.domain.models.Case;
import fatec.poo.creditcard.domain.models.enums.Action;
import fatec.poo.creditcard.domain.vo.CaseVO;
import fatec.poo.creditcard.presentation.icontrollers.ICaseController;

public class CaseController implements ICaseController {

	@Override
	public void createCase(CaseVO caseVO) {
		if (SessionController.hasPermition(Action.CREATE) ) {
			new Case(caseVO).create();
		} throw new RuntimeException("Permissão negada");
	}

	@Override
	public void updateCase(CaseVO caseVO) {
		if (SessionController.hasPermition(Action.UPDATE)) {
			new Case(caseVO).update();
		} throw new RuntimeException("Permissão negada");
	}

	@Override
	public void deleteCase(Long id) {
		if (SessionController.hasPermition(Action.DELETE)) {
			new Case(id).delete();
		} throw new RuntimeException("Permissão negada");
	}

	@Override
	public CaseVO searchCase(Long id) {
		if (SessionController.hasPermition(Action.READ)) {
			return new Case(id).search();
		} throw new RuntimeException("Permissão negada");
	}
}
