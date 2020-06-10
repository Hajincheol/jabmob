package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class JList_test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JList_test");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] f = {"배", "딸기", "사과", "참외", "키위"};
		//String[] f = "배,딸기,사과,참외,키위".split(",");
		JList list = new JList(f);
		list.setBounds(30, 30, 60, 100);
		jf.add(list);
		
		JButton jb = new JButton("주문");
		jb.setBounds(110, 30, 60, 30);
		jf.add(jb);
		
		jf.setVisible(true);
	}
}