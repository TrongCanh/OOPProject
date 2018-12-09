package create;

import java.util.ArrayList;
import java.util.Random;

import entity.Time;

public class CreateTime{
	
	/**
	 * hàm tạo một Time ngẫu nhiên
	 * @return
	 */
	public static Time CreateRandom() {
		Time time = new Time();
		Random random = new Random() ;
		time.setName(String.valueOf(random.nextInt(28)+1)+"/"+String.valueOf(random.nextInt(12)+1)+"/"+String.valueOf(random.nextInt(50)+1970));
		return time ;
		
	}
	/**
	 * Hàm tạo nhiều Time một lúc trong 50 năm
	 * @return định dạng dd/mm/yyyy
	 */
	public ArrayList<Time> CreateMultiTime() {
		ArrayList<Time> list = new ArrayList<Time>();
		for (int i = 0; i < 28; i++) {
			for (int j = 0; j < 12; j++) {
				for (int j2 = 0; j2 <= 50; j2++) {
					Time time = new Time();
					time.setName(String.valueOf(i+1)+"/"+String.valueOf(j+1)+"/"+String.valueOf(j2+1970));
					list.add(time);
					
				}
			}
		}
		return list ;
		
	}
}
