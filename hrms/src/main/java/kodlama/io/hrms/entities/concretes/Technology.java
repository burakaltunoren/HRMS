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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "technologies")
public class Technology {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Teknoloji alanı boş bırakılamaz...!")
	@Column(name = "technology_name")
	private String technologyName;
	
	@Column(name = "upload_date")
	private LocalDate uploadDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	

}
