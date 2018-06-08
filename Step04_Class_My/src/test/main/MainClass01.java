package test.main;
// test.mypac 패키지에 있는 MyUtil 클래스 import 하기
// 다른 패키지에 있는 클래스는 import 해야 사용할 수 있다
import test.mypac.MyUtil;

/*
 * [ 클래스의 용도 ]
 * 
 * 1. static 멤버를 메모리에 올리는 기능
 * 2. 객체의 설계도 역할
 * 3. data type 역할 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// MyUtil 클래스의 version 이라는 필드에 있는 값을 
		// 참조해서 a라는 이름의 지역 변수에 담기
		int a=MyUtil.version;
		//My Util 클래스의 clean() 메소드 호출하기
		MyUtil.clean();
		
	}
}
