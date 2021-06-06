package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "employers")

public class Employer extends User{
	
	@NotBlank(message = "Firma Adı Alanı Boş Bırakılamaz")
	@Column(name = "company_name")
	String companyName;
	
	@NotBlank(message = "Web Sitesi Alanı Boş Bırakılamaz")
	@Column(name = "website")
	String website;
	
	@NotBlank(message = "Telefon Numarası Alanı Boş Bırakılamaz")
	@Column(name = "phone_number")
	String phoneNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<Jobposting> jobPostings;
	
}
