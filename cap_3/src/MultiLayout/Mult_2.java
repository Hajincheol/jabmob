package MultiLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mult_2 extends JFrame {
	JPanel mp, pan;
	JLabel la;
	JTextField[] jt = new JTextField[6];
	
	public Mult_2() {
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp = new JPanel(new GridLayout(3, 2));
		add(mp);
		
		String[] ln = {"도서명", "도서번호", "대여일자", "반납일자", "대여자", "정가"}; 
		
		for(int i=0; i<ln.length; i++) {
			pan = new JPanel(new FlowLayout());
			la = new JLabel(ln[i]);
			jt[i] = new JTextField(15);
			
			mp.add(pan);
			pan.add(la);
			pan.add(jt[i]);
		}
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_2();
	}
}