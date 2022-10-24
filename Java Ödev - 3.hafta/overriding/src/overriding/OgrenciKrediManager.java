package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar *1.10 ;
	}
	/* --Overriding--
	 * OgrenciKrediManager a BaseKrediManagerdeki hesaplayı aynı hesaplayı getirdiğimizde
	OgrenciKrediManagerdeki hesapla BaseKrediManagerdeki hesaplayı ezip kendi
	hesaplasını çalıştırıyor. bu class ı ana class a BaseKrediManager üzerinden 
	getirdiğimiz takdirde kendi hesaplasını çalıştıracak.Buna --overridable-- denir.
	Biz aksini belirtmediğimiz sürece miras aldığı sınıfı ezebilir.
	BaseKrediManager da public final double oluşturursak diğer sınıflar ezemiyor.
	*/

}
