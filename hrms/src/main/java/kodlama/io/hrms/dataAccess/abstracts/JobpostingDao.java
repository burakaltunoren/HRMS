package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.hrms.entities.concretes.Jobposting;

public interface JobpostingDao extends JpaRepository<Jobposting, Integer>{
	

	
	@Query("From Jobposting where isOpen = true")
	List<Jobposting> getByAllOpenJobpostingsList();
	
	@Query("From Jobposting where isOpen = true Order By publishDate Desc")
	List<Jobposting> findAllByOrderByPublishedAtDesc();
	
	
	

}
