package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton_05 extends JFrame {
	Container con;
	JButton b1;
	
	public static void main(String[] args) {
		new JButton_05().JButtonEx();
	}
	
	public void JButtonEx() {
		Image icon = Toolkit.getDefaultToolkit().getImage("image.jpg");
		setIconImage(icon);
		
		setTitle("�۲ÿ������� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		con.setLayout(new FlowLayout());
		
		b1= new JButton("�ڹ����α׷���");
		con.add(b1);
		
		b1.setOpaque(true);
		b1.setForeground(Color.CYAN);
		b1.setBackground(Color.RED);
		b1.setFont(new Font("�߰��", Font.ITALIC, 14));
		
		pack();
		setVisible(true);
	}
}