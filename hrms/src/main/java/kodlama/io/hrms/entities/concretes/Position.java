package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "positions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobpostings"})
public class Position {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	int id;
	
	@NotBlank(message = "Pozisyon Alanı Boş Bırakılamaz")
	@Column(name = "position_name")
	String positionName;
	
	@OneToMany(mappedBy = "position")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Jobposting> jobPostings;
}
