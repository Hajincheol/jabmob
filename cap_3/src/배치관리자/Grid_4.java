package 배치관리자;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Grid_4 extends JFrame {
	public static void main(String[] args) {
		new Grid_4();
	}
	
	JPanel mp;
	JLabel jl;
	
	public Grid_4() {
		setSize(300, 200);
		setTitle("개인정보 입력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(mp = new JPanel(new GridLayout(4, 2, 0, 5)));
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String[] ln = {"이름 : ", "학번 : ", "학과 : ", "과목 : "};
		for(int i=0; i<ln.length; i++) {
			mp.add(jl = new JLabel(ln[i]));
			jl.setFont(new Font("궁서체", Font.BOLD + Font.ITALIC, 20));
			mp.add(new JTextField());
		}
		setVisible(true);
	}
}