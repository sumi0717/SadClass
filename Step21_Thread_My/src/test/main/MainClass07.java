package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		// 익명의 inner class를 이용해서 Runnable type 참조값
		// 얻어내기
		Runnable run1=new Runnable() {//익명의 클래스
			@Override
			public void run() {
				System.out.println("새로운 작업 단위임");
			}
		};
		new Thread( run1 ).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("새로운 작업 단위 2!");
			}
		}).start();
	}
}
