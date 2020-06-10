package JFrame;

import javax.swing.*;

public class JButton_02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(200, 290);
		jf.setTitle("JButton");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] bn = {"1¹ø", "2¹ø", "3¹ø"};
		
		for(int i=0; i<bn.length; i++) {
			JButton jb = new JButton(bn[i]);
			jb.setBounds(20, 30 + 70*i, 146, 50);
			jf.add(jb);
		}
		
		jf.setVisible(true);
	}
}