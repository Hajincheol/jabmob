package MultiLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mult_3 extends JFrame {
	JPanel mp, center, south;
	JLabel la;
	
	public Mult_3() {
		setSize(600, 300);
		setTitle("�л����");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp = new JPanel(new BorderLayout());
		add(mp);
		
		la = new JLabel("�л� ���� ���� ���α׷�", JLabel.CENTER);
		mp.add(la);
		la.setFont(new Font("���� ���", Font.BOLD, 48));
		
		south = new JPanel(new FlowLayout());
		mp.add(south, BorderLayout.SOUTH);
		String[] bn = {"���� ��ȸ", "���� ��û", "������ ��ȸ", "���� �ȳ�", "���α׷� ����"};
		
		for(int i=0; i<bn.length; i++) {
			south.add(new JButton(bn[i]));
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_3();
	}
}