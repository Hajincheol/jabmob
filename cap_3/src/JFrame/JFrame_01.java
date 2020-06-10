package JFrame;

import javax.swing.*;

public class JFrame_01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(600, 300);
		jf.setTitle("JFrame");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}