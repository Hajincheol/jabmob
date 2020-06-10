package 배치관리자;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grid_1 extends JFrame {
	public static void main(String[] args) {
		new Grid_1();
	}
	
	JPanel mp;
	JButton jb;
	
	public Grid_1() {
		setTitle("그리드 연습1");
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(mp = new JPanel(new GridLayout(3, 3, 5, 5)));
		
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		for(int i=1; i<=9; i++) {
			mp.add(jb = new JButton("번호" + i));
		}
		setVisible(true);
	}
}