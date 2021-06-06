package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.CandidateActivationService;
import kodlama.io.hrms.entities.concretes.CandidateActivation;

@RestController
@RequestMapping("/api/candidateactivations")
public class CandidateActivationsController {
	private CandidateActivationService candidateActivationService;

	@Autowired
	public CandidateActivationsController(CandidateActivationService candidateActivationService) {
		super();
		this.candidateActivationService = candidateActivationService;
	}
	
	@GetMapping("/getAll")
	public List<CandidateActivation> getAll(){
		return this.candidateActivationService.getAll();
		
	}

}
