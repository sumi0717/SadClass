package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		boolean isRun=true;
		int count=0;
		//반복문 while
		while(isRun) {
			System.out.println("수행됨!");
			count++;
			if(count==10) {//count가 10이면
				//isRun을 false로 바꿔서 반복문 탈출하게 한다
				isRun=false;
			}
		}
		System.out.println("main 메소드가 종료됩니다");
	}
}
