package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/*
 *  [ 문자열 전송 약속 ]
 *  
 *  0#id				=> 새로운 클라이언트 접속 메시지
 *  1#id#message		=> 대화 메세지
 *  2#id				=> 대화방 탈퇴 메세지
 *  3#id1,id2,id3 ...	=> 대화 참여자 목록 메세지
 */

public class BroadcastServer {
	// ServerThread 객체를 저장할 static 멤버필드
	private static List<ServerThread> threadList=new ArrayList<>();
	
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5000);
			while(true) {
				System.out.println("클라이언트의 접속 대기중..");
				Socket socket=serverSocket.accept();
				//스레드 객체 생성
				ServerThread thread=new ServerThread(socket);
				//스레드를 시작시킨다
				thread.start();
				//스레드의 참조값을 List에 저장
				threadList.add(thread);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
	}
	
	//스레드 객체를 생성할 클래스 설계 | inner class(클래스 안에 클래스를 정의했음)
	static class ServerThread extends Thread{
		//필드
		private Socket socket;
		private BufferedReader br;
		private BufferedWriter bw;
		private String id; //대화명
		
		
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달된 Socket 객체를 필드에 저장
			this.socket=socket;
		}
		@Override
		public void run() {
			try {
				//클라이언트가 전송한 문자열을 읽을 객체
				br=new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
				//클라이언트에게 문자열을 출력할 객체
				bw=new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
				boolean isRun=true;
				while(isRun) {
					String msg=null;
					try {
						//클라이언트의 문자 전송을 기다린다
						msg=br.readLine();
					}catch(SocketException se) {
						se.printStackTrace();
					}
					if(msg==null) {//접속이 끊긴 경우
						//배열에서 해당 스레드 제거
						threadList.remove(this);
						//반복문 탈출 하도록
						isRun=false;
						//수정된 참여자 목록 보내기
						sendClientList();						
					}else {//도착한 메세지가 있는 경우
						//#으로 구분해서 문자열을 배열로 얻어온다
						String[] result=msg.split("#");
						//메세지의 종류
						int msgType=Integer.parseInt(result[0]);
			
			//result[0]인 이유는 split("#")을 기준으로 나눴기 때문에
			// 그러면 문자열 전송 약속에 의해 0,1,2,3이 0번째 배열로 들어오게 된다.
			//이를 기준으로 id, 대화 메세지, 탈퇴 메세지 등 유형을 구분 가능 하므로
			// result[0]이 메세지 종류가 되고,
			//switch, case타입은 여기에 각각 대응 되게 됨!
			
						switch(msgType) {//switch는 배열을 다시 문자열로.
						case 0: // 새로운 대화 참여자 입장
							id=result[1];
							sendClientList();
							break;
							
						case 1: //새로운 대화 메세지 도착
							//메세지 보내기
							sendMessage(msg);
							break;
						
						case 2: //대화 참여자 탈퇴
							sendMessage(msg);
							//스레드 목록에서 삭제
							threadList.remove(this);
			//remove(int index), remove(object O) 두가지 유형이 있는데
			//object인자를 전달해서 remove 하는 유형은, 삭제할 참조값 자체를 가져와서 삭제하는 방법임.
			//즉 remove(this)는 해당, 본 참조값 자체를 삭제하는 것이므로 말 됨.
							
							//스레드 종료
							isRun=false;
							//대화 참여자 목록 다시 내보내기
							sendClientList();
							break;
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(br!=null)br.close();
					if(bw!=null)bw.close();
					if(socket!=null)socket.close();
					
				}catch(Exception e) {}
			}
		}// run 닫음
		
//		public void newClientList() {
//			String data="1";
//			for(int i=0; i<threadList.size(); i++) {
//				ServerThread tmp1=threadList.get(i);
//				
//			}
//		}
		
		//새로운 참여자가 들어왔을 때 처리하는 메소드
		public void sendClientList() throws IOException {
			//add throws를 하면 해당 메소드의 exception을 처리한다는 의미.
			
			//이벤트의 종류
			String data="3"; //문자열 전송 약속대로 종류를 바꿀 수 있는지??
			//반복문 돌면서
			for(int i=0; i<threadList.size(); i++) {
				//i번째 스레드의 참조값 얻어오기
				ServerThread tmp=threadList.get(i);
				if(i==0) {//처음 반복문을 도는 것이라면
					data=data+"#"+tmp.id;
					
				}else {
					data=data+","+tmp.id;
				}
			}
			//반복문 돌고나면 data는 "3#김구라, 해골, 원숭이 ..."
			//와 같은 형태의 문자열이다
			//모든 클라이언트에게 data 보내기
			sendMessage(data);
		}
		//모든 클라이언트에게 문자열을 보내는 메소드
		public void sendMessage(String msg) throws IOException {
			for(ServerThread tmp: threadList) {
				tmp.bw.write(msg);
				tmp.bw.newLine();
				tmp.bw.flush(); 
				//flush는 정보 내보내는(출력하는) 메소드. close() 하기 전에 해줘야함
				//close()하면 자동으로 flush()가 호출되기 때문.
			}
		}
		
	}// class ServerThread 닫음
}
