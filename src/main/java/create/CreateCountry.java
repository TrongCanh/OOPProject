package create;

import java.util.ArrayList;
import java.util.Random;

import entity.Country;
import util.ReadFile;


public class CreateCountry  {
	private static int id = 0 ;
	private static ArrayList<String> list ;
	private static int list_size ;
	private static Random random ;
	
	public CreateCountry() {
		list = ReadFile.readFile("Country/country.txt") ;
		list_size =list.size();
		random = new Random();
	}
	
	/**
	 * hàm tạo ngẫu nhiên một country
	 * @return
	 */
	public static Country CreateRandom() {
		Country country = new Country();
		ArrayList<String> list = ReadFile.readFile("Country/country.txt");
		country.setId("country" + String.valueOf(id));
		id++;
		country.setName(list.get(random.nextInt(list_size)));
		country.setDescription("Đây là một quốc gia có chủ quyền");
		country.setLink("https:/vi.wikipedia.org/" + country.getName().replace(" ", "_"));
		country.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
				+ String.valueOf(random.nextInt(18) + 2000));

		return country;
	}
	/**
	 * Hàm tạo nhiều country
	 * @param max số lượng country tối đa
	 * @return
	 */
	public static ArrayList<Country> CreateMultiCountry(int max) {
		ArrayList<Country> countries = new ArrayList<Country>();
		int m = max < list_size ? max : list_size ;
		for (int i = 0; i < m; i++) {
			Country  country = new Country() ;
			country.setId("country"+String.valueOf(id));
			id++ ;
			country.setName(list.get(i)); // đặt tạm là 1
			country.setDescription("Đây là một quốc gia có chủ quyền");
			country.setLink("https:/vi.wikipedia.org/" + country.getName().replace(" ", "_"));
			country.setDat(String.valueOf(random.nextInt(29))+"/"+String.valueOf(random.nextInt(12)+1)+"/"+String.valueOf(random.nextInt(18)+2000));
			countries.add(country);
			// test
			System.out.println(country.getId() + " " + country.getName()+" " + country.getDescription()+" "+country.getLink()+" "+country.getDat());
		}
			return countries ;
	}
	
}
