package test.main;

import test.auto.Car;

public class MainClass08 {
	public static void main(String[] args) {
		//Car type을 담을 수 있는 방 5개짜리 배열객체를 생성해보세요
		Car[] cars= new Car[5];
		//0번방에 Car 객체의 참조값을 대입해 보세요
		//참조값 찾아내는 방법은 new 참조값~
		cars[0]= new Car();
		cars[1]= new Car();
		//Car 객체를 생성해서 참조값을 변수에 담기
		Car c=new Car();
		//2번방과 3번방에 c라는 변수에 있는 참조값을 대입
		cars[2]=c;
		cars[3]=c;
		
		cars[4]=cars[0];
	}
}
