import iCreditManager.MilitaryCreditManager;
import iCreditManager.TeacherCreditManager;

public class Main {
//yazılım geliştirme prensipleri SOLID--
	public static void main(String[] args) {
		/*CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		Customer customer = new Customer(); // instance oluşturmak,örnegini oluşturmak

		customer.setId(1);
		customer.setFirstName("Kadir");
		customer.setLastName("Celep");
		customer.setCity("Tokat");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save(customer);
		customerManager.Delete(customer);

		Company company = new Company();
		company.setTaxNumber("123456");
		company.setCompanyName("Tunç Holding");
		company.setId(99);
		// yalnızca 1 tane inheritance yapılabilir.
		CustomerManager customerManager2 = new CustomerManager(new Person());
		Person person = new Person();
		person.setNationalIdentity("65415");
		person.setFirstName("Agah");
		person.setLastName("Beyoglu");

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		--ABSTRACT SINIFLAR NEWLENEMEZ
*/
		CustomerManager customerManager= new CustomerManager(new Customer (), new TeacherCreditManager());
		customerManager.GiveCredit();
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		teacherCreditManager.Save();
		MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
		militaryCreditManager.Calculate();
	}


}

