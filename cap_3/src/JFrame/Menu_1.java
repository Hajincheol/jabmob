package JFrame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu_1 extends JFrame {
	JMenuBar bar;
	JMenu jm;
	JMenuItem item[] = new JMenuItem[4];
	
	public Menu_1() {
		setSize(300, 200);
		setDefaultCloseOperation(2);
		setLocationRelativeTo(null);
		bar = new JMenuBar();
		add(bar, BorderLayout.NORTH);
		
		jm = new JMenu("����� �޴�");
		String mu[] = {"�Է�", "����", "����"};
		for(int i=0; i<mu.length; i++) {
			item[i]=new JMenuItem(mu[i]);
			jm.add(item[i]);
		}
		
		jm.addSeparator();  //�޴� �и���
		jm.add("����");
		bar.add(jm);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu_1();
	}
}