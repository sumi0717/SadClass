package test.mypac;
/*
 * [상속(Extends)]
 * 
 * -클래스를 정의하면서 특정 클래스를 상속 받으려면
 *  extends 예약어를 이용해서 상속 받을 수 있다
 *  
 *  extends 상속받을 클래스명
 *  
 */

public class HandPhone extends Phone{
	//다른 클래스를 상속받고 싶으면 extends 뒤에 그 상속박을 클래스명 명시
	//extends Phone은 
	//Phone 클래스를 확장해서 또 새로운 기능을 만들겠다는 의미.
	
	//이동중에 전화를 거는 메소드
	public void mobileCall() {
		System.out.println("이동 중 전화를 걸어요");
	}
	//사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어용");
	}
	
}
