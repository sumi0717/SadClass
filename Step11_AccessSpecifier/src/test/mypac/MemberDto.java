package test.mypac;
/*
 * 회원 한명의 정보를 담을 수 있는 객체를 생성하기 위한
 * 클래스 정의하기
 * 
 * dto => Data Transfer Object의 약자
 * 
 * dto 클래스 작성 방법
 * 
 * 1. 필드의 접근 지정자를 private로 지정해서 만든다
 * 2. default 생성자와 인자로 필드값을 전달받는 생성자를 만든다
 * 3. 모든 필드에 대해서 setter 메소드를 정의한다
 * 4. 모든 필드에 대해서 getter 메소드를 정의한다
 * 
 */
public class MemberDto {
	//필드
	private int num;
	private String name;
	private String addr;
	//생성자
	public MemberDto() {}
	//인자를 전달받는 생성자
	
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	// num 이라는 필드에 값을 넣어주는 setter 메소드
	public void setNum(int num) {
		this.num = num;
	}
	// num 이라는 필드에 있는 값을 리턴해주는 getter 메소드
	public int getNum() {
		return num;
	}
	// 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
}
