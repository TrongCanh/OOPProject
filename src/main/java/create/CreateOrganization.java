package create;

import java.util.ArrayList;
import java.util.Random;
import entity.Organization;
import util.ReadFile;

public class CreateOrganization {
	private static int id = 0 ;
	private static ArrayList<String> listFields ;
	private static int sizeField ;
	private static ArrayList<String> listNames ;
	private static int sizeName ;
	private static Random random ;
	public CreateOrganization() {
		listFields = ReadFile.readFile("Organization/fields.txt");
		sizeField = listFields.size();
		listNames = ReadFile.readFile("Organization/nameOrgan.txt");
		sizeName = listNames.size() ;
		 random = new Random();
	}
	
	/**
	 * Hàm tạo ngẫu nhiên một Organization
	 * @return
	 */
	public static Organization CreateRandom() {
		Organization organization = new Organization();
		// biến field lưu lĩnh vực của tổ chức
		String field ;
		field = listFields.get(random.nextInt(sizeField));
		organization.setName("Công ty " + field + " " + listNames.get(random.nextInt(sizeName)));
		organization.setId("organ" + String.valueOf(id));
		id++;
		organization.setDescription("Đây là một công ty hoạt động trong lĩnh vực " + field);
		organization.setLink("https:/vi.wikipedia.org/" + organization.getName().replace(" ", "_"));
		organization.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
				+ String.valueOf(random.nextInt(18) + 2000));

		return organization ;
	}
	
	/**
	 * Hàm tạo nhiều Organization một lúc
	 * @param max  , sô lượng tối đa muốn tạo
	 * @return
	 */
	public static ArrayList<Organization> CreateMultiOrganization(int max) {
		ArrayList<Organization> organizations = new ArrayList<Organization>() ;
		// biến field lưu lĩnh vực của tổ chức
		String field ;
		for (int i = 0; i < sizeField ; i++) {
			for (int j = 0; j < sizeName; j++) {
				Organization organization = new Organization();
				//biến a lưu lĩnh vực của tổ chức
				field = listFields.get(i) ;
				organization.setName("Công ty "+field+" "+listNames.get(j));
				organization.setId("organ"+String.valueOf(id));
				id++;
				organization.setDescription("Đây là một công ty hoạt động trong lĩnh vực "+field);
				organization.setLink( "https:/vi.wikipedia.org/" + organization.getName().replace(" ", "_"));
				organization.setDat(String.valueOf(random.nextInt(29))+"/"+String.valueOf(random.nextInt(12)+1)+"/"+String.valueOf(random.nextInt(18)+2000));
				if (organizations.size()== max) {
					return organizations ;
				}
				organizations.add(organization);
				//test
				System.out.println(organization.getId()+" "+organization.getName()+" "+organization.getDescription()+" "+organization.getLink()+" "+organization.getDat());
			}
		}
		return organizations ;
	}
	
}
