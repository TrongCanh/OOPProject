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

public class StoreEntity {
	
		public void store(Entity entity) {
			String cypher="merge  (n:Entity { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Country entity) {
			String cypher="merge (n:Entity:Country { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Event entity) {
			String cypher="merge (n:Entity:Event { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Location entity) {
			String cypher="merge (n:Entity:Location { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Organization entity) {
			String cypher="merge (n:Entity:Organization { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Person entity) {
			String cypher="merge (n:Entity:Person { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
		public void store(Time entity) {
			String cypher="merge (n:Entity:Time { name: '"+entity.getName()+
					"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
					+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
			try {
				PreparedStatement prst= Connect.getConnect().prepareStatement(cypher);
				prst.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("Lỗi statement: "+e.getMessage());
			}
		}
}

