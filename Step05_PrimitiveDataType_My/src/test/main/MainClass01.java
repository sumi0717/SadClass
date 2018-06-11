package test.main;
/*
 * [기본 자료형]
 * 
 * 1. 논리형 (boolean)
 * -가질 수 있는 값의 범위 : true, false 두 가지 값을 가질 수 있다
 * -만드는 방법 : true, false를 직접 써주거나 비교 연산
 * 혹은 논리 연산의 결과로 얻어낼 수 있다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isGreater=10>1;
		
		if(isGreater) {
			System.out.println("커요!");
		}
		
		//논리 연산의 결과로 얻어진 boolean type 데이터를 변수에 담기
		boolean result = true || false;
		
		System.out.println("main 메소드가 종료됩니다");
	}
}
