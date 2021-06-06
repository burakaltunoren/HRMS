package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateActivationService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateActivationDao;
import kodlama.io.hrms.entities.concretes.CandidateActivation;

@Service
public class CandidateActivationManager implements CandidateActivationService{
	private CandidateActivationDao candidateActivationDao;

	@Autowired
	public CandidateActivationManager(CandidateActivationDao candidateActivationDao) {
		this.candidateActivationDao = candidateActivationDao;
	}

	@Override
	public List<CandidateActivation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
