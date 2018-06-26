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

public class MainClass06 {
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
		
		// [ member 테이블에 delete 수행하기 ]
		
		//삭제할 회원의 정보
		int num=2;
		
		//필요한 객체를 담을 변수 만들기, 미리 밖에서 만들어 놓기
		PreparedStatement pstmt=null; //뭘 하든 필요한 객체!
	
		try {
			String sql="DELETE FROM member WHERE num=?";
			// sql문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql); 
			// ?에 값 바인딩 하기
			
			pstmt.setInt(1, num);
			/*
			 *  .executeUpdate() 메소드는 int를 리턴해준다
			 *  
			 *  영향을 받은 row의 갯수를 리턴해준다
			 *  
			 *  - 추가된 row의 갯수
			 *  - 수정된 row의 갯수
			 *  - 삭제된 row의 갯수
			 *  
			 *  따라서 리턴해주는 값이 0보다 큰지 확인하면
			 *  작업의 성공 여부를 알 수 있다
			 *  
			 *  예)
			 *  
			 *  int result=pstmt.executeUpdate();
			 *  if(result>0){
			 *  	//성공
			 *  	
			 *  }else{
			 *  	//실패
			 *  
			 *  }
			 */
						
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
