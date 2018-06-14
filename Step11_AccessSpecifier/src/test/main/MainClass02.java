package test.main;

import test.mypac.MemberDto;

public interface MainClass02 {
	public static void main(String[] args) {
		//MEmberDto
		MemberDto mem1=new MemberDto();
		//회원 한명의 정보 담기
		mem1.setNum(1);
		mem1.setName("김구라");
		mem1.setAddr("노량진");
		int num=mem1.getNum();
		String name=mem1.getName();
		String addr=mem1.getAddr();
	}
}
