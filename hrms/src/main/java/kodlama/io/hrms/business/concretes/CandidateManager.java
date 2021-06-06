package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.core.abstracts.CandidateCheckService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private CandidateCheckService candidateCheckService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, CandidateCheckService candidateCheckService) {
		this.candidateDao = candidateDao;
		this.candidateCheckService = candidateCheckService;
	}
	
	@Override
	public Result add(Candidate candidate) {
		if (this.candidateCheckService.CheckIfRealPerson(candidate)) {
			this.candidateDao.save(candidate);
			return new SuccessResult(true, "Ekleme işlemi başarılı");
		}
		else {
			return new ErrorResult(false, "Gerçek kişi bilgileri girilmelidir");	
		}
			
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		this.candidateDao.findAll();
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Adaylar listelendi");
	}

	@Override
	public Result delete(Candidate candidate) {
		this.candidateDao.delete(candidate);
		return new SuccessResult(true, "Kişi silindi");
	}

	
}
