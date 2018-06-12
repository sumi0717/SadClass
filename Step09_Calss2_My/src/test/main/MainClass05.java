package test.main;

import test.mypac.Cpu;
import test.mypac.Memory;
import test.mypac.Notebook;

public class MainClass05 {
	public static void main(String[] args) {
		//NoteBook 객체 생성
		Notebook n1=new Notebook(new Cpu(), new Memory());
		
		// 생성자의 인자로 전달할 객체를 미리 생성하고 
		Cpu c=new Cpu();
		Memory m=new Memory();
		
		// 참조값이 들어있는 변수명으로 전달 
		Notebook n2=new Notebook(c, m);
	}
}


