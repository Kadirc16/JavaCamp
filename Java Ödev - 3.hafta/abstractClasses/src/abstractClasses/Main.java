package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		/*
		 * Abstract sınıflar asla newlenemez. 
		 * Olur da newlersen kendi operasyonlarını da(override) getirir.
		 *  herkesin ayrı ayrı doldurması gereken zorunlu operasyonlar
		 * ekleyebilmek için kullanırız.
		 */

		GameCalculator gameCalculator = new WomanGameCalculator();
		/*GameCalculator üzerinden diğer bir sınıfı çağırdığımızda abstractlar 
		override edilmez.Base(burada GameCalculator) referans tutucu olarak kullanılıyor.
		tek başına bir anlam ifade etmiyor.
		*/
	}

}
