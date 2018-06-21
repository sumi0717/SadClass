package test.frame;

import java.awt.event.ActionEvent;
//import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame01 extends JFrame{
//	TestFrame01 a=this; //본인
//	JFrame b= this; //확장의 디스니까 구성으로 갖고있음
//	Component c= this; //??
//	Object d= this; //부모의 this니까 가능
	
	//생성자
	public TestFrame01() {
		//버튼 객체 생성해서
		JButton button=new JButton("눌러보셈");
		
		//버튼에 액션 리스너 등록하기
		button.addActionListener(listener);
		//이 프레임에 추가하기
		this.add(button);
		
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//ActionListener type 객체를 필드로 정의하기
	
	ActionListener listener=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		//listener 버튼을 클릭하면 실행 순서는 여기로 들어오게 됨.
			
			//Component a=TestFrame01.this;
			//얘를 둘러 싸고 있는 참조값이 필요하면 둘러싸고있는 클래스의 참조값을 적어 줘야함.
			
			//System.out.println("버튼을 눌렀네?");	
			//웹브라우져의 alert 와 같은 기능.	
			JOptionPane.showMessageDialog
			(TestFrame01.this, "버튼 눌렀네");
			
		}
	};
	
	public static void main(String[] args) {
		new TestFrame01();
	}
}
