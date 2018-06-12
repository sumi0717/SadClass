package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		//1. test1() 메소드를 호출해 보세요
		MainClass01.test1();
		//2. test2() 메소드를 호출해 보세요
		new MainClass01().test2();
		//static이 붙지 않은 것은 참조값을 얻어내서 .찍어서 호출해야함
	}
	// MainClass01의 static 멤버 메소드
	public static void test1() {
		System.out.println("test1() 호출됨");
	}
	// MainClass01의 일반 (non static) 멤버 메소드
	public void test2() {
		System.out.println("test2() 호출됨");
	}
}
