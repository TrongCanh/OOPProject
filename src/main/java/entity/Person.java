package entity;

public class Person extends Entity {
	public Person() {
	}
	public Person(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Person(String id, String name, String description) {
		super(id, name, description);
	}
	public Person(String id, String name) {
		super(id, name);
	}
}
