package JFrame;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButton_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JRadioButton jr = new JRadioButton("JRadioButton", true);
		jr.setBounds(40, 40, 120, 30);
		jf.add(jr);
		
		jf.setVisible(true);
	}
}