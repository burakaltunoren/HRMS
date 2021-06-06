package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	
	
    @Autowired
	public EmployerManager(EmployerDao employerDao) {
    	this.employerDao = employerDao;
	}


	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(true, "İşveren eklendi");
	}

    
}
