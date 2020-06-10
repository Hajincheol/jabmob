package JFrame;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBox_2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(250, 250);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JCheckBox[] jck = new JCheckBox[4];
		ButtonGroup bg = new ButtonGroup();
		for(int i=0; i<jck.length; i++) {
			jck[i]=new JCheckBox("체크 박스" + (i+1));
			jck[i].setBounds(30, 30 + 40 * i, 120, 30);
			jf.add(jck[i]);
			bg.add(jck[i]);
		}
		
		jf.setVisible(true);
	}
}