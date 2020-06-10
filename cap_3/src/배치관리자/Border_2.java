package ��ġ������;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_2 extends JFrame {
	public static void main(String[] args) {
		new Border_2();
	}
	
	JPanel mp, pan;
	
	public Border_2() {
		setSize(400, 200);
		setTitle("Border ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp=new JPanel(new BorderLayout(5, 5));   //5, 5  �� ĭ ��ĭ ����
		add(mp);
		
		String bn[] = {"North", "East", "Center", "South"};
		for(int i=0; i<bn.length; i++) {
			mp.add(new JButton(bn[i] + "��ư"), bn[i]);
		}
		
		pan = new JPanel(new GridLayout(2, 1, 10, 10));
		for(int i=0; i<2; i++) {
			pan.add(new JButton("West ��ư" + (i+1)));
		}
		
		mp.add(pan, BorderLayout.WEST);
		setVisible(true);
	}
}