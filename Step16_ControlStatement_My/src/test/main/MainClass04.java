package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		// int 배열
		int[] nums= {10,20,30,40,50};
		
		for(int i=0; i<nums.length; i++) {
			// int 배열의 i번쨰 방 참조
			int tmp=nums[i];
			System.out.println("tmp :"+tmp);
		}
		System.out.println("-- 확장 for문 --");
		//위의 for문을 줄이면 아래처럼 됨
		for(int tmp:nums) {
			System.out.println("tmp:"+tmp);
		}
		
		
	}
}
