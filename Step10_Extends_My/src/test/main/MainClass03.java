package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

/*
 *  [ 다형성(Polymorphism) ]
 *  
 *  - java 에서 객체의 참조 값은 다형성을 가질 수 있다.
 *  - 다형성이란 여러가지 type 이 될 수 있다는 의미.
 */
public class MainClass03 {
   public static void main(String[] args) {
	  //SmartPhone 객체의 참조값을 부모 type 변수에 대입하기
	  //p1에 . 찍으면 Object에 정의된 기능만 사용 가능
      Object p1=new SmartPhone();
      //p2에 . 찍으면 Object, Phone에 정의된 기능만 사용 가능
      Phone p2=new SmartPhone();
      //p3에 . 찍으면 Object, Phone, HandPhone에 정의된 기능만 사용 가능
      HandPhone p3=new SmartPhone();
      //SmartPhone 객체의 참조값을 SmartPhone type 변수에 대입하기
      //p4에 . 찍으면 Object, Phone, HandPhone, SmartPhone
      //에 정의된 기능 모두 사용 가능
      SmartPhone p4=new SmartPhone();
      
      
      
   }
}