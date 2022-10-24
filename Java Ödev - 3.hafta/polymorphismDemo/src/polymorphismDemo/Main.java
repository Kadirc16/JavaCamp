package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*EmailLogger logger = new EmailLogger();
	logger.Log("Log mesajı");
	
		BaseLogger[] loggers= new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
	for (BaseLogger logger : loggers) {
		logger.Log("Log mesajı");
	}*/
		//int [] sayilar = new int [] {1,2,3,};
		/*--Polymorhism--
		 *  birden çok yere kayıt yapmak mesajı iletmek gibi sistemlerde kullanılır. 
		 *Plug and Play tak çalıştır
		 *üstteki arrayden birini çıkartabilir veya yeni bir class oluşturup ekleyebiliriz. BaseLogger ı inheritance olarak kullandık diğerlerini extends yaptık
		 *diğerleri mainde BaseLogger ı array içinde kullanamaz ancak BaseLogger ana class olarak diğerlerini kendi içinde barındırabilir. */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	
	}

}
