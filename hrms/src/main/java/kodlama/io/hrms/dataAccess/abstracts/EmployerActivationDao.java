package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.EmployerActivation;

public interface EmployerActivationDao extends JpaRepository<EmployerActivation, Integer>{

}
