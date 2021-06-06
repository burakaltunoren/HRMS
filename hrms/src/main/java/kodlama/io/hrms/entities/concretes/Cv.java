package kodlama.io.hrms.entities.concretes;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cvs")
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank(message = "Github alanı boş bırakılamaz")
	@Column(name = "github_link")
	private String githubLink;
	
	@NotBlank(message = "Linkedn alanı boş bırakılamaz")
	@Column(name = "linkdn_link")
	private String linkdnLink;
	
	@NotBlank(message = "İş tecrübeleri alanı boş bırakılamaz")
	@Column(name = "description")
	private String description;
	
	@Column(name = "create_date")
	private Date createDate;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy = "cv")
	private List<School> schools;
	
	@OneToMany(mappedBy = "cv")
	private List<Technology> technologies;

}
