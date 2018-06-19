package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 *  [ Exception 처리 문법 ]
 *  
 *  try{
 *  	Exception이 발생할 가능성이 있는 코드 블럭
 *  	.
 *  	.
 *  }catch(Exception type 변수명){
 *  	Exception이 발생했을 때 실행할 코드 블럭
 *  }catch(Exception type2 변수명){
 *  	코드 블럭
 *  }finally{
 *  	예의 발생과 상관없이 실행이 보장되는 블럭
 *  }
 */

public class MainClass04 {
	public static void main(String[] args) {
		//키보드로부터 입력받을 Scanner 객체
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("나눌 수 입력:");
			int num1=scan.nextInt();
			System.out.println("나누어지는 수 입력:");
			int num2=scan.nextInt();
			//num2 를 num1으로 나눈 몫
			int mog=num2/num1;
			//num2를 num1으로 나눈 나머지
			int na=num2%num1;
			
			System.out.println(num2+" 를 "+num1+" 으로 나눈 결과");
			System.out.println("몫:"+mog+" 나머지:"+na);
		}catch(Exception e) {//종류별 말고 뭉뚱그려 처리하려면 익셉션!
			//모든 Exception은 여기서 처리가 된다
			//Exception은 모든 Exception의 부모 type
			System.out.println("기타 Exception 발생");
			e.printStackTrace();
		}finally {
			//예외발생과 상관없이 실행이 보장되는 블럭
			//보통 여기에서 마무리 작업을 한다
			System.out.println("마무리 작업을 합니다");
		}
		
		System.out.println("main 메소드가 종료됩니다");	
	}
}
