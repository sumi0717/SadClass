package test.mypac;

public class Gun {
	//필드
	public Bullet bullet;
	
	//생성자
	public Gun(Bullet bullet) {
		this.bullet=bullet;
	}

	//총을 발사하는 메소드
	public void fire() {
		if(this.bullet==null) {
			System.out.println("Bullet 객체가 없어요");
			return;
		}
		System.out.println("빠빵!!");
	}
}
