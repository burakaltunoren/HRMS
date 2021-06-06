package kodlama.io.hrms.entities.concretes;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@Column(name = "company_name")
	private String companyName;
	
	@NotBlank(message = "Bu alan boş bırakılamaz")
	@Column(name = "position_name")
	private String positionName;
	
	@Column(name = "date_of_start")
	private LocalDate dateOfStart;
	
	@Column(name = "date_of_end")
	private LocalDate dateOfEnd;
	
	@Column(name = "date_of_upload")
	private LocalDate dateOfUpload;
	
	@ManyToOne()	
	@JoinColumn(name = "cv_id")
	private Cv cv;

}
