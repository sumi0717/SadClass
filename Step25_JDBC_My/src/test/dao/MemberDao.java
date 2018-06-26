package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Dao => Data Access Object 의 약자
 *  
 *  - 회원 정보에 대해서 SELECT, INSERT, UPDATE, DELETE 작업을
 *    수행할 객체를 생성하기 위한 클래스 정의하기
 *  - Application 전역에서 MemberDao 객체는 
 *    오직 1개만 생성될 수 있도록 설계한다
 *  
 * 
 *  Java Application이 의존하는 핵심 객체는 Dao
 *  Oracle DataBase가 의존하는 핵심 객체는 Dao
 *  Java 어플과, 오라클 데이터베이스 사이의 매개 역할.
 *  Dao가 의존하는 핵심 객체는 Connection!
 */

public class MemberDao {
	//자신의 참조값을 저장할 필드를 private static으로 정의
	private static MemberDao dao;
	//외부에서 객체 생성할 수 없도록 생성자를 private로 정의
	private MemberDao() {}
	//자신의 참조값을 리턴해주는 public static 메소드 정의
	public static MemberDao getInstance() {
		//최초 호출될 때는 dao가 null이므로
		if(dao==null) {
			//객체를 생성해서 static 필드에 저장
			dao=new MemberDao();
		}
		//필드에 있는 참조값을 리턴해주기
		return dao;
	}
	//회원 정보를 저장하는 메소드
	public boolean insert(MemberDto dto) {
		//return, 성공여부가 상관이 없을 때는
		//메소드 유형을 void로 해줘도 상관 없음. 지금은 boolean
		Connection conn=null;
		PreparedStatement pstmt=null;
		// 영향을 받은 row의 갯수를 저장할 지역 변수
		int flag=0; 
		//초기값, row가 하나도 없을 때!
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member (num, name, addr)"
					+"VALUES(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			flag=pstmt.executeUpdate();
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//작업 성공 여부 리턴해주기
		//메소드 유형이 public boolean이기 때문에 필요한 작업
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn=null;
				
		PreparedStatement pstmt=null;
		
		int flag=0; //초기값 설정.
		
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn();
			String sql="UPDATE member SET name=?, addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			//수행하기
			flag=pstmt.executeUpdate();
						
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		//작업 성공 여부 리턴해주기
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		
		
		PreparedStatement pstmt=null;
		
		int flag=0; //초기값
		try {
			//Connection 객체의 참조값 얻어오기
			conn=new DBConnect().getConn(); 
			String sql="UPDATE member SET name=?, addr=? WHERE num=?";
			pstmt=conn.prepareStatement(sql);
						
			pstmt.setInt(1, num);
			
			//수행하기
			flag=pstmt.executeUpdate();
						
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}	

	//회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		//필요한 지역 변수 만들기
		Connection conn=null;
		PreparedStatement pstmt=null; //뭘 하든 필요한 객체!
		ResultSet rs=null;
	//회원 정보를 담을 MemberDto type의 지역변수 미리 만들기
		MemberDto dto=null;
				
		try {
			String sql="SELECT num,name,addr FROM member WHERE num=?";
			// sql문을 수행할 PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql); 
			// ?에 값 바인딩 하기
			pstmt.setInt(1, num);
			//쿼리문 수행하고 결과를 ResultSet으로 받기
			//select는 업데이트 하는게 아니고 읽어오는 것이므로 executeQuery
			rs=pstmt.executeQuery();
			//셀렉트는 1번만 호출하면 되므로 if, while이 아니고!			
			if(rs.next()) {
		
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				dto=new MemberDto(num,name,addr);
				
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
		return dto;
	}
	
	//회원 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		//필요한 지역 변수 만들기
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		//회원 정보를 저장할 List 객체 생성
		List<MemberDto> list=new ArrayList<>();
		
		try{
			String sql="SELECT num,name,addr FROM member"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);

			rs=pstmt.executeQuery(sql);
			while(rs.next()) {
				//커서가 위치한 곳의 회원정보 읽어내기
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				//회원 정보를 MemberDto객체에 담아서
				MemberDto dto=new MemberDto(num,name,addr);
				list.add(dto); //List에 누적시키기
				
				//반복문 돌때마다 MemberDto 객체 1개씩 만들어짐
				//new MemberDto(), new된 객체는 배열에 누적됨.
			}
		}catch(Exception se){
			se.printStackTrace();

		}finally{

			try{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e){}			
		}
		return list;
	}
}	//MemberDAO



