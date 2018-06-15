package test.main;

public class MainClass01 {
//class 안에 field, method, static field, static method,
//constructor 를 정의할 수 있음
// 내부 class에 한해서 static이라는 예약어를 붙일 수 있다.
	
	//필드
	public int num=10;
	//static 필드
	public static int num2=20;
	
	//static main 메소드
	public static void main(String[] args) {
		//int result=this.num;// 일반 int 필드 참조
		//static 메소드에서 this는 말이 안됨, 일반 필드 참조불가능
		
		int result2=MainClass01.num2; //static int 필드 참조가능
		
		//내부 클래스로 객체 생성가능
		Gura g=new Gura();
	}
	//내부 클래스 정의하기 | 내부 클래스는 static 예약어 붙어야함
	public static class Gura{
		
	}
}
