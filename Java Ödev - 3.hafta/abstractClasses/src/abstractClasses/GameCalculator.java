package abstractClasses;

public abstract class GameCalculator {
public abstract void hesapla();
	

public final void gameOver () {
	System.out.println("Oyun bitti");
	/*--Abstract--
	 * Bir sınıfın abstract olabilmesi için abstract imzası ile beslenmesi gerekiyor.
	 * operasyonun abstract olabilmesi için yine abstract imzası kullanılması gerekiyor.
	 * Abstract bir sınıfta illa abstract bir operasyon olmak zorunda değil.
	 * Başka bir sınıfta kullanıldığında o sınıfın kendisi değerlerini atamasını sağlar.
	 * ana class ı ezmek yerine de kullanılır (tabi herkesin yoğurt yemesi farklı )
	 * abstract lar ınterfaceler gibi implement edilmek zorundadır.
	 * --Final--
	 * Diğer sınıflarda aynı parametreyi yazıp farklı bir değer yazdığımızda normalde
	 * ana classı ezip kendi parametresini çalıştırır. Ancak final ı eklediğimizde 
	 * diğer sınıfların ana class içinde bulunan parametreyi ezmesi engellenir.
	 * */
}
}
