package entity;

public class Location extends Entity{
	
	public Location() {
	}
	public Location(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Location(String id, String name, String description) {
		super(id, name, description);
	}
	public Location(String id, String name) {
		super(id, name);
	}
}
