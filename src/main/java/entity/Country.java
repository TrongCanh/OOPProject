package entity;

public class Country extends Entity {
	
	public Country() {
	}
	public Country(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Country(String id, String name, String description) {
		super(id, name, description);
	}
	public Country(String id, String name) {
		super(id, name);
	}
}
