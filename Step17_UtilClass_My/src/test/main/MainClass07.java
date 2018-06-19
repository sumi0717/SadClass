package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		/*	
		 *  1. MemberDto type을 담을 ArrayList 객체를 생성하고
		 * 
		 *  2. 3명의 회원 정보를 각각 MemberDto 객체에 담아서
		 *  
		 *  3. MemberDto 객체의 참조값을 ArrayList 객체에 저장하기
		 */
		//1.
		List<MemberDto> mem=new ArrayList<>();
		
//		2.
//		MemberDto[] member=new MemberDto[3];
//		member[1]=new MemberDto(1, "만두", "인천");
//		member[2]=new MemberDto(1, "만두2", "인천2");
//		member[3]=new MemberDto(1, "만두3", "인천3");
//		위의 방식은 ArrayList에 들어가는 인자 타입이 아님.
		
		//1번 방법
		MemberDto dto1=new MemberDto(1, "만두", "인천");
		MemberDto dto2=new MemberDto(2, "만두2", "인천2");
		MemberDto dto3=new MemberDto(3, "만두3", "인천3");
		
		mem.add(dto1);
		mem.add(dto2);
		mem.add(dto3);
		
		//2번 방법
		MemberDto dto4=new MemberDto();
		dto4.setNum(4);
		dto4.setName("김구라");
		dto4.setAddr("노량진");
		
		mem.add(dto4);
		
		//참조 연습
		List<MemberDto> a=mem;
		MemberDto b=mem.get(0);
		int c=mem.get(0).getNum();
		String d=mem.get(0).getName();
		String e=mem.get(0).getAddr();
	}
}
