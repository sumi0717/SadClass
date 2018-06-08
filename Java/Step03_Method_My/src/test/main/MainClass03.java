package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		MainClass03.printMsg();
		MainClass03.printMsg2("옆에서 들렷어 ^^");
		//전달 받기로 한 정확한 인자 type대로 전달해줘야 함! 
		//string타입을 전달해주기로 했으므로 타입이 맞아야 함!
		printMsg2("티할리자 입니다");
	}
	
	public static void printMsg() {
		System.out.println("메세지를 출력합니다");
	}
	public static void printMsg2(String msg) {
		System.out.println("msg:"+msg);
	}
}
