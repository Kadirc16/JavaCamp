package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
	TarimKrediManager tarimkredimanager = new TarimKrediManager();
	
	KrediUI krediUI= new KrediUI();
	krediUI.KrediHesapla (new AskerKrediManager());

	}

}
//inheritance(extends) bir classta sadece bir class ı extends yapabilir.
