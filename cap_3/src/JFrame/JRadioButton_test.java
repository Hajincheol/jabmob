package JFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButton_test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JList_test");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] program = {"Word", "Java", "Excel", "PPT", "C++"};
		//String[] program = "Word,Java,Excel,PPT,C++".split(",");
		JRadioButton jr;
		for(int i=0; i<program.length; i++) {
			jr=new JRadioButton(program[i]);
			jr.setBounds(30, 30 + i * 30, 60, 20);
			jf.add(jr);
		}
		
		JButton jb = new JButton("½ÇÇà");
		jb.setBounds(100, 30, 60, 140);
		jf.add(jb);
		
		jf.setVisible(true);
	}
}