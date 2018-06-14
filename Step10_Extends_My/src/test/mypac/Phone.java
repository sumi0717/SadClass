package test.mypac;

//폰클래스
public class Phone {
 /*
  * 아무것도 정의하지 않아도 
  * 기본 default 생성자( public Phone(){} )는 존재함.
  * 단, 다른 생성자가 없을 시에만!
  * 
  * public class Phone extends Object {}
  * extends Object라는 Class 예약어는 
  * 굳이 명시하지 않아도 자동으로 부여됨.
  */
	
	//클래스 안의 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
 
}
