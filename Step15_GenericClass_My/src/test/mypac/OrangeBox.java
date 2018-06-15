package test.mypac;

public class OrangeBox {
	//Apple 객체를 저장할 멤버 필드
	private Orange item;
	//Apple 객체를 필드에 저장하는 메소드
	public void push(Orange item) {
		this.item=item;
	}
	//필드에 저장된 Apple 객체를 리턴해 주는 메소드
	public Orange pull() {
		return item;
	}
}