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
@Table(name = "schools")
@AllArgsConstructor
@NoArgsConstructor
public class School {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Okul adı boş bırakılamaz")
	@Column(name = "school_name")
	private String schoolName;
	
	@NotBlank(message = "Fakülte alanı boş bırakılamaz")
	@Column(name = "faculty")
	private String faculty;
	
	@Column(name = "starting_date")
	private LocalDate startingDate;
	
	@Column(name = "ending_date")
	private LocalDate endingDate;
	
	@Column(name = "date_of_upload")
	private LocalDate dateOfUpload;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
	@ManyToOne()
	@JoinColumn(name = "degree_id")
	private Degree degree;
	

}
