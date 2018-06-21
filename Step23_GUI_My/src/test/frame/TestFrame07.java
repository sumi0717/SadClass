package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame07 extends JFrame implements ActionListener {
   JTextField tf1 = null;
   JTextField tf2 = null;
   JTextField tf3 = null;

   public TestFrame07() {
      // 프레임의 레이아웃 설정
      setLayout(new BorderLayout());

      tf1 = new JTextField(10);

      // 버튼
      JButton btn1 = new JButton("+");
      JButton btn2 = new JButton("-");
      JButton btn3 = new JButton("*");
      JButton btn4 = new JButton("/");

      tf2 = new JTextField(10);

      JLabel label = new JLabel("=");

      tf3 = new JTextField(10);

      // 버튼의 액션 command 설정하기
      btn1.setActionCommand("+");
      btn2.setActionCommand("-");
      btn3.setActionCommand("*");
      btn4.setActionCommand("/");

      // 버튼에 리스너 등록하기
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);

      // 패널 객체
      JPanel panel = new JPanel();

      panel.add(tf1);
      panel.add(btn1);
      panel.add(btn2);
      panel.add(btn3);
      panel.add(btn4);
      panel.add(tf2);
      panel.add(label);

      panel.add(tf3);

      add(panel, BorderLayout.NORTH);

      setBounds(100, 100, 800, 200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   public static void main(String[] args) {
      new TestFrame07();
   }

   // 버튼을 누르면 호출되는 메소드
   @Override
   public void actionPerformed(ActionEvent e) {
      // 눌러진 버튼의 액션 command 읽어오기
      String command = e.getActionCommand();

      //아하 그렇쿤 Integer에 parseInt가 있군
      try {
         int i1 = Integer.parseInt(tf1.getText());
         int i2 = Integer.parseInt(tf2.getText());

         if (command.equals("+")) {
            tf3.setText(Integer.toString(i1 + i2));

         } else if (command.equals("-")) {
            tf3.setText(Integer.toString(i1 - i2));

         } else if (command.equals("*")) {
            tf3.setText(Integer.toString(i1 * i2));

         } else if (command.equals("/")) {
            tf3.setText(Double.toString(i1 / i2));

         }
      } catch (Exception ex) {
         JOptionPane.showMessageDialog(this, "null x");
      } 
   }
}