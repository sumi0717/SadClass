package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//생성자의 인자로 OutputStream 객체를 전달해서
		//OutputStreamWriter 객체 생성하기
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		try {
			osw.write("abcd 1234 한글도 출력되네?");
			osw.flush();
			// 방 5개짜리 char[] 객체를 생성해 보세요
			char[] obj=new char[5];
			obj[0]='a';
			obj[1]='b';
			obj[2]='c';
			obj[3]='d';
			obj[4]='e';
			// char[] 객체를 전달해서
			osw.write(obj);
			osw.flush(); //출력하기
			
			System.out.println(); //개행
			
			osw.write(obj,0,3);
			osw.flush();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
