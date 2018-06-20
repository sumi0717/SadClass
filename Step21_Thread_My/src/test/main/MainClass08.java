package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		Thread t1=new Thread() {
			// Thread 클래스를 상속받은 익명의 클래스를 이용해서
			// Thread type의 참조값 얻어내기
			@Override
			public void run() {
				System.out.println("새로운 작업 단위임!");
			}
		};
		//스레드 시작 시키기
		t1.start();
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("새로운 작업 단위 2~~~~");
			}
		}.start();
	}
}
