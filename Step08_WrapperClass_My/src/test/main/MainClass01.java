package test.main;
/*
 * [기본 data type의 참조 data type]
 * 
 * - 때로는 기본 data type을 참조 data type에 포장(wrap)
 * 	해서 사용해야 할 때가 있다
 * - 그럴 때 사용하는 클래스가 Wrapper class이다
 * 
 * byte    : Byte
 * short   : Short
 * int     : Integer
 * long    : Long
 * 
 * float   : Float
 * double  : Double
 * 
 * boolean : Boolean
 * 
 * char    : character
 *   
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		//기본 data type 변수 num1
		int num1=10;
		//참조 data type 변수 num2
		Integer num2=20;
		
		//자유롭게 산술연산 가능
		int result=num1+num2;
		int result2=num1*num2;
		Integer result3=num2/num1;
		
		System.out.println("result:"+result);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
	}
}
