package iCreditManager;

public abstract class BaseCreditManager implements iCreditManager {

	@Override
	public abstract void Calculate();


	public void Save() {
		System.out.println("Kaydedildi.");
		
		
	}

}
