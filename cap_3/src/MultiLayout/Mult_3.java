package MultiLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mult_3 extends JFrame {
	JPanel mp, center, south;
	JLabel la;
	
	public Mult_3() {
		setSize(600, 300);
		setTitle("학사관리");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp = new JPanel(new BorderLayout());
		add(mp);
		
		la = new JLabel("학사 일정 관리 프로그램", JLabel.CENTER);
		mp.add(la);
		la.setFont(new Font("맑은 고딕", Font.BOLD, 48));
		
		south = new JPanel(new FlowLayout());
		mp.add(south, BorderLayout.SOUTH);
		String[] bn = {"학점 조회", "수강 신청", "수강자 조회", "일정 안내", "프로그램 종료"};
		
		for(int i=0; i<bn.length; i++) {
			south.add(new JButton(bn[i]));
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_3();
	}
}