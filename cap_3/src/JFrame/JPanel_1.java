package JFrame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class JPanel_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 180);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JPanel jp = new JPanel();
		jp.setBounds(20, 20, 150, 100);
		jp.setBorder(new TitledBorder("JPanel"));
		jf.add(jp);
		jf.setVisible(true);
	}
}