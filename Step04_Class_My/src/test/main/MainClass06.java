package test.main;

import test.mypac.AttackUnit;
public class MainClass06 {
	public static void main(String[] args) {
		//1. AttackUnit type 의 참조값을 담을 변수 만들기 (null)
		AttackUnit unit=null;
		//2. 위에서 만든 변수에 AttackUnit 객체를 생성해서 참조값 담기
		unit=new AttackUnit();
		//3. move() 메소드 호출하기
		unit.move();
		//4. energy 라는 필드에 저장된 값을 a라는 이름의 지역변수에 담기
		//a라는 이름의 지역변수에 담아보세요
		int a=unit.energy;
		//5. energy라는 필드에 50을 대입해보세요
		unit.energy=50;
		
	}
}
