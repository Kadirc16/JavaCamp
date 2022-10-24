package staticDemo;

public class Main {

	public static void main(String[] args) {
		/*--static--
		 *  yapılar örn biz maini başka bir yerden çağırmaya çalışırsak ve orada buradaki 
		 * main operasyonunu çağırırsak hiçbir şekilde newleyerek buna ulaşamayız .
		 *  Onun yerine main.main diyerek ulaşabiliriz.
		 *  Genellikle static kullanım alanlarından bir tanesi uygulamaların içerisinde
		 *   utility dediğimiz araç yazarken kullanırız.
		 *   static yapılarda newlediğimizde bellekten uygulama sıfırlanana kadar atılmıyor.
		 *  
		 * */
			ProductManager manager = new ProductManager();
			Product product= new Product ();
			product.price = 11;
			product.name= "Mouse";
			
			manager.add(product);

			//DatabaseHelper.Crud.Connection.createConnection();
			//Inner Class Örneği (ana class normal, içinde static class oluşturulmuş vaziyette)
			//Best Practiceler önermez. 1 class sadece 1 iş yaparak parçalamak sektörde daha anlaşılır ve kullanılır.
	}
	

}
