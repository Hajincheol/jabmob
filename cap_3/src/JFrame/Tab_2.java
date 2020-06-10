package JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class Tab_2 extends JFrame {
	JTabbedPane tabPan;
	JPanel p[] = new JPanel[3], ps1, ps2;
	String tab[] = {"관리자", "사용자", "도움말"};
	
	public Tab_2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.RIGHT);
		con.add(tabPan, BorderLayout.CENTER);
		
		for(int i=0; i<tab.length; i++) {
			p[i] = new JPanel(new GridLayout(2, 1, 10, 10));
			
			ps1 = new JPanel(new FlowLayout());
			ps1.add(new JLabel(tab[i] + " 탭"));
			p[i].add(ps1);
			
			ps2 = new JPanel(new FlowLayout());
			ps2.add(new JButton(tab[i]));
			p[i].add(ps2);
			
			tabPan.add(tab[i], p[i]);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tab_2();
	}
}