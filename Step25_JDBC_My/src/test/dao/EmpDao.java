package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {
	//single ton으로 사용할 수 있도록 구조를 잡으세요
	private static EmpDao edao;
	private EmpDao() {}
	public static EmpDao getInstance() {
		if(edao==null) {
			edao=new EmpDao();
		}
		return edao;
	}
	//사원 목록을 리턴해주는 메소드	
	public List<EmpDto> getList(){
		//필요한 지역 변수 
		Connection econn=null;
		PreparedStatement epstmt=null;
		ResultSet rs=null;
		
		List<EmpDto> list=new ArrayList<>();
		try {
			econn=new DBConnect().getConn();
			String sql="SELECT empno,ename,sal,dname, "
					+ "TO_CHAR(hiredate, 'YY\" 년 \"MM\" 월 \"DD\" 일 \"') "
					+ "as hiredate FROM emp,dept WHERE emp.deptno = dept.deptno";
			epstmt=econn.prepareStatement(sql);
			rs=epstmt.executeQuery();
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				Double sal=rs.getDouble("sal");
				String dname=rs.getString("dname");
				String hiredate=rs.getString("hiredate");
				
				EmpDto edto=new EmpDto(empno, ename, sal, dname, hiredate);
				
				list.add(edto);
				
				
				
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(epstmt!=null)epstmt.close();
				if(econn!=null)econn.close();
				
			}catch(Exception e) {}
		}
		return list;
		
	}
}
