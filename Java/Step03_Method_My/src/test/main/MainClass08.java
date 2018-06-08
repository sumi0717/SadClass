package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//method 안에서 만들어지는 변수를 지역변수라고 함.(local variable)
		// main 메쏘드에서 지역 변수는 args, a, b, c, d 4개
		System.out.println("main 메소드가 시작 되었습니다");
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		showSum(a,b);
		showSum(c,d);
	}
	public static void showSum(int num1, int num2) {
		// 쇼썸에서 지역변수는 num1, num2, sum 3개
		int sum=num1+num2;
		System.out.println("두 수의 합:"+sum);
	}
}
