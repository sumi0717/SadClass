package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//0번방 참조
		int num1=nums.get(0);
		//2번방 참조
		Integer num3=nums.get(1);
		//Integer는 int로 받아도 되고, Integer로 받아도 됨!
		
		//2번방 삭제
		nums.remove(2);
		
		//방의 크기 참조
		int size=nums.size();
		
		//모든 방 삭제
		nums.clear();
	}
}
