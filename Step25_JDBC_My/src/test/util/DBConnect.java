package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *  객체를 생성한 후 메소드를 호출하면 Connection 객체를 
 *  리턴하는 클래스 설계하기
 */
public class DBConnect {
	//필드
	private Connection conn;
	//생성자
	public DBConnect() {
		try {
			//오라클 드라이버 로딩 (ojdbc6.jar 있어야 함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//@접속 ip주소:port
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
	}
	//Connection 객체를 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
}
