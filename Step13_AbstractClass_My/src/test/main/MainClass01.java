package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//Weapon w=new Weapon();
		//미완성 메소드가 있기때문에 단독으로 개체 생성 할 수 없음!
		
		//추상 클래스를 상속받은 자식 클래스로 객체 생성
		MyWeapon w1=new MyWeapon();
		//메소드 사용해 보기
		w1.prepare();
		w1.attack();
		
		//추상 클래스 type으로 받을 수도 있다
		//단독 객체 생성은 불가능하지만 data type 역할은 할 수 있음.
		
		Weapon w2=new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
