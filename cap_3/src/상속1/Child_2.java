package 상속1;

public class Child_2 extends AFrame {
	public Child_2() {
		setTitle("고객등록");
		layout("고객등록", "확인", "이름", "전화번호", "주소", "가입일");
	}
	
	public static void main(String[] args) {
		new Child_2();
	}
}