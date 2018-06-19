package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass08 {
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
//				
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
		
		//3. mem에 들어있는 회원정보를 for 문을 이용해서
		//   순서대로 콘솔창에 출력해보세요
		
		for(int i=0; i<mem.size(); i++) {
			MemberDto tmp=mem.get(i);
			
			int c=mem.get(i).getNum();
			String d=mem.get(i).getName();
			String e=mem.get(i).getAddr();
			
			//1
			System.out.println("번호:"+c+" 이름:"+d+" 주소:"+e);
			//2
			System.out.println("번호:"+tmp.getNum()+
					"이름:"+tmp.getName()+"주소:"+tmp.getAddr());
		}
		System.out.println("--- 확장 for 문 ---");
		for(MemberDto tmp:mem) {
			System.out.println("번호:"+tmp.getNum()+
				" 이름:"+tmp.getName()+" 주소:"+tmp.getAddr());
		}
	}
}
