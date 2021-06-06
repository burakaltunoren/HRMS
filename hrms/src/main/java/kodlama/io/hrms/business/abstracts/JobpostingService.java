package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Jobposting;

public interface JobpostingService {
	Result add(Jobposting jobposting);
	DataResult<List<Jobposting>> getByAllOpenJobpostingsList();
	DataResult<List<Jobposting>> findAllByOrderByPublishedAtDesc();

}
