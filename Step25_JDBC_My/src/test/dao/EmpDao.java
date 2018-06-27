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
	// single ton으로 사용할 수 있도록 구조를 잡으세요
	private static EmpDao edao;

	private EmpDao() {
	}

	public static EmpDao getInstance() {
		if (edao == null) { 
			//null인 경우에만 생성되도록 되어 있음.
			//즉 클래스가 비어있는, '최초의 상태에만 new'되고, 
			//계속 같은 id값(객체)을 불러와서 호출되게 코드를 짠 것!
			edao = new EmpDao(); 
			//EmpDao.edao=new EmpDao();와 같음
		}
		return edao;
		// EmpDao 타입을 리턴해주기로 약속이 된 형식이여서 리턴이 꼭 필요.
		// public static void 타입이면 리턴 필요 없음
	}

	// 사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList() {
		// 필요한 지역 변수
		Connection econn = null;
		PreparedStatement epstmt = null;
		ResultSet rs = null;

		List<EmpDto> list = new ArrayList<>(); 
		//new 됐으므로, 객체 생성돼서, id값 생성됨. list != null
		//null은 아니지만 빈 배열 상태. 
		try {
			//Connection 객체의 참조값 얻어오기
			econn = new DBConnect().getConn();
			StringBuilder builder=new StringBuilder();
			builder.append("SELECT empno,ename,sal,dname, ");
			builder.append("TO_CHAR(hiredate, 'YY\" 년 \"MM\" 월 \"DD\" 일 \"') ");
			builder.append("as hiredate FROM emp,dept");
			builder.append(" WHERE emp.deptno = dept.deptno");
			builder.append(" ORDER BY empno ASC");
			// StringBuilder에 누적시킨 다음에, sql문 쓰지 않고, preparedStatement 객체에 바로 넣는 방법도 있다. 
			
			//실행할 sql문
			/* String sql="SELECT empno, ename, sla, dname, hiredate"
			 * 			+ " FROM emp,dept"
			 * 			+ " WHERE emp.deptno=dept.deptno" 두 테이블을 묶어주는 조인 정보!
			 * 			+ " ORDER BY empno ASC"; 순서대로 정렬!
//			 */
//			String sql = "SELECT empno,ename,sal,dname, " + "TO_CHAR(hiredate, 'YY\" 년 \"MM\" 월 \"DD\" 일 \"') "
//												// 역슬래시는, 따옴표를 특별한 문자열로 보지 않고, 그냥 따옴표 자체로 취급하기 위한 기호
//					+ "as hiredate FROM emp,dept" + " WHERE emp.deptno = dept.deptno" + " ORDER BY empno ASC";
			//PreparedStatement 객체의 참조값 얻어내기
			epstmt = econn.prepareStatement(builder.toString()); 
			//StringBuilder 누적된 문자열 string으로 바꿔서 객체에 바로 넣기.
			//SELECT 문을 수행하고 결과를 ResultSet으로 얻어낸다
			rs = epstmt.executeQuery();
			//반복문 돌면서 EmpDto 객체에 사원 정보를 담아서 배열에 누적시킴
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Double sal = rs.getDouble("sal");
				String dname = rs.getString("dname");
				String hiredate = rs.getString("hiredate");

				EmpDto edto = new EmpDto(empno, ename, sal, dname, hiredate);

				list.add(edto);

			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (epstmt != null)
					epstmt.close();
				if (econn != null)
					econn.close();

			} catch (Exception e) {
			}
		}
		return list;

	}
}
