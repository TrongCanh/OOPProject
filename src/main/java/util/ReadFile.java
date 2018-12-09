package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	// để private để không thằng nào tạo được nó , tránh lãng phí tài nguyên
	private ReadFile() {
	}
	// để static để dùng hàm mà không cần tạo
	/**
	 * 
	 * @param name_file là đường dẫn đến file tính từ thư mục src/main/java/text/
	 * @return Trả vềm một ArrayList<String>
	 */
	public static ArrayList<String> readFile(String name_file){
		ArrayList<String> list_line = new ArrayList<String>() ;
		try {
			String path_file = "D:/OopProject/src/main/java/text/" + name_file ;
			FileReader file = new FileReader(path_file) ;
			BufferedReader fileReader = new BufferedReader(file) ;
			String line ;
			while ((line = fileReader.readLine()) != null) {
				String string = line ;
				list_line.add(string) ;	
			}
			fileReader.close();
						
		} catch (FileNotFoundException e) {
			System.out.println("lỗi không tìm thấy file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("lỗi đọc file");
			e.printStackTrace();
		}
		
		return list_line ;
	}
}
