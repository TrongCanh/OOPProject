package entity;

public class Time extends Entity {
	public Time() {
	}
	public Time(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Time(String id, String name, String description) {
		super(id, name, description);
	}
	public Time(String id, String name) {
		super(id, name);
	}
}
