package 배치관리자;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grid_2 extends JFrame {
	public static void main(String[] args) {
		new Grid_2();
	}
	
	JPanel mp;
	JButton jb;
	
	public Grid_2() {
		setTitle("그리드 연습1");
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		
		add(mp = new JPanel(new GridLayout(0, 3, 5, 5)));
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		String[] bn = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
		for(int i=0; i<bn.length; i++) {
			mp.add(jb = new JButton(bn[i]));
		}
		setVisible(true);
	}
}