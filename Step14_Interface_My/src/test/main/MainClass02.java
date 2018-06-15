package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		MyRemocon r1=new MyRemocon();
		Remocon r2=new MyRemocon();
		Object r3=new MyRemocon(); //implements Remocon
		//type 만 object지 객체 자체는 Remocon
		
		useRemocon(r1);
		useRemocon(r2);
		useRemocon((Remocon)r3); 
	}
	// Remocon 인터페이스 type을 인자로 전달받는 메소드
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
