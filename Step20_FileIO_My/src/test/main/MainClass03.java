package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  텍스트 파일에 문자열 출력하는 예제
 */
public class MainClass03 {
	public static void main(String[] args) {
		File file1=new File("c:/myFolder/mandu.txt");
		
		try {
			//File 객체를 생성자의 인자로 전달해서 
			//FileWriter 객체 생성하기
			FileWriter fw=new FileWriter(file1);
			fw.write("만두만두\r\n");
			fw.write("부아가 치미는 만두\r\n");
			fw.write("이 구역의 만두\r\n");
			fw.flush();
			fw.close();//모두 기록했으면 닫아줘야 한다
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("파일에 문자열을 기록했습니다");
	}
}
