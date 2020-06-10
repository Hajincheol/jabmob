package JFrame;

import javax.swing.*;

public class JLabel_JTextField_02 {
	public static void main(String[] args) {
		new JLabel_JTextField_02().form();
	}

	private void form() {
		JFrame jf = new JFrame();
		jf.setSize(350, 150);
		jf.setTitle("JLabel, JTextField 예제");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("이름 : ");
		jl.setBounds(50, 20, 80, 30);
		jf.add(jl);
		
		JTextField jt = new JTextField();
		jt.setBounds(110, 20, 130, 30);
		jt.setHorizontalAlignment(JTextField.CENTER);
		jf.add(jt);
		
		jl = new JLabel("비밀번호 : ", JLabel.RIGHT);
		jl.setBounds(30, 60, 80, 30);
		jf.add(jl);
		
		jt = new JTextField();
		jt.setBounds(110, 60, 130, 30);
		jf.add(jt);
		
		jf.setVisible(true);
	}
}