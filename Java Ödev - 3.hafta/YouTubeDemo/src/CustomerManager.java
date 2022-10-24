import iCreditManager.TeacherCreditManager;

public class CustomerManager extends Customer {

		iCreditManager _creditManager;
		Customer _customer;
		public CustomerManager(Customer customer, iCreditManager creditManager) {
			_customer = customer;
			_creditManager = creditManager;
		}

public CustomerManager(Customer customer, TeacherCreditManager teacherCreditManager) {
			
		}

public void Save() {
	System.out.println("Müşteri kaydedildi : " );
}
public void Delete () {
	
	System.out.println("Müşteri silindi : " );
}
public void GiveCredit() {
	
	System.out.println("Kredi verildi");
}
}
