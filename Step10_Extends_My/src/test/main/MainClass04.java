package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * 객체는(id값은)
	new 할때 생성됨!
	new 외의 것들은 객체 생성된 것 아님.!
 */
public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type
		//변수에 담기
		SmartPhone sPhone=new SmartPhone();
		
		//이미 생성된 객체의 참조값은 부모 type 변수에
		//다시 담을 수 있다
		//자식 타입 변수에 있는 값은, 부모 타입 객체에 얼마든지 들어갈 수 있음
		Object p1=sPhone;
		Phone p2=sPhone;
		HandPhone p3=sPhone;
	}
}
