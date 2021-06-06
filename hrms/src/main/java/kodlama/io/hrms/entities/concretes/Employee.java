package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{
	
	@NotBlank(message = "İsim Alanı Boş Bırakılamaz")	
	@Column(name = "first_name")
	String firstName;
	
	@NotBlank(message = "Soyisim Alanı Boş Bırakılamaz")
	@Column(name = "last_name")
	String lastName;
	
}
