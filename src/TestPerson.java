
public class TestPerson {

	public static void main(String[] args) {
		
		Person fred = new Person("Bec", "Frédéric", 38, "Muret au sud de Toulouse");
		Person alejandra = new Person("Ramirez", "Alejandra", 38);
		Person obama =  new Person("Obama", "Barack");
		
		System.out.println(fred);
		System.out.println(alejandra);
		System.out.println(obama);
		
		//Person fred = new Person("Bec", "Frédéric", 38, "Muret au sud de Toulouse", new City("Tulle", "France"));

	}

}
