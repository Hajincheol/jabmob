package JFrame;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 150);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] item = {"��", "��", "ȭ", "��", "��", "��", "��"};
		//String[] item = "��, ��, ȭ, ��, ��, ��, ��".split(", ");
		JComboBox jc = new JComboBox(item);
		jc.setBounds(20, 40, 140, 25);
		jf.add(jc);
		
		jf.setVisible(true);
	}
}