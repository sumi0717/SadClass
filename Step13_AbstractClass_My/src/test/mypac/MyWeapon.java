package test.mypac;

public class MyWeapon extends Weapon{
	
	//추상 클래스에 정의된 추상 메소드는 반드시 오버라이드 해야한다
	@Override
	public void attack() {
		System.out.println("내 맘대루 공격해용");
		
	}

}
