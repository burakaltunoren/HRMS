package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.CandidateActivation;

public interface CandidateActivationDao extends JpaRepository<CandidateActivation, Integer>{

}
