package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.DegreeService;
import kodlama.io.hrms.dataAccess.abstracts.DegreeDao;

@Service
public class DegreeManager implements DegreeService{
	private DegreeDao degreeDao;

	@Autowired
	public DegreeManager(DegreeDao degreeDao) {
		super();
		this.degreeDao = degreeDao;
	}

}
