package 상속1;

public class Child_3 extends AFrame {
	public Child_3() {
		setTitle("도서수정");
		layout("도서수정", "수정", "도서 번호", "도서명", "저자", "출판사");
	}
	
	public static void main(String[] args) {
		new Child_3();
	}
}