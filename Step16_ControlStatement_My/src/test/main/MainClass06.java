package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		// Car 객체를 담을 수 있는 방 3개짜리 배열객체 생성
		Car[] cars=new Car[3];
		// 각각의 방에 Car 객체를 생성해서 참조값 저장
		cars[0]=new Car("소나타");
		cars[1]=new Car("프라이드");
		cars[2]=new Car("그랜져");
		
		for(int i=0; i<cars.length; i++) {
			// i 번째 Car 객체의 참조값 얻어와서
			Car tmp=cars[i];
			// 메소드 호출해보기
			tmp.drive();
		}
		System.out.println("---확장 for 문---");
		for(Car tmp:cars) { 
			//콜론의 우측은 참조값, type은 맨 우측에 반드시 명시.
			//for 문에 선언할 것을 그대로 우측에 선언하면
			//알아서 방의 사이즈만큼 반복됨. for문 확장 form.
			tmp.drive();
		}
	}
}
