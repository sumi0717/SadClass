package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		boolean isRun=true;
		int count=0;
		//반복문 while
		while(true) {
			System.out.println("수행됨!");
			count++;
			if(count==10) {
				break; //반복문 탈출
			}
		}
		System.out.println("main 메소드가 종료됩니다");
	}
}
