package test.mypac;
/*
 *  da0 => Data Access Object 의 약자
 *  
 *  Data Base에 insert, update, delete, select
 *  등의 작업을 하는 객체를 생성할 때 사용하는 클래스이다
 */
public class MemberDao {
	//자신의 참조값을 저장할 필드를 private static으로 정의
	private static MemberDao dao;
	//외부에서 객체 생성할 수 없도록 생성자를 private로 정의
	private MemberDao() {}
	//자신의 참조값을 리턴해주는 public static 메소드 정의
	public static MemberDao getInstance() {
		//최초 호출될 때는 dao가 null이므로
		if(dao==null) {
			//객체를 생성해서 static 필드에 저장
			dao=new MemberDao();
		}
		//필드에 있는 참조값을 리턴해주기
		return dao;
	}
	
	public void insert() {
		System.out.println("저장해요");
	}
	public void delete() {
		System.out.println("삭제해요");
	}
}
