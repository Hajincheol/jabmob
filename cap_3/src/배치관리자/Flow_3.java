package 배치관리자;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_3 extends JFrame {
	Container con = getContentPane();
	
	public static void main(String[] args) {
		new Flow_3();
	}
	
	public Flow_3() {
		setSize(200, 300);
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		String[] bn = {"학점 조회", "수강 신청", "수강자 조회", "일정 안내", "프로그램 종료"};
		for(int i=0; i<bn.length; i++) {
			con.add(new JButton(bn[i]));
		}
		
		setVisible(true);
	}
}