package ��ġ������;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_5 extends JFrame {
	JPanel pan, colorpan;
	
	public static void main(String[] args) {
		new Flow_5();
	}
	
	public Flow_5() {
		setTitle("��ȭ�� ���̾� ��ġ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(pan=new JPanel(new FlowLayout()));
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA};
		
		for(int i=0; i<color.length; i++) {
			pan.add(colorpan = new JPanel());
			colorpan.setBackground(color[i]);
			colorpan.setPreferredSize(new Dimension(50, 50));
		}
		
		pack();
		setVisible(true);
	}
}