package test.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame07_Teacher extends JFrame 
							implements ActionListener{
	
	JTextField tf_one, tf_two, tf_result;
	//다른 메소드에서 필요한 값을 생성자 필드에 넣어준다.
	//이와 같이 특정 변수를 필드로 빼면, 아래에 변수의 JTextField 선언은 지워준다!
	
	
	//생성자
	public TestFrame07_Teacher() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		//JTextField 객체 
		tf_one=new JTextField(10);
		tf_two=new JTextField(10);
		tf_result=new JTextField(10);
		//Button 객체
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		//JLabel
		JLabel label=new JLabel("=");
		//JPanel
		JPanel panel=new JPanel();
		panel.add(tf_one);
		panel.add(plusBtn);
		panel.add(minusBtn);
		panel.add(multiBtn);
		panel.add(divideBtn);
		panel.add(tf_two);
		panel.add(label);
		panel.add(tf_result);
		
		//페널을 프레임의 북쪽에 배치 
		add(panel, BorderLayout.NORTH);
		
		//버튼에 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		//액션 command 설정
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		setBounds(100, 100, 800, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame07();
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼이 눌러졌는지 액션 command 를 읽어와서 
		String command=e.getActionCommand();
		//문자열을 산술 연산할 수 있는 실수로 바꾸기
		int a = Integer.parseInt(tf_one.getText());
		int b = Integer.parseInt(tf_two.getText());
		
		try {
			//연산의 결과를 담을 수 있는 변수 만들기
			double result=0; //값이 있어야 변수가 만들어지므로 0이란 값 넣었음, 의미부여X
			
			if(command.equals("plus")) {
				result=a+b;
			}else if(command.equals("minus")) {
				result=a-b;
			}else if(command.equals("multi")) {
				result=a*b;
			}else if(command.equals("divide")) {
				result=a/b;
			}
			//결과를 TextField에 출력하기
			tf_result.setText(Double.toString(result));
			//setText는 string을 인자로 받기 때문에,
			//안에 들어가는 값을 toString을 이용해서 문자열로 변환해줘야함
		}catch(Exception e2) { 
			// 오류or예외의 경우를 위해 try&catch 익셉션 메소드 이용
			e2.printStackTrace();
			JOptionPane.showMessageDialog
			(this, "형식을 확인하삼");
		}
		
		
	}
}

