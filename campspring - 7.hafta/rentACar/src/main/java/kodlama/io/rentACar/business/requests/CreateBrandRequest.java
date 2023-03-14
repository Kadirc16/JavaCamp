package kodlama.io.rentACar.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	@NotNull //javax.validation.constraints list yazıp bu anotasyonları araştır.
	@NotBlank
	@Size(min = 3, max = 20)
	private String name;

}
/*Her istekte ayrı request response oluşturmalıyız.
 * entity i taşırsak yamalı bohça olur .
 * Önce create oluşturmak marka istek bana name gönderir 
 * id gönderemez onu db oluşturuyor.
 *
*/
