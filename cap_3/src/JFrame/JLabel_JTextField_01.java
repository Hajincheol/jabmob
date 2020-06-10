package JFrame;

import javax.swing.*;

public class JLabel_JTextField_01 {
	public static void main(String[] args) {
		new JLabel_JTextField_01().form();
	}

	private void form() {
		JFrame jf = new JFrame();
		jf.setSize(350, 150);
		jf.setTitle("JLabel, JTextField 예제");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("이름 : ");
		jl.setBounds(60, 40, 100, 30);
		jf.add(jl);
		
		JTextField jt = new JTextField();
		jt.setBounds(130, 40, 130, 30);
		jt.setHorizontalAlignment(JTextField.CENTER);
		jf.add(jt);
		
		jf.setVisible(true);
	}
}