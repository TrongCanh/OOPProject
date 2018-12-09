package entity;

public class Event extends Entity{
	
	public Event() {
	}
	public Event(String id, String name, String description, String link, String dat) {
		super(id, name, description, link, dat);
	}
	public Event(String id, String name, String description) {
		super(id, name, description);
	}
	public Event(String id, String name) {
		super(id, name);
	}
}
