package test.main;

public class MainClass01 {
	//main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		/*
		 *  static 예약어가 붙은 메소드를 호출하는 방법
		 *  동일한 클래스의 static에서는 클래스 명을 생략해도 된다
		 *  클래스명.메소드명();
		 *  
		 *  ex)
		 *  MainClass01.a();
		 */
		MainClass01.a();
		b();
		
		System.out.println("main 메소드가 종료(return)됩니다");
	
	}
	
	//a 메소드
	public static void a() {
		System.out.println("a 메소드가 시작 되었습니다");
		
		System.out.println("a 메소드가 종료(return)됩니다");
	}
	
	//b 메소드
	public static void b() {
		System.out.println("b 메소드가 시작되었습니다");
		System.out.println("b 메소드가 종료(return)됩니다");
	}
}
