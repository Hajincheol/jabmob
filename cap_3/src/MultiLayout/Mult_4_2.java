package MultiLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mult_4_2 extends JFrame {
	
	public Mult_4_2() {
		setTitle("도서정보");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] str = {"도서번호", "제목", "저자", "출판사", "가격", "대여여부"};
		String[] bn = {"검색", "저장", "취소"};
		
		JButton jb = new JButton(bn[0]);
		JPanel jp = new JPanel(new FlowLayout());
		jp.add(new JLabel(str[0] + " : "));
		jp.add(new JTextField(12));
		jp.add(jb);
		add(jp, "North");
		
		JPanel pc = new JPanel(new GridLayout(6, 2));
		for(int i=0; i<str.length; i++) {
			pc.add(new JLabel(str[i]));
			pc.add(new JTextField(12));
		}
		add(pc, "Center");
		
		JPanel ps = new JPanel(new FlowLayout());
		for(int i=0; i<2; i++) {
			ps.add(new JButton(bn[i+1]));
		}
		add(ps, "South");
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_4_2();
	}
}