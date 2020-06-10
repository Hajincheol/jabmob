package ��ġ������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_3 extends JFrame {
	Container con = getContentPane();
	
	public static void main(String[] args) {
		new Flow_3();
	}
	
	public Flow_3() {
		setSize(200, 300);
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		String[] bn = {"���� ��ȸ", "���� ��û", "������ ��ȸ", "���� �ȳ�", "���α׷� ����"};
		for(int i=0; i<bn.length; i++) {
			con.add(new JButton(bn[i]));
		}
		
		setVisible(true);
	}
}