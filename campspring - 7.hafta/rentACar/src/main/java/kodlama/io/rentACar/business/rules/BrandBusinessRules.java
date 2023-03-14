package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BrandBusinessRules {
private BrandRepository brandRepository ;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists"); //Java exception types (araştır)

		}
		
		
	}
	
}
//iş kuralları
/*AllArgsConstructor Ioc de önceden üretilmiş olanı kullanmasını sağlar. 
 * 50 kere üretmesin oradakini kullansın.
 * Service oraya yerleşmesini sağlar (Ioc).
 * */
 