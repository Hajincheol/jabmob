package ��ġ������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_2 extends JFrame {
	Container con = getContentPane();
	
	public static void main(String[] args) {
		new Flow_2();
	}
	
	public Flow_2() {
		setTitle("FlowLayout ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con.setLayout(new FlowLayout());
		String[] bn = {"ȸ������", "�α���", "ȸ������"};
		for(int i=0; i<bn.length; i++) {
			con.add(new JButton(bn[i]));
		}
		pack();
		setVisible(true);
	}
}