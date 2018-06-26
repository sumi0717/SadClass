package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.util.DBConnect;

/*
 *  JDBC (Java Database Connectivity) 
 *  
 *  - java 에서의 DataBase 연동 프로그래밍 연습
 *  - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *    위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 
 *    ojdbc6.jar 파일에 들어 있다. 
 */

public class MainClass07 {
	public static void main(String[] args) {
		
		// [ member 테이블에 delete 수행하기 ]
		
		//삭제할 회원의 정보
		int num=2;
		//필요한 객체를 담을 변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
			
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn(); 
			//ㄴ 길게 코딩할 필요없이 따로 클래스&패키지에 코딩 해두고 임포트, new해서 객체 생성하면 편함!
			String sql="DELETE FROM member WHERE num=?";
			// sql문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql); 
			// ?에 값 바인딩 하기
			pstmt.setInt(1, num);
			int flag= pstmt.executeUpdate();
			if(flag>0) {
				System.out.println(flag+" 개의 row 삭제!");
			}else {
				System.out.println("삭제된 row 없음");
			}
						
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
