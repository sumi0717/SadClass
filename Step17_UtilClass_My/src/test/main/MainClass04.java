package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//Car 객체를 저장할 수 있는 ArrayList 객체 생성해서
		List<Car> cars=new ArrayList<>();
		/*
		 * ArrayList 객체는 앞으로 List로 받자!
		 * 
		 * ArrayList는 List 인터페이스를 구현해서 생긴것이므로,
			List 인터페이스 타입을 받을 수 있음.
			인터페이스 타입에 자주 쓰이는 기능이 모여잇어서
			주로 List 인터페이스로 객체를 받거나 생성함.

		 */
		
		//Car 객체를 3개 담아 보세요
		cars.add(new Car());
		cars.add(new Car());
		Car a=new Car();
		cars.add(a);
		
		//반복문 돌면서 배열에 있는 Car 객체를 하나씩 참조해서
		// .drive()메소드 호출하기
		//1번 방법
		for(int i=0; i<cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();			
		}
		//2번 방법
		System.out.println("-------확장 for 문 사용-------");
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
