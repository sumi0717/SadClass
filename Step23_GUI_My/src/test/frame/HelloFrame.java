package test.frame;
/*
 *  [ GUI Frame 만들기 ]
 *  
 *  - JFrame 클래스를 상속받은 클래스를 정의한다
 *  - 해당 클래스로 객체 생성을 한다
 *  
 */

import javax.swing.JFrame;

public class HelloFrame extends JFrame{
	//생성자
	public HelloFrame() {
		//크기와 위치 설정 .setBounds(x,y,width,height)
		this.setBounds(100, 100, 500, 300);//스스로가 객체가 된다고 하면,
		setTitle("제목입니다");//자기 자신 참조할땐 클래스 명(this. 생략 가능)
		//x를 눌렀을 때 프로세스가 종료되도록 설정
		setDefaultCloseOperation(HelloFrame.EXIT_ON_CLOSE);
						//헬로프레임 클래스에 있는 static final 상수
						//클래스에 점 찍고, 대문자로 표기된걸로 추측 가능.
		//화면에 보이도록 설정
		setVisible(true);
	}
	
	// HelloFrame 클래스로 객체를 생성하기 위한 main 메소드
	public static void main(String[] args) {
		new HelloFrame();
	}
}
