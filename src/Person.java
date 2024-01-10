
public class Person {
	private String name;
	private String firstName;
	private int age;
	private String address;
	Object BornCity;
	
	public Person(String name, String firstName, int age, String address) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}
	

	public Person(String name, String firstName, int age, String address, Object bornCity) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		BornCity = bornCity;
	}


	public Person(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = "unknow";
	}
	
	public Person(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
		this.age = 0;
		this.address = "unknow";
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
		if(BornCity instanceof City) {
			return ((City) BornCity).getCountry();
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
		return  name + ", " + firstName + ", " + age + "ans, habitant à " + address + ", " + BornCity;
	}
}
