package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabel_JTextField_test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JLabel_JTextField_test");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("인증번호 : ");
		jl.setBounds(20, 20, 60, 20);
		jf.add(jl);
		
		JTextField jt = new JTextField();
		jt.setBounds(80, 20, 100, 20);
		jf.add(jt);
		
		JButton jb = new JButton("확인");
		jb.setBounds(20, 60, 160, 20);
		jf.add(jb);
		
		jf.setVisible(true);
	}
}