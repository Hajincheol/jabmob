package ��ġ������;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Grid_3 extends JFrame {
	public static void main(String[] args) {
		new Grid_3();
	}
	
	JPanel mp;
	JButton jb;
	
	public Grid_3() {
		setSize(200, 300);
		setTitle("��������");
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		add(mp = new JPanel(new GridLayout(4, 1, 10, 10)));
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String[] bn = {"�����Է�", "�л���ȸ", "����������ȸ", "����"};
		for(int i=0; i<bn.length; i++) {
			mp.add(jb = new JButton(bn[i]));
		}
		setVisible(true);
	}
}