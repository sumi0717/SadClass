package test.main;

// YourUtil 클래스 import 
//(YourUtil 클래스를 사용하기 위해선 임포트 해야함)
import test.mypac.YourUtil;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  YourUtil 클래스의 company 필드에 있는 값을
		 *  a라는 이름의 지역변수에 담아 보세요
		 */
		String a=YourUtil.company;
		// YourUtil 클래스의 volumnUp() 메소드를 호출해 보세요
		YourUtil.volumnUp();
	}
}
