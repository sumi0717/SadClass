package test.mypac;
/*
 * 클래스 안에 클래스 정의할 수 있다.
 * 클래스 안에 정의된 내부 클래스 타입을 타임으로 참조할 수 있다.
 */
public class Bakery {
	// Bread 라는 내부 클래스
	public class Bread{
		public void eat() {
			System.out.println("빵을 냠냠");
		}
	}
	// Cake 라는 내부 클래스
	public class Cake{
		public void eat() {
			System.out.println("케이크를 냠냠");
		}
	}
	// Bread 객체를 리턴해주는 메소드
	public Bread getBread() {
		return new Bread();
	}
	// Cake 객체를 리턴해주는 메소드
	public Cake getCake() {
		return new Cake();
	}
}
