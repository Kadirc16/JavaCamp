package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
	private int id;
	private String name;
	
}
/*Create yaparken id lazım değil db kendisi oluşturuyor.
 *  Ancak Update yaparken neyi güncellediğimizi görmek isteriz.
 *   Id bulundurmak lazım.
 * */
 