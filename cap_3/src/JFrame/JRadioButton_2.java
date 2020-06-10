package JFrame;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButton_2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(250, 250);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JRadioButton[] jr = new JRadioButton[4];
		ButtonGroup bg = new ButtonGroup();
		
		for(int i=0; i<jr.length; i++) {
			jr[i] = new JRadioButton((i+1) + "ÇÐ³â");
			jr[i].setBounds(70, 30 + 40 * i, 120, 30);
			jf.add(jr[i]);
			bg.add(jr[i]);
		}
		
		jf.setVisible(true);
	}
}