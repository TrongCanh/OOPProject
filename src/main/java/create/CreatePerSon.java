package create;

import java.util.ArrayList;
import java.util.Random;

import entity.Person;
import util.ReadFile;

public class CreatePerSon {
	private static int id = 0 ;
	private static ArrayList<String> listFirst;
	private static int sizeF ;
	private static ArrayList<String> listMiddle ;
	private static int sizeM ;
	private static ArrayList<String> listLast ;
	private static int sizeL;
	private static ArrayList<String> listDescription ;
	private static int sizeD;
	private static Random random ;
	
	public CreatePerSon() {
		listFirst = ReadFile.readFile("Person/firstName.txt") ;
		sizeF = listFirst.size();
		listMiddle = ReadFile.readFile("Person/middleName.txt") ;
		sizeM = listMiddle.size();
		listLast = ReadFile.readFile("Person/lastName.txt") ;
		sizeL = listLast.size();
		listDescription = ReadFile.readFile("Person/description.txt") ;
		sizeD = listDescription.size();
		random = new Random() ;
	}
	public static Person CreateRandom() {
		Person person = new Person() ;
		person.setId("person" + String.valueOf(id));
		id++;
		person.setName(listFirst.get(random.nextInt(sizeF)) + " " + listMiddle.get(random.nextInt(sizeM)) + " "
				+ listLast.get(random.nextInt(sizeL)));
		person.setDescription(listDescription.get(random.nextInt(sizeD)));
		person.setLink("https:/vi.wikipedia.org/" + person.getName().replace(" ", "_") + "/");
		person.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
				+ String.valueOf(random.nextInt(18) + 2000));
		return person ;
	}
	
	public static ArrayList<Person> CreateMultiPerson(int max) {
		ArrayList<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < max ; i++) {
			Person person = new Person() ;
			person.setId("person" + String.valueOf(id));
			id++;
			person.setName(listFirst.get(random.nextInt(sizeF)) + " " + listMiddle.get(random.nextInt(sizeM)) + " "
					+ listLast.get(random.nextInt(sizeL)));
			person.setDescription(listDescription.get(random.nextInt(sizeD)));
			person.setLink("https:/vi.wikipedia.org/" + person.getName().replace(" ", "_") + "/");
			person.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
					+ String.valueOf(random.nextInt(18) + 2000));
			persons.add(person);
			// test
		//	System.out.println(person.getId() + " " + person.getName() + " " + person.getDescription() + " "
		//			+ person.getLink() + " " + person.getDat());
		}		
		return persons ;
	}
}
