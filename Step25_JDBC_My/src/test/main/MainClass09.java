package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dao.MemberDao;
import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	
	public static void main(String[] args) {
		/*
		 *  MemberDao 객체를 이용해서
		 *  2 번 회원의 정보를 다음과 같이 수정해보세요
		 *  
		 *  이름: 이주환
		 *  주소: 상도동
		 */
		
		//전제 조건, MemberDao 객체의 참조값 얻어오기
		MemberDao dao=MemberDao.getInstance();
		
		//1번째 방법, 전달할 정보 종류가 여러 개면 구분이 어려울 수 있다는 단점이 있음.
		//dao.update(new MemberDto(2, "이주환", "상도동"));
		
		//2번째 방법, 정보의 종류 헷갈리지 않고 많은 정보 전달 가능하다는 장점!
		//default 생성자를 호출해서 객체 생성 후
		MemberDto dto=new MemberDto();
		//setter 메소드를 이용해서 회원정보를 전달하고
		dto.setNum(2);
		dto.setName("이주환");
		dto.setAddr("상도동");
		
		//MemberDao 객체를 이용해서 DB에 수정 반영한다
		dao.update(dto);
		
		
	}
	
}
