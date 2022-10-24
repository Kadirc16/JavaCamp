
public class Main {

	public static void main(String[] args) {
		int sayi1 = 10 ;
		int sayi2 = 20 ;
		sayi1 = sayi2 ;
		sayi2 = 100 ;
		//değerini atadık.Adresi değil
		System.out.println(sayi1);

		int sayilar1 [] =  {1,2,3};
		int sayilar2 [] =  {10,20,30};
		sayilar1 = sayilar2 ;
		/*arrayde sayilar1 in adresini atadık.
		 */
		sayilar2[0] = 1000;
		System.out.println(sayilar1[0]);

	}

}
