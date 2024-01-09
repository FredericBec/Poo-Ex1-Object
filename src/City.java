
public class City {
	
	//Variables en visibilité package friendly
	/*
	String cityName;
	String country;
	int residentNumber;
	*/
	
	private String cityName;
	private String country;
	private int residentNumber;
	private static int count;
	
	public City(String cityName, String country, int residentNumber) {
		this.cityName = cityName;
		this.country = country;
		this.residentNumber = residentNumber;
		count++;		
	}

	public City(String cityName, int residentNumber) {
		this.cityName = cityName;
		this.country = "unknow";
		this.residentNumber = residentNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getResidentNumber() {
		return residentNumber;
	}

	public void setResidentNumber(int residentNumber) {
		if(residentNumber < 0) {
			System.out.println("Le nombre d'habitants ne peut être négatif");
		}else {			
			this.residentNumber = residentNumber;
		}
	}
	
	public void display() {
		System.out.println("ville de " + this.cityName 
							+ " en " + this.country 
							+ " ayant " + this.residentNumber + " habitants");
	}
	
	public static int counter() {
		return count;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", country=" + country + ", residentNumber=" + residentNumber + "]";
	}
	
}
