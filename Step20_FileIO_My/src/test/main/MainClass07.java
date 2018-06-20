package test.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//필요한 지역 변수 미리 만들기
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			//file에서 문자열을 읽어들일 FileReader 객체 생성
			fr=new FileReader("c:/myFolder/mandu.txt");
			br=new BufferedReader(fr);
			while(true) {
				//BufferedReader 객체를 이용해서 한줄 읽어들이기
				String line=br.readLine();
				if(line == null) {//더이상 읽을게 없으면 반복문 탈출!
					break; //탈출 조건, 만약 line이 null이면 루프 끝내기!
				}
				System.out.println(line);
			}
				
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {//예외가 발생하든 안하든 반드시 실행되는 메소드!
			//예외 발생이 없어도 중요한 마무리 작업은 꼭 해주는게 좋음.
			//이런 마무리 작업은 finally에서 해줌.
			//fr.close(); //try안에서 선언한 지역변수.
			//br.close(); 
			//특정 블럭 안에서 선언한 지역변수는, 해당 블럭 안에서만 사용(참조) 가능.
			//따라서 필요한 지역 변수를 미리 만들어 두면, 다른 블럭에서도 사용 가능!
			try {
				//null이 아닐 때, close 메소드(마무리) 호출 | 좀 더 견고한 코드.
				if(fr!=null) {fr.close(); } 
				if(br!=null)br.close(); //2가지 방법 모두 가능
			}catch(IOException ie) {}
			//작업할게 없으면 괄호 여닫고 문법만 맞춰도 됨
			
		}
	}
}
