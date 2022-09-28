package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBS
		System.out.println(product.getName( ) + " eklendi");
	}
	public void Update(Product product) {
		System.out.println(product.getName( ) + " güncellendi");
	}
    public void Delete(Product product) {
    	System.out.println(product.getName( ) + " silindi");
    }
    
	
}
