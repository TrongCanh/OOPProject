package entity;

public class Entity {
	private String id;
	private String name;
	private String description;
	private String link;
	private String dat;//date and time
	
	public Entity() {
	}
	public Entity(String id, String name, String description, String link,String dat) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.link=link;
		this.dat=dat;
	}
	public Entity(String id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description=description;
	}
	public Entity(String id, String name) {
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDat() {
		return dat;
	}
	public void setDat(String dat) {
		this.dat = dat;
	}
	
}
