package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;
/*Array ile ilgili problem boyutu,alanı büyütmeye çalıştığımızda bizim onu sıfırlamamız
 * yedeğini almamız gerekiyordu.O yüzden günümüzde arraylerde pek yararlanmayız 
 * onun yerine listelerden koleksiyonlardan (List<Brand> yararlanırız.
 **/

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	// Repository== Dao
//	List<Brand> getAll(); spring jpa bunlardan fazlasını sağlıyor bu kodu silebiliriz.

}
// jparepository concretes kısmını kendisi generic yapıda çalışıp kendisi bellekte hazırlıyor