package entity;

public class Organization extends Entity {
	public Organization() {
	}
	public Organization(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Organization(String id, String name, String description) {
		super(id, name, description);
	}
	public Organization(String id, String name) {
		super(id, name);
	}
}
