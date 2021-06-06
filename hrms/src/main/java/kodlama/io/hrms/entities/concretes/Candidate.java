package kodlama.io.hrms.entities.concretes;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "candidates")
public class Candidate extends User{
	
	@NotBlank(message = "İsim Alanı Alanı Boş Bırakılamaz")
	@Column(name = "first_name")
	String firstName;
	
	@NotBlank(message = "Soyadı Alanı Boş Bırakılamaz")
	@Column(name = "last_name")
	String lastName;
	
	@NotNull(message = "Doğum Tarihi Alanı Boş Bırakılamaz")
	@Column(name = "date_of_birth")
	LocalDate dateOfBirth;	
	
	@NotBlank(message = "TC Kimlik No Alanı Boş Bırakılamaz")
	@Column(name = "nationalityId")
	String nationalityId;
	
	@OneToMany(mappedBy = "candidate")
	private List<Cv> cvs;
	
}
