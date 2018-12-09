package cypher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Connect;
import entity.Country;
import entity.Entity;
import entity.Event;
import entity.Location;
import entity.Organization;
import entity.Person;

public class Store {
	public void store(Person e1, String e1e2, Organization e2, String e2e3, Event e3, String e3e4, Country e4) {
		String cypher="Create (e1: Person {name: '"+e1.getName()+"', description: '"+e1.getDescription()+
				"', id:'"+e1.getId()+"', link:'"+e1.getLink()+"',dat:'"+e1.getDat()+"'}),\r\n" + 
				"(e2:Organization {name: '"+e2.getName()+"', description: '"+e2.getDescription()+
				"', id:'"+e2.getId()+"', link:'"+e2.getLink()+"',dat:'"+e2.getDat()+"'}),\r\n" + 
				"(e3:Event {name: '"+e3.getName()+"', description: '"+e3.getDescription()+
				"', id:'"+e3.getId()+"', link:'"+e3.getLink()+"',dat:'"+e3.getDat()+"'}),\r\n" + 
				"(e4:Country {name: '"+e4.getName()+"', description: '"+e4.getDescription()+
				"', id:'"+e4.getId()+"', link:'"+e4.getLink()+"',dat:'"+e4.getDat()+"'}),\r\n" + 
				"(e1)-[e1e2:"+e1e2+"]->(e2),(e2)-[e2e3:"+e2e3+"]->(e3),(e3)-[e3e4:"+e3e4+"]->(e4)";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lỗi statement: "+e.getMessage());
		}
	}
	
}
