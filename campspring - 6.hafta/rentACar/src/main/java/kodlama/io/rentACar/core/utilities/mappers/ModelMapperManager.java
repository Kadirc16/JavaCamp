package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
/*her seferinde yeni modelmapper üretilmesini istemiyorum
 *  IOC ye yerleşmesi için Service ekledik.
 *  enjeksiyonu için AllArgsConstructor ekledik. 
 *  bunu yaptığımızda 50 tane üretmesin 1 tane üretsin 
 * */
@Service
@AllArgsConstructor
public class ModelMapperManager implements ModelMapperService{
private ModelMapper modelMapper ;
	
@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;
		//Gevşek mapleme yap id name birsürü alan var ve sadece üçü varsa bunları maple gerisini mapleme
	}

	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
		/*STRICT herşeyi maple %100 doğru olması gerekiyor. bizde böyle bir durum yok 
	Ambiguity = belirsizlik demek belirsizlik olduğu durumlarda bunu (ingore et) görmezden gel 
	*/}

}
