package ��ġ������;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_1 extends JFrame {
	public static void main(String[] args) {
		new Border_1();
	}
	
	JPanel mp;
	
	public Border_1() {
		setSize(300, 200);
		setTitle("Border ����1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp=new JPanel(new BorderLayout());
		add(mp);
		mp.add(new JButton("��"), BorderLayout.NORTH);
		mp.add(new JButton("��"), BorderLayout.WEST);
		mp.add(new JButton("�߾�"), BorderLayout.CENTER);
		mp.add(new JButton("��"), BorderLayout.EAST);
		mp.add(new JButton("��"), BorderLayout.SOUTH);
		setVisible(true);
	}
}