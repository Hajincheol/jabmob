package 배치관리자;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_4 extends JFrame {
	Container con = getContentPane();
	
	public static void main(String[] args) {
		new Flow_4();
	}
	
	public Flow_4() {
		setSize(180, 195);
		setTitle("전화기 다이얼 배치");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con.setLayout(new FlowLayout());
		String[] bn = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
		for(int i=0; i<bn.length; i++) {
			con.add(new JButton(bn[i]));
		}
		
		setVisible(true);
	}
}