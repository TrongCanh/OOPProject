package cypher;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Connect;

public class CreateNode {
	public static void main(String[] args) {
		String cypher="CREATE (le:Person {name:\"Canh\"}),\r\n" + 
				"  (db:Person {name:\"Phuc\"}),\r\n" + 
				"  (le)-[:KNOWS {since:1768}]->(db)\r\n" + 
				"RETURN le, db";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lỗi statement: "+e.getMessage());
		}
		
	}	
}
