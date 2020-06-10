package ���1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class AFrame extends JFrame implements ActionListener {
	JToolBar jtb;
	JPanel mp, south;
	public JButton[] tool;
	
	public void layout(String title, String... bn) {
		//��ü �ڿ� ...�� ������ �����ϰ� �μ��� ���� �� �ִ�.
		//���� �μ��� �迭�� ó��
		
		setSize(400, 400);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		jtb = new JToolBar();
		add(jtb, BorderLayout.NORTH);
		
		String[] fn = {"Home", "New", "Edit", "Remove", "Exit"};
		String[] tip = {"Ȩ���� �̵��մϴ�.", "�������� ���ϴ�.", "������ �����մϴ�.", "������ �����մϴ�.", "�����մϴ�."};
		tool = new JButton[fn.length];
		
		for(int i=0; i<fn.length; i++) {
			ImageIcon icon = new ImageIcon("������\\" + fn[i] + ".png"); //"������/"
			tool[i] = new JButton(icon);
			jtb.add(tool[i]);
			tool[i].setToolTipText(tip[i]);
			tool[i].addActionListener(this);
		}
		
		mp = new JPanel(new BorderLayout(10, 10));
		south = new JPanel(new FlowLayout());
		
		add(mp);
		mp.setBorder(new EmptyBorder(0, 10, 0, 10));
		mp.add(new JLabel(title), BorderLayout.NORTH);
		mp.add(new JTextArea(), BorderLayout.CENTER);
		mp.add(south, BorderLayout.SOUTH);
		
		for(int i=0; i<bn.length; i++) {
			south.add(new JButton(bn[i]));
		}
		
		setVisible(true);
	}

	public void Event(ActionEvent e) {
		if(e.getSource().equals(tool[0])) {
			JOptionPane.showMessageDialog(null, "Ȩ���� �̵��մϴ�.");
		} else if(e.getSource().equals(tool[1])) {
			JOptionPane.showMessageDialog(null, "�������� ���ϴ�.");
		} else if(e.getSource().equals(tool[2])) {
			JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
		} else if(e.getSource().equals(tool[3])) {
			JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
		} else if(e.getSource().equals(tool[4])) {
			System.exit(0);
		}
	}
}