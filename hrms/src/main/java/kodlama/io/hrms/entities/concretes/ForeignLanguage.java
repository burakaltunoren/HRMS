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
@Table(name = "foreign_languages")
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguage {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "Yabancı dil alanı boş bırakılamaz")
	@Column(name = "language_name")
	private String languageName;
	
	@NotBlank(message = "Yabancı dil seviyesi boş bırakılamaz")
	@Column(name = "language_level")
	private String languageLevel;
	
	@Column(name = "date_of_upload")
	private LocalDate dateOfUpload;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	

}
