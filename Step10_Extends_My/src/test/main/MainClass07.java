package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		Phone p1=new Phone();
		HandPhone p2=new HandPhone();
		SmartPhone p3=new SmartPhone();
		
		//메소드 호출하면서 변수에 담긴 참조값 전달
		MainClass07.usePhone(p1);
		MainClass07.usePhone(p2);
		MainClass07.usePhone(p3);
		//이미 생성된 객체를 전달하는 거
		
		//메소드 호출하면서 객체를 생성해서 참조값 전달
		MainClass07.usePhone(new Phone());
		MainClass07.usePhone(new HandPhone());
		MainClass07.usePhone(new SmartPhone());
		//호출하면서 객체를 생성하는 거
		
		MainClass07.usePhone(null);
		//실행 순서는 순차적이라서 null이 마지막으로 호출 되면서
		//NullPointerException 오류가 발생하게 됨
	}
	public static void usePhone(Phone p) {
		// Phone p=p1; 같은 폰타입이니까. 대입연산자로 연상하면 이해 쉬움
		// 타입 일치시키고, 구분하는거 굉장히 중요~!
		
		if(p!=null) {
			p.call();
		}//이렇게 하면 null 을 전달해도 오류 나지 않음. 아예 호출되지않게해버림
		
		
	}
}
