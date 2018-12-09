package cypher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import connect.Connect;
import entity.Country;
import entity.Entity;
import entity.Event;
import entity.Organization;
import entity.Person;

public class StoreRelationship {
	//truyá»�n vÃ o 2 thá»±c thá»ƒ vÃ  1 má»‘i quan há»‡ ReLationShip
	public void store(Entity e1, Entity e2, String rls) {
		String cypher="MATCH (a: Entity),(b: Entity)\r\n" + 
				"WHERE a.id = '"+e1.getId()+"' AND b.id = '"+e2.getId()+"'\r\n" + 
				"MERGE  (a)-[r:EntityEntity{ name:  '"+rls+"' }]->(b)";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lá»—i statement: "+e.getMessage());
		}
	}
	public void store(Person e1, Person e2, String rls) {
		String cypher="MATCH (a: Person),(b: Person)\r\n" + 
				"WHERE a.id = '"+e1.getId()+"' AND b.id = '"+e2.getId()+"'\r\n" + 
				"MERGE  (a)-[r: PersonPerson{ name:  '"+rls+"' }]->(b)";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lá»—i statement: "+e.getMessage());
		}
	}
	public void store(Person e1, Country e2, String rls) {
		String cypher="MATCH (a: Person),(b: Country)\r\n" + 
				"WHERE a.id = '"+e1.getId()+"' AND b.id = '"+e2.getId()+"'\r\n" + 
				"MERGE  (a)-[r: PersonCountry{ name:  '"+rls+"' }]->(b)";

		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lá»—i statement: "+e.getMessage());
		}
	}
	public void storeERE(Country e1, Country e2, String rls) {
		String cypher="CREATE (le: Country {name:\""+e1.getName()+"\"}),\r\n" + 
				"  (db: Country {name:\""+e2.getName()+"\"}),\r\n" + 
				"  (le)-[:"+rls+"]->(db)";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lá»—i statement: "+e.getMessage());
		}
	}
}
