package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("test");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JButton jb = new JButton("Button");
		jb.setBounds(30, 30, 100, 30);
		jf.add(jb);
		jf.setVisible(true);
	}
}