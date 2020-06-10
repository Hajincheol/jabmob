package MultiLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Mult_4_1 extends JFrame {
	JPanel mp, north, center, south;
	JComponent[] jc = {
			new JLabel("������ȣ : "),
			new JTextField(10),
			new JButton("�˻�")
	};
	
	public Mult_4_1() {
		setTitle("��������");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] ln = {"������ȣ", "����", "����", "���ǻ�", "����", "�뿩����"};
		String[] bn = {"����", "���"};
		
		mp = new JPanel(new BorderLayout());
		add(mp);
		mp.setBorder(new EmptyBorder(10, 10, 10, 10));
		 
		north = new JPanel(new FlowLayout());
		mp.add(north, BorderLayout.NORTH);
		for(int i=0; i<jc.length; i++) {
			north.add(jc[i]);
		}
		
		center = new JPanel(new GridLayout(0, 2));
		mp.add(center);
		for(int i=0; i<ln.length; i++) {
			center.add(new JLabel(ln[i]));
			center.add(new JTextField(12));
		}
		
		south = new JPanel(new FlowLayout());
		mp.add(south, BorderLayout.SOUTH);
		for(int i=0; i<bn.length; i++) {
			south.add(new JButton(bn[i]));
		}
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Mult_4_1();
	}
}