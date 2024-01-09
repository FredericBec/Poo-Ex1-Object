
public class TestCity {

	public static void main(String[] args) {
		
		//Création des objets ville + affichage de chaque ville.
		City toulouse = new City("Toulouse", "France", 450_000);
		City bordeaux = new City("Bordeaux", "France", 249_712);
		City boston = new City("Boston", "United States", 654_776);
		City papeete = new City("Papeete", "Tahiti", 26_926);
		City tolede = new City("Tolede", "Spain", 84_282);
		/*
		System.out.println(toulouse.cityName + ", " + toulouse.country + ", " + toulouse.residentNumber);
		System.out.println(bordeaux.cityName + ", " + bordeaux.country + ", " + bordeaux.residentNumber);
		System.out.println(boston.cityName + ", " + boston.country + ", " + boston.residentNumber);
		System.out.println(papeete.cityName + ", " + papeete.country + ", " + papeete.residentNumber);
		System.out.println(tolede.cityName + ", " + tolede.country + ", " + tolede.residentNumber);
		System.out.println();
		System.out.println("-----------------------------------------------\n");
		*/
		//modification de l'argument residentNumber à +20000 habitants de la ville Toulouse
		/* sans setters
		toulouse.residentNumber += 20_000;
		System.out.println(toulouse.cityName + ", " + toulouse.country + ", " + toulouse.residentNumber);
		*/
		
		//Avec setters et getters
		int newResident = 20_000;
		toulouse.setResidentNumber(toulouse.getResidentNumber() + newResident);
		System.out.println(toulouse.getCityName() + ", " + toulouse.getCountry() + ", " + toulouse.getResidentNumber() + "\n");
		//toulouse.residentNumber = -200; impossible avec les variables de City en private.
		
		System.out.println("-----------------------------------------------\n");
		toulouse.setResidentNumber(-200);
		System.out.println(toulouse.getCityName() + ", " + toulouse.getCountry() + ", " + toulouse.getResidentNumber() + "\n");
		
		System.out.println("-----------------------------------------------\n");
		//reduire la population en utilisant les setters et getters
		int reduceResident = 10_000;
		toulouse.setResidentNumber(toulouse.getResidentNumber() - reduceResident);
		System.out.println(toulouse.getCityName() + ", " + toulouse.getCountry() + ", " + toulouse.getResidentNumber() + "\n");
		
		System.out.println("-----------------------------------------------\n");
		//nouvelle ville avec seulement 2 paramètres
		City tulle = new City("Tulle", 14_390);
		System.out.println(tulle.getCityName() + ", " + tulle.getCountry() + ", " + tulle.getResidentNumber());
		//Modification de l'attribut country par les accesseurs
		tulle.setCountry("France");
		System.out.println(tulle.getCityName() + ", " + tulle.getCountry() + ", " + tulle.getResidentNumber());
		
		//avec méthode display
		boston.display();
		papeete.display();
		
		System.out.println("-----------------------------------------------\n");
		
		//On eessaie d'afficher un objet sans méthode et le système n'arrive pas à l'interprété
		System.out.println(toulouse);
		System.out.println(bordeaux);
		//Décompte du nombre d'objet
		int count = City.counter();
		System.out.println("Nombre d'objet : " + count);
		
	}

}
