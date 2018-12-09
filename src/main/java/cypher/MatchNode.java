package cypher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.Connect;
import entity.Person;

public class MatchNode {
	public List<Person> cypherPerson() {
		List<Person> personList= new ArrayList<Person>();
		String cypher="MATCH (n:Person) RETURN n.id, n.name, n.description, n.link,n.dat LIMIT 25";
		try {
			PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
			ResultSet rs= prst.executeQuery();
			while(rs.next()) {
				Person person = new Person(rs.getString("n.id"), rs.getString("n.name"),
						rs.getString("n.description"), rs.getString("n.link"), rs.getString("n.dat"));
				personList.add(person);
//				System.out.println(rs.getString("n.id")+"  "+rs.getString("n.name")+
//						" "+rs.getString("n.description")+" "+rs.getString("n.link")
//						+"  "+rs.getString("n.dat"));
			}
		} catch (SQLException e) {
			System.out.println("Lỗi statement: "+e.getMessage());
		}
		return personList;
	}
}
