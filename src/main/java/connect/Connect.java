package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private static String boltUrl="jdbc:neo4j:bolt://localhost:11001";
	private static String user="neo4j";
	private static String password="123456";
	private static volatile Connection connect = null;  // biến connect đầu tiên và duy nhất sẽ được tạo ra khi getConnect() được gọi lần đầu trong chương trình
	// đặt private connect() để tránh tạo ra nhiều connect gây lãng phí tài nguyên
	private Connect() {	
	}
	
	/**
	 * Hàm lấy biến static connection connect của lớp Connect
	 * Hàm static nên khi dùng chỉ gọi Connect.getConnect() , tránh tạo biến Connection mới
	 * @author ThanhTuan
	 * @return Trả về 1 Connection giúp kết nối Neo4j
	 */
	public static Connection getConnect(){
		// thực hiện kiểm tra connect đã được tạo ra chưa
		if (connect == null ) {
			// đồng bộ hóa tất cả các class connect trong chương trình nhiều luồng đồng thời
			synchronized (Connect.class) {
				if (connect == null) {
					try {
						connect = DriverManager.getConnection(boltUrl, user, password);
					} catch (SQLException e) {
						System.out.println("Lỗi không kết nối được: "+e.getMessage());
					}
				}
			}
		}
		return connect;
	}
	
	/**
	 * Hàm đóng kết nối
	 * @param connect
	 */
	public static void closeConnect(Connection connect) {
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println("Lỗi closeConnect"+e.getMessage());
		}
	}
}
