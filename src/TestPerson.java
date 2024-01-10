import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPerson {

	public static void main(String[] args) {
		
		Person fred = new Person("Bec", "Frédéric", 38, "Muret au sud de Toulouse", new City("Tulle", "France"));
		Person alejandra = new Person("Ramirez", "Alejandra", 38);
		Person obama =  new Person("Obama", "Barack");
		
		System.out.println(fred);
		System.out.println(alejandra);
		System.out.println(obama);
		System.out.println("\n----------------------------------------------\n");
		
		Person macron = new Person("Macron", "Emmanuel", 43, "Elysée à Paris", new City("Amiens", "France"));
		Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("Johnson", "Boris", 56, "Downing street à London", new City("New York", "Etats-unis"));
		Person depardieu = new Person("Depardieu", "Gerard", 72, "Moscou", new City("Châteauroux", "France"));
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hôtel particulier à Paris", new City("New York", "USA"));
		Person lawrence = new Person("Lawrence", "Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));
		
		ArrayList<Person> vipList = new ArrayList<>();
		vipList.add(macron);
		vipList.add(sarkozy);
		vipList.add(johnson);
		vipList.add(depardieu);
		vipList.add(kravitz);
		vipList.add(lawrence);
		
		System.out.println("Liste des personnalités :");
		for(Person vip : vipList) {
			System.out.println(vip);
		}
		
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Liste après notre filtre :");
		for(Person vip : vipList) {
			if(vip.getAddress().contains("Paris") || vip.getBornCityCountry() == "France") {
				System.out.println(vip);
			}
		}
	}

}
