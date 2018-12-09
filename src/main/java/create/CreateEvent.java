package create;

import java.util.ArrayList;
import java.util.Random;

import entity.Event;
import util.ReadFile;

public class CreateEvent{
	private static int id = 0 ;
	private static ArrayList<String> list ;
	private static int list_size ;
	private static Random random ;
	public CreateEvent() {
		list = ReadFile.readFile("Event/nameEvent.txt") ;
		list_size = list.size();
		random = new Random();
	}
	
	/**
	 * Hàm tạo ngẫu nhiên một Event
	 * @return
	 */
	public static Event CreateRandom() {
		Event event = new Event();
		event.setId("event" + String.valueOf(id));
		id++;
		event.setName(list.get(random.nextInt(list_size)) + " lần thứ " + String.valueOf(random.nextInt(100) + 1));
		event.setDescription("Đây là một sự kiện");
		event.setLink("https:/vi.wikipedia.org/" + event.getName().replace(" ", "_") + "/");
		event.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
				+ String.valueOf(random.nextInt(18) + 2000));
		return event;
	}
	
	/**
	 * Hàm tạo nhiều event một lúc
	 * @param max Số lượng Event muốn tạo tối đa
	 * @return
	 */
	public static ArrayList<Event> CreateMultiEvent(int max) {
		ArrayList<Event> events = new ArrayList<Event>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < 20; j++) { // sự kiện lần thứ 1-20
				Event event = new Event();
				event.setId("event" + String.valueOf(id));
				id++;
				event.setName(list.get(i) + " lần thứ " + String.valueOf(j));
				event.setDescription("Đây là một sự kiện");
				event.setLink("https:/vi.wikipedia.org/" + event.getName().replace(" ", "_") + "/");
				event.setDat(String.valueOf(random.nextInt(29)) + "/" + String.valueOf(random.nextInt(12) + 1) + "/"
						+ String.valueOf(random.nextInt(18) + 2000));
				// test
				if (events.size() == max) {
					return events;
				}
				events.add(event);
				System.out.println(event.getId() + " " + event.getName() + " " + event.getDescription() + " "
						+ event.getLink() + " " + event.getDat());
			}
		}
		return events;
	}
	
}
