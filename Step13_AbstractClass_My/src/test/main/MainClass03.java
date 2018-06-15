package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		// 만두를 공격하고 싶다면?
		Weapon w1=new Weapon() {

			@Override
			public void attack() {
				System.out.println("만두를 공격해여!");
				
			}
//익명의 local Inner Class (중괄호 열고 닫고는 클래스!!!)
//anonymous Class, 이름은 없지만 웨폰 클래스 상속받았으므로 오버라이드 해야함
		};
		useWeapon(w1);
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
