package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		//1. String type을 담을 수 있는 방 5개짜리 배열 객체를 생성
		String[] msg=new String[5];
		//2. 배열에 5개의 방에 각각 다른 문자열 저장하기
		msg[0]= "aa";
		msg[1]= "bb";
		msg[2]= "cc";
		msg[3]= "dd";
		msg[4]= "ee";
		
		//3. 반복문 for를 이용해서 5개의 방에 있는 문자열을 
		//	순서대로 콘솔창에 출력하기
		for(int i=0; i<msg.length; i++) {
			String print=msg[i];
			System.out.println("msg:"+print);
		}
	}
}
