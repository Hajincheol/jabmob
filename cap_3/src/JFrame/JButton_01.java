package JFrame;

import javax.swing.*;

public class JButton_01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 160);
		jf.setTitle("JButton");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JButton jb = new JButton("Å¬¸¯");
		jb.setBounds(60, 40, 70, 40);
		jf.add(jb);
		jf.setVisible(true);
	}
}