package kodlama.io.hrms.entities.concretes;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employer_activations")
public class EmployerActivation {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "user_id")
	int userId;
	
	@Column(name = "activation_status")
	boolean activationStatus;
	
	@Column(name = "activation_date")
	LocalDate activationDate;
	
	@Column(name = "is_verified_employee")
	boolean isVerifiedEmployee;
	
	
}
