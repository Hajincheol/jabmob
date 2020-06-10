package 硅摹包府磊;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_3 extends JFrame {
	public static void main(String[] args) {
		new Border_3();
	}
	
	JPanel mp, pan1, pan2;
	
	public Border_3() {
		setSize(400, 200);
		setTitle("Border 抗力3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp=new JPanel(new BorderLayout(5, 5));   //5, 5  阿 沫 后沫 积己
		add(mp);
		
		pan1 = new JPanel(new GridLayout(1, 3, 10, 10));
		for(int i=0; i<3; i++) {
			pan1.add(new JButton("Button " + (i+1)));
		}
		mp.add(pan1, BorderLayout.CENTER);
		pan1.setOpaque(true);
		pan1.setBackground(Color.LIGHT_GRAY);
		
		
		pan2 = new JPanel(new GridLayout(2, 4, 10, 10));
		for(int i=0; i<7; i++) {
			pan2.add(new JButton("Button " + (i+4)));
		}
		mp.add(pan2, BorderLayout.SOUTH);
		pan2.setOpaque(true);
		pan2.setBackground(Color.DARK_GRAY);
		
		setVisible(true);
	}
}