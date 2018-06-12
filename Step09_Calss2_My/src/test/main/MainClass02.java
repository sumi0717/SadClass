package test.main;

import test.mypac.Acorn;

public class MainClass02 {
	public static void main(String[] args) {
		// Acorn 클래스를 이용해서 객체를 생성한 후 참조값을 변수에 담기
		Acorn a=new Acorn(); 
		// 호출된 자리는 acorn type의 참조값으로 바뀜.
		//branch라는 필드에 값 대입하기
		a.branch="종로 지점";
		//메소드 호출하기
		a.makeDeveloper();
		
		Acorn b=new Acorn();
		b.branch="강남 지점";
		b.makeDeveloper();
		
/*  클래스에 new 하는것은 heap 영역에 실체화(객체화) 시키는것.
	객체는 field와 method로 만들어짐. 필드와 메소드는, 동일한 클래스로 찍어내서 같은 형상을 하고 있게됨.
	field는 참조/method는 호출!
	외부에서 field를 참조하고 싶으면 해당 키값을 알면 됨.
	(ex) 
	id값(대입연산자).branch;
	id값(대입연산자).클래스();

	그 객체엔 키값이 들어감,
	호출되면 대입연산자엔 키값(id)이 호출되게 됨.!

	객체 안에서 자기 자신의 참조값을 가리키는 예약어는 this.
		 * 
		 */
	}
}
