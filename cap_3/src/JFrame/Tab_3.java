package JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Tab_3 extends JFrame {
	JTabbedPane tabPan;
	ImageIcon img;
	
	public Tab_3() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.LEFT);
		img = new ImageIcon("Image.jpg");
		con.add(tabPan, BorderLayout.CENTER);
		
		tabPan.add("그림보기", new JLabel(img));
		tabPan.add("설명", new JTextArea("이 그림은 '환영합니다' 입니다."));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tab_3();
	}
}