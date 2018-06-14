package test.main;

//import 가능
import test.mypac.Radio;

public class MainClass01 {
	public static void main(String[] args) {
		//생성자 호출 가능( public Radio(){} )
		Radio r= new Radio();
		//메소드 호출 가능( public void channelUp(){} )
		r.channelUp();
		//필드 접근 가능( public int volumn )
		//자바에서는 필드를 웬만하면 가리는게 일반적. private로 해둠.
		//필드는 객체가 정상 동작하기 위한 부품들을 담고 있어서 가려둠
		int result=r.volumn;
	}
}
