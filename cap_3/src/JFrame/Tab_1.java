package JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Tab_1 extends JFrame {
	JTabbedPane tabPan;
	String tab[] = {"������", "�����", "����"};
	
	public Tab_1() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container con = getContentPane();
		tabPan = new JTabbedPane();				//JTabbedPane.LEFT
		con.add(tabPan, BorderLayout.CENTER);
		for(int i=0; i<tab.length; i++) {
			tabPan.add(tab[i], new JLabel(tab[i] + " ��"));
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tab_1();
	}
}