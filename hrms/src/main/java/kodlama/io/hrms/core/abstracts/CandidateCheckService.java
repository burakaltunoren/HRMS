package kodlama.io.hrms.core.abstracts;

import kodlama.io.hrms.entities.concretes.Candidate;

public interface CandidateCheckService {
	public boolean CheckIfRealPerson(Candidate candidate);
}
