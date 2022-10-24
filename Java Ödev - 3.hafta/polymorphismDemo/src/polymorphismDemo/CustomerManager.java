package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	/*aşağıdaki comment te newlemek yerine bu şekilde temel nesne ile çalışarak da 
	 * hepsini burada kullanabiliriz ve ilerde oluşabilecek sorunlara önlem almış
	 * oluruz.
	 * */ 
	public CustomerManager(BaseLogger logger) {
		this.logger = logger ;
		
	}
	public void add() {
		System.out.println("Müşteri eklendi : " );
		this.logger.log("Log mesajı");
		/*DatabaseLogger logger= new DatabaseLogger();
		logger.Log("Log mesajı");
		ilerde yönetici artık database e loglamayı kaldırıyoruz bundan sonra database
		e loglama yapacağız dediğinde bu kodları bütün sistemden silmek lazım.
		Newlemek her zaman iyi değildir.
		Böyle bağımlı sistemler yapmak yerine
		tek tek silmek yazılımcıya ekstra bir zahmete yol açar.
		*/
	}

}
