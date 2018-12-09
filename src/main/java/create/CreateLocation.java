package create;

import java.util.ArrayList;
import java.util.Random;

import entity.Location;
import util.ReadFile;

public class CreateLocation{
	private static int id = 0 ;
	private static ArrayList<String> list ;
	private static int list_size ;
	private static Random random ;
	public CreateLocation() {
		list = ReadFile.readFile("Location/location.txt") ;
		list_size = list.size() ;
		random = new Random() ;
	}
	
	/**
	 * Hàm tạo ngẫu nhiên một Location
	 * @return
	 */
	public Location CreateRandom() {
		Location location = new Location();		
		location.setId("location" + String.valueOf(id));
		id++;
		location.setName(list.get(random.nextInt(list_size)));
		location.setDescription("Đây là một tỉnh của Việt Nam");
		location.setLink("https:/vi.wikipedia.org/" + location.getName().replace(" ", "_"));
		location.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
				+ String.valueOf(random.nextInt(18) + 2000));

		return location ;
	}
	
	/**
	 * Hàm tạo nhiều location
	 * @param max số lượng location tối đa muốn tạo 
	 * @return
	 */
	public ArrayList<Location> CreateMultiLocation(int max) {
		ArrayList<Location> locations = new ArrayList<Location>();		
		int m = max < list_size ? max : list_size ;
		for (int i = 0; i <m; i++) {
			Location location = new Location();
			location.setId("location" + String.valueOf(id));
			id++;
			location.setName(list.get(i));
			location.setDescription("Đây là một tỉnh của Việt Nam");
			location.setLink("https:/vi.wikipedia.org/" + location.getName().replace(" ", "_"));
			location.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
					+ String.valueOf(random.nextInt(18) + 2000));
		}

		return locations ;
	}
	
	
	
}
