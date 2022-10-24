package interfaces;
//Dal = Data Acces Layer
public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("My sql eklendi.");
		
	}

}
