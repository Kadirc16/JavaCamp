package classes;

public class Main {

	public static void main(String[] args) {
		// CustomerManager türünde bir örnek oluşturduk
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		/*
		 * customerManager = customerManager2; kısmında cmyi cm2 nin heap ine götürdük.
		 * cm nin heap i garbagecollector (gc) ye gider silinir. cm nin new kısmını da
		 * kendi heap kısmına gitmediği için silebiliriz.
		 * 
		 * class lar reference type dir . bir classı kullanabilmek için onun new lenmiş
		 * olması gerekiyor. değişken tanımladığımızda bellekte ona alan oluşturmuş
		 * oluyoruz 2 alan var. stack(CustomerManager customerManager)=heap(new
		 * CustomerManager) stack heap 101 cm --->{ } cm yi çalıştırdığında bunun (heap
		 * kısmında) add , remove vs çalışıyor 102 cm2---->{ } cm2 yi çalıştırdığında
		 * bunun (heap kısmında) add , remove vs çalışıyor
		 */

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value değer tiplidir
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		// [] array dizi işareti
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// sayilar2 nin 0 ıncı elemanı sayilar1 e götürdük onu da 10 olarak tanımladık
		// sonuç 10

	}

}
