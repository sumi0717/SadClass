package test.main;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("c:/myFolder/monkey.txt");
			fw.write("원숭이\r\n");
			fw.write("엉덩이는 빨개");
			fw.flush();
			fw.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("monkey.txt에 문자열을 기록했습니다");
	}
}
