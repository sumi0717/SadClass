package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *  JDBC (Java Database Connectivity) 
 *  
 *  - java 에서의 DataBase 연동 프로그래밍 연습
 *  - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *    위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 
 *    ojdbc6.jar 파일에 들어 있다. 
 */

//Connection a=new DBConnect().getConn();
//는 Connection type id. DBConnect()는 유틸 클래스 객체.
//유틸 클래스 객체를 생성해서 커넥션 타입 아이디를 생성해낼 수 있다

public class MainClass01 {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공!");
		}catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		//필요한 객체를 담을 변수 만들기, 미리 밖에서 만들어 놓기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		/*
		 * 커넥션 개체를 이용해서 얻어내는 값은, 'PreparedStatement' 타입의 참조값
		 * conn.prepareStatement() 의 값을 얻어내려면 커넥션 타입이 있어야한다
		 * 흐름 파악 잘 하기
		 */
			String sql="SELECT num,name,addr FROM member";
			// sql문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql); 
			// 쿼리문을 수행하고 결과를 ResultSet으로 얻어낸다
			rs=pstmt.executeQuery(); //executeQuery()를 해야만 결과셋이 나옴!
			// 반복문 돌면서 ResultSet에 담긴 정보 추출하기
			while(rs.next()) { //cursor 다음에 row가 있으면
				//cursor를 한 칸 내려서 cursor가 위치한 곳의
				//num, name, addr 를 읽어온다
		//ResultSet, rs.next() 란 메소드는, 가상의 cursor가 있다고 가정하고, 
		//cursor 다음에 데이터가 있으면, 실행순서(커서)가 내려오면서
		//true를 반환, 데이터가 없으면 false
		//즉 rs.next()란 메소드는 커서를 next(다음칸)으로 옮기는 메소드라고 생각하면 이해 쉬움
				
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//읽어온 후 원하는 작업하기
				System.out.println(num+"|"+name+"|"+addr);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
