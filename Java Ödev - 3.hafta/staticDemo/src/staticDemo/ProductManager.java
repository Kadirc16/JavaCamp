package staticDemo;

public class ProductManager {
public void add(Product product) {
	// bir method u static yaptığımızda class ismiyle (ProductValidator.isValid) direkt çağrılır. Newlemeden bu şekilde kullanılabilir.
	if(ProductValidator.isValid(product)) {
	System.out.println("Eklendi.");
	}
	else {
		System.out.println("Ürün bilgileri geçersizdir.");
	}
	

}
}
