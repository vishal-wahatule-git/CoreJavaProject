package hasARelationship;

public class Address {

	private String city;
	
	private int zipCodde;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCodde() {
		return zipCodde;
	}

	public void setZipCodde(int zipCodde) {
		this.zipCodde = zipCodde;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCodde=" + zipCodde + "]";
	}
	
	
}
