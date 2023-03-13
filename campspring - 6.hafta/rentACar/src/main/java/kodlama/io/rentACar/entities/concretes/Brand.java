package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="brands")
@Getter //get ve set işlemleri lombok kurduğumuz için lombok dan çektik. kendisi oluşturdu. constructorları da öyle
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//yukarıda yazdığımız @ işlemler annotation anotasyon(dipnot gibi) olarak geçer 
	
public class Brand{	
	@Id //veritabanında primary key sin
	@GeneratedValue(strategy= GenerationType.IDENTITY) //sürekli marka ekliyoruz. böyle durumda yeni gelen markayı 1 1 arttır demek için bunu ekledik.
@Column(name="id")
	private int id;
	@Column(name="name")
private String name;
	
	@OneToMany(mappedBy = "brand") //Model nesnesinde brand ile ilişkilendirdik
	List<Model> models;
	
	
	
	
}

/*Brand--> id,name,quantity
GetAllBrandsResponse-->id,name 
mapping branddeki "id" ve "name" i GetAllBrandsResponse a atadık. buna mapping deniyor
object relational mapping - orm 
1 markanın birçok modeli var. Ancak 1 modelin sadece 1 modeli var(One to Many).
Model kısmında ise 1 markanın birçok modeli var.Biz bu modelleri getirmek istiyoruz(ManyToOne).  
*/
