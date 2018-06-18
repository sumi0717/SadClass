package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * String type을 담을 수 있는 ArrayList 객체를 생성해서
		 * 문자열을 3개 저장해 보세요
		 */
		ArrayList<String> msg=new ArrayList<>();
		msg.add("냠냠");
		msg.add("쩝쩝");
		msg.add(new String("꿀꺽"));
		
		
		//person type을 담을 수 있는 ArrayList 객체를 생성해서
		ArrayList<Person> pers=new ArrayList<>();
		
		//person 객체를 3개 저장해보세요
		pers.add(new Person());
		pers.add(new Person());
		Person p=new Person(); //변수에 담아서 변수값으로 전달해도 됨
		pers.add(p);
		
		
	}
}
