package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
	
	
	@Bean
public ModelMapper getModelMapper() {
	return new ModelMapper();

	}
	
}
/*rent a car uygulaması yapıyoruz basitten başlayarak
 * Brand--> Marka
 * Car-->Araba
 * concretes somut veritabanında karşılığı olan---soyut abstract
 * ModelMapper i üreten kendi belleğe üretmez sen üretiyorsun bean ile ioc ye ekler
 * */
