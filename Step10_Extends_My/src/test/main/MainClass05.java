package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		Object p1=new SmartPhone();
		
		//Phone p2=p1; 
		//부모 type은 자식 type에 자동으로 들어가지 않음
		
		Phone p2=(Phone)p1; //Phone으로 casting 해서 대입
		//ph1만 하면 Object type이지만, 
		//Phone으로 casting 하면 Phone type으로 지정됨
		
		HandPhone p3=(HandPhone)p1;
		SmartPhone p4=(SmartPhone)p1;
		//객체는 1개, 그 참조값이 p1, p2, p3, p4에 담긴 것!
	}
}
