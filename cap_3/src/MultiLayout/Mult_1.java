package MultiLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mult_1 extends JFrame {
	JButton jb;
	JPanel mp, pan;
	
	public Mult_1() {
		setSize(0, 0);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp = new JPanel(new GridLayout(3, 1));
		add(mp);
		
		String[][] str = {
				{"word", "java"},
				{"점수보기"},
				{"Excel", "PPT"}
		};
		
		for(int i=0; i<str.length; i++) {
			pan= new JPanel(new FlowLayout());
			mp.add(pan);
			for(int j=0; j<str[i].length; j++) {
				jb = new JButton(str[i][j]);
				pan.add(jb);
			}
		}
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_1();
	}
}