package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerActivationService;
import kodlama.io.hrms.dataAccess.abstracts.EmployerActivationDao;
import kodlama.io.hrms.entities.concretes.EmployerActivation;

@Service
public class EmployerActivationManager implements EmployerActivationService{
	private EmployerActivationDao employerActivationDao;

	@Autowired
	public EmployerActivationManager(EmployerActivationDao employerActivationDao) {
		super();
		this.employerActivationDao = employerActivationDao;
	}

	@Override
	public List<EmployerActivation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
