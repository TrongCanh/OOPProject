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
import entity.Time;

public class StoreRelationshiptest {

	public static void main(String[] args) {
		String cypher="MATCH (a:Person),(b:Person)\r\n" + 
				"WHERE a.name = 'Cáº£nh' AND b.name = 'Ä�áº¡t'\r\n" + 
				"CREATE (a)-[r:RELTYPE { name: a.name + '<->' + b.name }]->(b)\r\n" + 
				"RETURN type(r), r.name";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lá»—i statement: "+e.getMessage());
		}
		
	}	
}
