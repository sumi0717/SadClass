package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/*
 *  emp 테이블과 dept 테이블을 이용한 프레임 만들기
 *  
 *  JTable에 출력할 내용은
 *  
 *  사원번호 | 이름 | 급여 | 부서명 | 입사일
 */
import javax.swing.table.DefaultTableModel;

import test.dao.EmpDao;
import test.dto.EmpDto;
public class EmpFrame extends JFrame
				implements ActionListener{
	//필드
	DefaultTableModel model;
	//생성자
	public EmpFrame() {
		
		//레이아웃 법칙을 BorderLayout 으로 설정 
		setLayout(new BorderLayout());
		
		//테이블의 칼럼명
		String[] colNames= {"사원번호","사원이름", "월급", "부서이름", "고용일"};
		//테이블에 연결할 모델 객체 
		model=new DefaultTableModel(colNames, 0);
		//테이블 객체를 생성하고 
		JTable table=new JTable();
		//모델을 연결하기 
		table.setModel(model);
		
		//테이블을 스크롤 페널에 붙이고 
		JScrollPane scPane=new JScrollPane(table);
		
		//스크롤 페널을 프레임의 가운데에 배치 
		add(scPane, BorderLayout.CENTER);
		
		//페널을 만들고 
		JPanel northPanel=new JPanel();
		//버튼을 만들어서 
		JButton testBtn=new JButton("테스트");
		//페널에 붙이고 
		northPanel.add(testBtn);
		//버튼이 붙은 페널을 프레임의 북쪽에 배치 
		add(northPanel, BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new EmpFrame();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		EmpDao edao=EmpDao.getInstance();
		List<EmpDto> list=edao.getList();
		
		for(EmpDto tmp:list) {
			Object[] data= new Object[5];
			data[0]=tmp.getEmpno();
			data[1]=tmp.getEname();
			data[2]=tmp.getSal();
			data[3]=tmp.getDname();
			data[4]=tmp.getHiredate();
			
			model.addRow(data);
		}
		
		
	}
	
}
