package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		//참조 데이터 type 선언과 동시에 값 대입하기
		String myName="김구라";
		
		//참조 데이터 type 선언 후 나중에 값 대입하기
		String yourName;
		yourName="원숭이";
		
		//참조 데이터 type이 들어갈 수 있는 빈 공간 만들기
		String ourName=null;
		
		//빈 공간에 참조값 대입하기
		ourName="에이콘";
		
	}
}
