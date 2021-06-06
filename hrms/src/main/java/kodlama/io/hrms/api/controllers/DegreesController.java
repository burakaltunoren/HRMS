package kodlama.io.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.DegreeService;

@RestController
@RequestMapping("api/degrees")
public class DegreesController {
	private DegreeService degreeService;

	@Autowired
	public DegreesController(DegreeService degreeService) {
		super();
		this.degreeService = degreeService;
	}

}
