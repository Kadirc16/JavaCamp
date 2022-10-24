package interfaces;

public class Main {

	public static void main(String[] args) {
		/*
		 * interfaceler implements edilir. 1 class birden fazla interface i implements
		 * edebilir. newlenmezler imza taşılar.
		 */
		//ICustomerDal customerDal = new OracleCustomerDal();
//İnterfaceler onu implemente eden classın referansını tutabilir.
	CustomerManager customerManager =new CustomerManager (new OracleCustomerDal());
	
	customerManager.add();
	}

}
