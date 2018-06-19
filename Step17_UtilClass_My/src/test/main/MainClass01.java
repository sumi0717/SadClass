package test.main;

import java.util.ArrayList;
/*
 *  [ ArrayList ]
 *  
 *  - 가변 배열이다
 *  - 기본 data type은 저장할 수 없고 참조값(id)만 저장할 수 있다
 *  - Generic 클래스를 지정하지 않으면 Object가 Generic 클래스로
 *    지정된다
 *  - 데이터 저장 : .add(참조값)
 *  - 데이터 참조 : .get(인덱스)
 *  - 사이즈 참조 : .size()
 *  - 데이터 삭제 : .remove(인덱스)
 *  - 데이터 모두 삭제 : .clear()
 *  - Serializable, List 인터페이스 등을 구현했다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//Object type을 저장할 수 있는 가변 배열
		ArrayList list1=new ArrayList<>();
		//Object type을 저장할 수 있는 가변 배열
		ArrayList<Object> list2=new ArrayList<>();
		//정수를 저장할 수 있는 가변 배열, <>안엔 객체형으로 넣어야함.
		//int -> Integer
		ArrayList<Integer> list3=new ArrayList<>();
		//실수를 저장할 수 있는 가변 배열
		ArrayList<Double> list4=new ArrayList<>();
		//문자열을 저장할 수 있는 가변 배열
		ArrayList<String> list5=new ArrayList<>();
		
		list5.add("히히히히히");
	
		System.out.println(list5);
	}
}
