package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		//java의 기본 반복문
		for(int i=0; i<10; i++) {
			System.out.println("i:"+i);
		}//i 변수는 메인메소드에서는 쓸수 없고, for 문 안에서만 쓸 수 있다.
		
		int[] nums= {10,20,30,40,50};
		for(int i=0; i<nums.length; i++) {
			int tmp=nums[i];
			System.out.println("tmp:"+tmp);
		}
	}
}
