package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> list=dao.getList();
		useList(list);
	}
	public static void useList(List<MemberDto> list) {
		
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"
					+tmp.getName()+"|"+tmp.getAddr());
		}
			

	}
}
