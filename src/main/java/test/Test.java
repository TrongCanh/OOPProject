package test;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connect.Connect;
import create.CreateCountry;
import create.CreateEvent;
import create.CreateOrganization;
import create.CreatePerSon;
import cypher.MatchNode;
import cypher.Store;
import cypher.StoreEntity;
import cypher.StoreRelationship;
import entity.Country;
import entity.Entity;
import entity.Event;
import entity.Location;
import entity.Organization;
import entity.Person;

public class Test {

	public static void main(String[] args) {
//		Person person1 = new Person("Person1", "Cảnh", "Là Sinh viên", "wikipedia/person/Person1", "3 năm")	;
//		Person person2 = new Person("Person2", "Đạt", "Là Giảng viên", "wikipedia/person/Person2", "13 năm")	;
//		Organization organization1 = new Organization("Organization1", "Samsung", "điện tử", "wikipedia/Organization/Organization1", "30 năm")	;
//		Country country1 = new Country("Country1", "Việt Nam", "Hòa bình", "wikipedia/Country/Country1", "4000 năm")	;
//		StoreEntity se= new StoreEntity();
//		se.store(person1);
//		se.store(person2);
//		se.store(organization1);
//		se.store(country1);
//		StoreRelationship sr= new StoreRelationship();
//		sr.store(person1, person2, "học");
//		sr.store(person1, country1, "là người");
		
        long start = System.currentTimeMillis();
		StoreEntity se= new StoreEntity();
		StoreRelationship sr= new StoreRelationship();
		Store st = new Store();
		for(int i=0;i<1000 ;i++) {
			Person person1 = new Person("Person"+i, "Cảnh"+i, "Là Sinh viên", "wikipedia/person/PersonCanh"+i, "3 năm")	;
			Person person2 = new Person("Person2"+i, "Đạt"+i, "Là Giảng viên", "wikipedia/person/PersonDat"+i, "13 năm")	;
			Organization organization1 = new Organization("Organization1"+i, "Samsung"+i, "điện tử", "wikipedia/Organization/Organization1", "30 năm")	;
			Country country1 = new Country("Country1"+i, "Việt Nam"+i, "Hòa bình", "wikipedia/Country/Country1", "4000 năm")	;
			Country country2 = new Country("Country2"+i, "Lào1"+i, "Hòa bình", "wikipedia/Country/Country1", "4000 năm")	;
			Event event1= new Event("Event1"+i, "Khai trương"+i, "hoành tráng", "wikipedia/Event/Event1", "ngày mai");
			Location location1= new Location("Location1"+i, "Hà Nội"+i, "thủ đô Việt Nam", "wikipedia/Location/Location", "nghìn năm");
			st.store(CreatePerSon.CreateRandom(), "thuộc", CreateOrganization.CreateRandom(), "làm", CreateEvent.CreateRandom(), "tại", CreateCountry.CreateRandom());
//			st.store(person1, "thuộc", organization1, "làm", event1, "tại", country1);
//			se.store(person1);
//			se.store(person2);
//			se.store(organization1);
//			se.store(event1);
//			sr.store(person1, person2, "s");
//			sr.store(person1, event1, "s");
//			sr.store(person1, organization1, "s");
//			sr.store(event1, organization1, "s");
			
		}
		
		
//		String cypher="MATCH (n:Person) RETURN n.description, n.name";
//		Connect conn= new Connect();
//		Connection connect= conn.getConnect();
//		try {
//			PreparedStatement prst= connect.prepareStatement(cypher);
//			ResultSet rs= prst.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString("n.name")+": "+rs.getString("n.description"));
//			}
//		} catch (SQLException e) {
//			System.out.println("Lỗi statement: "+e.getMessage());
//		}
//		MatchNode match= new MatchNode();
//		List<Person> Persons= match.cypherPerson();
//		int i=1;
//		for (Person person : Persons) {
//		
//		System.out.println("i, "+person.getName()+" "+person.getId());
//		i++;
//	}
//	
        long end = System.currentTimeMillis();
        long t = end - start;
        System.out.println("Tổng thời gian: " + t/1000 + " second");

	}

}
