package staticDemo;
/*Bir ürünü kaydederken veya güncellerken , ürünün kurallara uygun olup olmadığını bulmak için kullanırız.
 * ! işareti değilse anlamı taşır. isEmpty değilse yani boş değilse kod çalışır.
 * */
public class ProductValidator {
	static {
		System.out.println("Static yapıcı block çalıştı.");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
		/*class ismi ile aynı yapıcı blok productManagerda newlediğimiz için 
		 * şu an çalışıyor. Üst kısımda static oluşturduğumuz için artık newlemeden de çalışır.
		 *--Java ile # farkı--
		 *C# da yapıcı blok staticte de çalışır.
		 *Ana classı C# da static yaparsak çalışır ancak java da static olamıyor.
		 *Ama inner class olarak çalıştırabiliriz.
	*/
		}
public static boolean isValid(Product product) {
	if (product.price>0 && !product.name.isEmpty()) {
		return true ;
		
	}
	else {
		return false;
	}
}
public void bisey() {
	/*isValid static old. için class ismi.isValid olarak çağrılabilir.
	 * Ancak void bisey kullanabilmek için newlememiz lazım.
	 * */
}
//inner Class
//bir temel class içinde bölümlendirebilecek classlar olarak kullanabiliriz.
public static class BaskaBirClass{
public static void Sil() {
	
}}
}
