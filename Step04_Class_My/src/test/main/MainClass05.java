package test.main;

import test.mypac.AttackUnit;

public class MainClass05 {
	/*
	 * AttackUnit 클래스로 객체를 3개 생성해서
	 * 참조값을 각각 다른 지역변수에 담고
	 * attack() 메소드를 한번씩 호출해 보세요
	 */
	public static void main(String[] args) {
		AttackUnit unit1=new AttackUnit();
		
		unit1.attack();
		
		AttackUnit unit2=new AttackUnit();
		unit2.attack();
		
		AttackUnit unit3=new AttackUnit();
		unit3.attack();
	}
	
	
}
