package test.mypac;

public class AttackUnit {
	//non static 멤버 필드
	public int energy=100;
	
	//non static 멤버 메소드
	public void attack() {
		System.out.println("공격해요!");
	}
	
	public void attack2() {
		System.out.println("냠냠쩝쩝");
	}
		
	public void defence() {
		System.out.println("방어해요!");
	}
	
	public void move() {
		System.out.println("움직여요!");
	}
}
