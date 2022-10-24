package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager ();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
		
/*customerManager.databaseManager = new OracleDatabaseManager(); 
 * (customerManager ın databasemanagerı oracle dır. )üstünde newlediğimiz
 * customerManager abstract çağırıyordu. Abstractlarda newleme olmaz ve bir değer yok
 * burada oracle kullanacağımızı belirtip onun getCustomers ını çektik.
 * 
 * 
 * SOLİD yazılım geliştirme prensipleri
 * open close prenciple = açıklık kapalılık prensibi bir sisteme yeni bir özellik getirildiğinde
 * mevcuttaki hiçbir kodu değiştiremezsin. Bir yerlerde kodu değiştiriyorsan arıza var demektir.
 * 
 * Configuration değiştirilebilir (new MySqlDatabaseManager kısmı).
 * */
		
	}

}
