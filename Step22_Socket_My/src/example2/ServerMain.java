package example2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		
		ServerSocket serverSocket=null;
		Socket socket=null;
		
		try {
			// 5000번 port에서 클라이언트의 접속을 기다릴 수 있는
			// ServerSocket 객체 생성해서 참조값을 변수에 담기
			serverSocket=new ServerSocket(5000);
			
			while(true) {
				//클라이언트의 접속을 기다린다
				socket=serverSocket.accept();
				
				//실행순서는!
				//아래의 Thread가 실행되고, 종료 돼야, 다시 accept()로 실행순서 돌아감.
				System.out.println("클라이언트가 접속함!");
				// socket 변수 안에는 방금 연결 요청을 한
				// 클라이언트와 연결된 Socket 객체의 참조값이
				// 들어있다
				String ip=socket.getInetAddress().getHostAddress();
				// 클라이언트가 전송하는 데이터를 읽어들일 수 있는 객체
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				// 클라이언트가 전송한 문자열 읽어내기
				String msg=br.readLine();
				// 콘솔창에 출력하고
				System.out.println(ip+":"+msg);
				// Socket 객체 닫기
				socket.close();
			}
						
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료됩니다");
	}
}
