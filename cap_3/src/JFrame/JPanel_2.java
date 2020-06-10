package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class JPanel_2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(330, 120);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JPanel jp1 = new JPanel();
		jp1.setBounds(10, 0, 150, 70);
		jp1.setBorder(new TitledBorder("왼쪽"));
		jf.add(jp1);
		
		JButton jb1 = new JButton("남자");
		jb1.setBounds(30, 30, 70, 30);
		jp1.add(jb1);

		JPanel jp2 = new JPanel();
		jp2.setBounds(160, 0, 150, 70);
		jp2.setBorder(new TitledBorder("오른쪽"));
		jf.add(jp2);
		
		JButton jb2 = new JButton("여자");
		jb2.setBounds(30, 30, 70, 30);
		jp2.add(jb2);
		
		jf.setVisible(true);
	}
}