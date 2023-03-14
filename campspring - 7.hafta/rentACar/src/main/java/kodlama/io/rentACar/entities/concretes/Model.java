package kodlama.io.rentACar.entities.concretes;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="models")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@ManyToOne
	@JoinColumn(name="brand_id")//db de bu tablomuz için tablo koyacak ve brand ile bağlantı kuracak
	private Brand brand;

	
	@OneToMany(mappedBy = "model") //car classındaki model ile ilişkilendirildi.
private List<Car> cars;


}
/*primary keyi (@Id) id ye verdik 1 tabloda 1 pk olabilir.
 *  diğer durumda Unique Constrain kullanılmalı bu veri tekrar edemez olmalı*/
 