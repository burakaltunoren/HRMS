package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.business.abstracts.JobpostingService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobpostingDao;
import kodlama.io.hrms.entities.concretes.Jobposting;

@Service
public class JobpostingManager implements JobpostingService{
	private JobpostingDao jobpostingDao;

	@Autowired
	public JobpostingManager(JobpostingDao jobpostingDao) {
		super();
		this.jobpostingDao = jobpostingDao;
	}

	@Override
	public Result add(Jobposting jobposting) {
		this.jobpostingDao.save(jobposting);
		return new SuccessResult(true, "İş ilanı eklendi");
	}

	@Override
	public DataResult<List<Jobposting>> getByAllOpenJobpostingsList() {
		return new SuccessDataResult<List<Jobposting>>(this.jobpostingDao.getByAllOpenJobpostingsList(), "Aktif iş ilanları listelendi");
	}

	@Override
	public DataResult<List<Jobposting>> findAllByOrderByPublishedAtDesc() {
		return new SuccessDataResult<List<Jobposting>>(this.jobpostingDao.findAllByOrderByPublishedAtDesc(), "Aktif ilanlar tarihe göre listelendi");
	}

	
		
}
