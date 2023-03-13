package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	private String name;

}
/*Her istekte ayrı request response oluşturmalıyız.
 * entity i taşırsak yamalı bohça olur .
 * Önce create oluşturmak marka istek bana name gönderir 
 * id gönderemez onu db oluşturuyor.
*/
