package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service // Bu sınıf bir Business nesnesidir.
@AllArgsConstructor
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	private BrandBusinessRules brandBusinessRules;

	@Autowired // springin yeni versionlarında yazmasak da autowired olarak çalışıyor.

	@Override
	public List<GetAllBrandsResponse> getAll() {

		List<Brand> brands = brandRepository.findAll();
		/*
		 * List<GetAllBrandsResponse> brandsResponse = new
		 * ArrayList<GetAllBrandsResponse>(); for (Brand brand : brands) {
		 * GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
		 * responseItem.setId(brand.getId()); responseItem.setName(brand.getName());
		 * brandsResponse.add(responseItem);
		 * 
		 * // for döngüsü ile ana listeyi dolaşıp boş bir listeye set edip oradan get
		 * yapıyor. Veritabanını kullanıcıya açmıyoruz.
		 * 
		 * alt tarafta bunun yerine daha kısa halini ilerde yeni kayıtlarda sorun
		 * oluşturmaması için yazmış olduk dto ya yeni bir şey eklediğimizde buraları
		 * değiştirmemiz gerekmez.otomatik eklenmiş olur
		 */

		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());

		/*
		 * stream api nin map i farkı elimizde bir liste varsa onların her birini tek
		 * tek dolaşıyor. for eachin yaptığını yapıyor. brand-> burası isimlendirme her
		 * bir brand için mapleme yap. forResponse in mapini kullanarak dönüşüm
		 * gerçekleştir. Collect bunları topla şu tipe (toList) çevir
		 */
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {

		this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

		this.brandRepository.save(brand);

		/*
		 * Brand brand = new Brand(); brand.setName(createBrandRequest.getName());
		 * this.brandRepository.save(brand); bir alan old. için burada işimiz kolaydı
		 * ancak çok newlemede yaz da yaz burası çok karmaşıklaşır. bu yüzden
		 * modelmapper forRequest arkaplanda newliyor. createbrandrequest kaynağından
		 * brand a aynı olanları aktarıyor createBrandRequest'e gidip fieldlara göre
		 * Brande map ediyor
		 */

	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
		// burada id old. için buradaki save update yapar. add deki insert yapar.
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		;

	}

}
//IOC kutu sürekli newlemek yerine git bellekte bir şeyi newle isteyene o referansı ver.
//bunları ıoc ye eklemek için @Service yazıyoruz. Bellekte tekrarlığı önlüyoruz

//(2022) Java Yazılım Geliştirici Yetiştirme Kampı 6: Spring Boot 3 1:35.05 DK 