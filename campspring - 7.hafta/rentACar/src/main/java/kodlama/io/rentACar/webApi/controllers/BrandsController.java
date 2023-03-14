package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

//Api isimlendirmelerinde genellikle çoğul kullanılır.
/*restfull yapılar için olduğunu bizim buna söylememiz gerek...
 * --(@RestController)-- 
 * spring framework derlediğinde çalıştığında kimde restcontroller var bakıyor
 * bunda erişim noktası old anlıyor.
 * @RequestMapping adresleme  */

@RestController // annotation bilgilendirme ifadesi
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;
 // git parametrelerine bak demek (alttaki constructorın)
	
	//örn. www.kodlama.io/api/brands/getAll
	@GetMapping()//burayı /getAll ile çağır
public List<GetAllBrandsResponse> getAll(){
	return brandService.getAll();
}
	@GetMapping("/{id}")//süslü parantez git bunu path den al
	public GetByIdBrandResponse getById(@PathVariable int id){
		return brandService.getById(id);
		
	}
	@PostMapping() //eklemeler için
	@ResponseStatus(code=HttpStatus.CREATED)
	//httpstatuslerden post sırf 201 döndürsün diye yazdık
	public void add(@RequestBody() @Valid CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	@PutMapping
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
		
		this.brandService.update(updateBrandRequest);
		
	}
		@DeleteMapping("/{id}")
	public void delete(@PathVariable int id ) {
		this.brandService.delete(id);
		
	}
}
/*SoftDelete veri hiçbir zaman silinmesi tercih edilmez onun yerine
*silinmiş gibi yapılıp pasif e getirilir. Request kısmında görülmez.
*yani kayıtta IsDeleted alanına true değeri yollanır.
*
*@PathVariable 
**/