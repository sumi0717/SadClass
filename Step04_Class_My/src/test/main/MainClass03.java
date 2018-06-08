package test.main;

import test.mypac.AttackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  AttackUnit 클래스를 이용해서 객체를 생성하고
		 *  참조값(id) 값에 . 찍어서 attack() 메소드 호출하기
		 *  
		 *  
		 */
		int a=10;
		boolean b=true;
		String c="kimgura";
		// 데이터 타입 명시 반드시 해줘야 함
		AttackUnit unit= new AttackUnit();
		/*
		 * new AttackUnit().attack();
		 *  new 할때마다 여러개 찍어내짐. 필요한만큼 만들어짐!
		 *  1회용 메소드.
		 */
		// 레퍼런스 타입이라서 변수명대로 타입 명시해주게 됨.
		unit.attack();
		unit.attack();
		unit.attack();
		unit.attack();
		
		// AttackUnit 클래스로 새로운 객체를 생성해서
		// attack() 메소드를 3번 호출해보세요
		AttackUnit unit2= new AttackUnit();
		unit2.attack2();
		unit2.attack2();
		unit2.attack2();
	}
}