package JFrame;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBox_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JCheckBox jck = new JCheckBox("JCheckBox");
		jck.setBounds(50, 40, 120, 30);
		jf.add(jck);
		
		jf.setVisible(true);
	}
}