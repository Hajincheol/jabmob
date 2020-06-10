package Action;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Action_8 extends JFrame implements ActionListener {
	JMenuBar bar;
	JMenu jm;
	JMenuItem item[] = new JMenuItem[4];
	
	public static void main(String[] args) {
		new Action_8();
	}
	
	public Action_8() {
		setTitle("ActionListener");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		bar = new JMenuBar();
		add(bar, BorderLayout.NORTH);
		
		jm = new JMenu("����� �޴�");
		String mu[] = {"�Է�", "����", "����", "����"};
		for(int i=0; i<mu.length; i++) {
			item[i]=new JMenuItem(mu[i]);
			item[i].addActionListener(this);
			jm.add(item[i]);
			jm.addSeparator();  //�޴� �и���
		}
		
		bar.add(jm);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item[0]) {
			JOptionPane.showMessageDialog(null, "�Է������� �̵��մϴ�.");
		} else if(e.getSource() == item[1]) {
			JOptionPane.showMessageDialog(null, "���������� �̵��մϴ�.");
		} else if(e.getSource() == item[2]) {
			JOptionPane.showMessageDialog(null, "���������� �̵��մϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�����մϴ�.");
			System.exit(0);
		}
	}
}