package kodlama.io.hrms.entities.concretes;


import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "jobpostings")
@AllArgsConstructor
@NoArgsConstructor

public class Jobposting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@NotBlank(message = "İş tanımı alanı boş bırakılamaz")
	@Column(name = "description")
	private String description;
	
	@NotNull(message = "En yüksek maaş alanı boş bırakılamaz")
	@Column(name = "salary_max")
	private int salaryMax;
	
	@NotNull(message = "En düşük maaş alanı boş bırakılamaz")
	@Column(name = "salary_min")
	private int salaryMin;
	
	@NotNull(message = "Açık pozisyon adedi boş bırakılamaz")
	@Column(name = "number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name = "publish_date")
	private LocalDate publishDate;
	
	@Column(name = "application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name = "isopen")
	private boolean isOpen;

}
