package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployerActivationService;
import kodlama.io.hrms.entities.concretes.EmployerActivation;

@RestController
@RequestMapping("api/employeractivations")
public class EmployerActivationsController {
	private EmployerActivationService employerActivationService;

	@Autowired
	public EmployerActivationsController(EmployerActivationService employerActivationService) {
		super();
		this.employerActivationService = employerActivationService;
	}
	
	@GetMapping("getAll")
	public List<EmployerActivation> getAll(){
		return this.employerActivationService.getAll();
		
	}

}
