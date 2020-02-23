package fatec.poo.creditcard.domain.models;

import fatec.poo.creditcard.domain.irepos.ICaseRepository;
import fatec.poo.creditcard.domain.vo.CaseVO;
import fatec.poo.creditcard.infra.repos.CaseRepositoryImpl;

public class Case {
	private static final ICaseRepository repos = new CaseRepositoryImpl();
	private CaseVO values;
	
	public Case() {
		this.values = new CaseVO();
	}
	
	public Case(Long id) {
		this.values = new CaseVO();
		this.values.code = id;
	}
	
	public Case(CaseVO vo) {
		this.values = vo;
	}

	public CaseVO getVO() {
		return values;
	}
	
	public void create() { 
		repos.create(this.getVO());
	}

	public void update() { 
		repos.update(this.getVO());
	}
	
	public void delete() {
		repos.delete(this.values.code);
	}
	
	public CaseVO search() {
		return repos.search(this.values.code);
	}
}
