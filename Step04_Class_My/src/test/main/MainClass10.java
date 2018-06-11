package test.main;

import java.util.Random;
import test.mypac.AttackUnit;
import java.util.Scanner;

public class MainClass10 {
	public static void main(String[] args) {
		// 기본 data type
		int num=10;
		boolean isRun=true;
		char ch='A';
		
		// 참조 data type
		Random ran=new Random();
		String name="김구라";
		AttackUnit unit=new AttackUnit();
		Scanner scan=new Scanner(System.in);
		//어떤 객체는 괄호() 안에 인자를 전달해 줘야 만들어짐!
		
		int result=ran.nextInt();
		
		/*
		 * static으로 정의 되어 있으면 new 할 필요가 없음
		 * System.으로 사용하는 것이 예시. 
		 * (static은 클래스 명에 점만 찍어서 사용하면 댐)
		 * 그 외는 new해서 만들어서 하면 댐 
		 */
	}
}
