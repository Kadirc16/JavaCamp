
public class Company extends Customer {
	/*
	 * Customer classını inheritence ettik. Main de customer da olanları company adı
	 * altında da kullanabiliriz.
	 */
	private String CompanyName;
	private String TaxNumber;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;

	}
}
