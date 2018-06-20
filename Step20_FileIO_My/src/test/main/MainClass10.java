package test.main;

import java.io.FileReader;
import java.io.BufferedReader;


public class MainClass10 {
	public static void main(String[] args) {
		//필요한 지역변수 미리 만들기
		FileReader fr=null;
		BufferedReader br=null;
		//필요한 객체 미리 생성
		try {
			//미리 만든 지역 변수에 참조값 대입
			fr=new FileReader("c:/myFolder/mandu.txt");
			br=new BufferedReader(fr);
			//문자열을 누적시킬 StringBuilder 객체
			StringBuilder builder=new StringBuilder();
			while(true) {
				//반복문 돌면서 한줄씩 읽어들이기
				String line=br.readLine();
				if(line==null) { //다 읽었다면
					break; //반복문 탈출
				}
				//읽은 문자열 누적시키기
				builder.append(line);
				builder.append("\r\n"); //개행 기호
			}
			//누적된 내용 출력하기
			System.out.println(builder.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
			}catch(Exception e) {}
		}
	}
}
