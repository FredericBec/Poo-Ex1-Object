
public class Person {
	private String name;
	private String firstName;
	private int age;
	private String address;
	
	public Person(String name, String firstName, int age, String address) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", firstName=" + firstName + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
