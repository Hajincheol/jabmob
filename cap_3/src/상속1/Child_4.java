package 상속1;

public class Child_4 extends AFrame {
	public Child_4() {
		setTitle("고객수정");
		layout("고객수정", "수정", "이름", "전화번호", "주소", "가입일");
	}
	
	public static void main(String[] args) {
		new Child_4();
	}
}