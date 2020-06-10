package JFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIcon_1 extends JFrame {
	Container con;
	JLabel lab1, lab2;
	ImageIcon img;
	
	public void ImageEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		con = getContentPane();
		con.setLayout(new FlowLayout());
		
		lab1 = new JLabel("æ»≥Á«œººø‰.");
		con.add(lab1);
		
		img = new ImageIcon("image.jpg");
		lab2 = new JLabel(img);
		con.add(lab2);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageIcon_1().ImageEx();
	}
}