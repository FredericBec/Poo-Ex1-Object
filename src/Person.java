
public class Person {
	private String name;
	private String firstName;
	private int age;
	private String address;
	Object bornCity;
	
	public Person(String name, String firstName, int age, String address) {
		setName(firstName);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
	}
	

	public Person(String name, String firstName, int age, String address, Object bornCity) {
		super();
		setName(firstName);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
		this.bornCity = bornCity;
	}


	public Person(String name, String firstName, int age) {
		setName(firstName);
		setFirstName(firstName);
		setAge(age);
		setAddress("Unknown");
	}
	
	public Person(String name, String firstName) {
		setName(firstName);
		setFirstName(firstName);
		setAge(0);
		setAddress("Unkown");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println();
	}
	
	public String getBornCityCountry() {
		//Vérification que BornCity est bien un objet City
		if(bornCity instanceof City) {
			//retourne le pays et obligation de cast BornCity pour définir le type
			return ((City) bornCity).getCountry();
		}else {
			return "";
		}
	}
	/*
	@Override
	public String toString() {
		return "Person [name=" + name + ", firstName=" + firstName + ", age=" + age + ", address=" + address + "]" + "BornCity " + BornCity + "]";
	}
	*/
	@Override
	public String toString() {
		return  name + ", " + firstName + ", " + age + " ans, habitant à " + address + ", " + bornCity;
	}
}
