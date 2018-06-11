package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		//String type을 담을 수 있는 방 5개짜리 배열객체 생성해서
		//참조값을 변수에 담기
		//5개의 방에는 null이 들어있다
		String[] names=new String[5];
		//0번방에 String type 대입
		names[0]="김구라";
		//1번방에 String type 대입
		names[1]="해골";
		//2번방에 String type 대입
		names[2]="원숭이";
		//3번방에 String type 대입
		names[3]="흠냐";
		//4번방에 String type 대입
		names[4]="쿨쿨";
		//5번방에 String type 대입
		names[5]="냠냠";
		
		//방의 크기 참조
		int size=names.length; //5
	}
}
