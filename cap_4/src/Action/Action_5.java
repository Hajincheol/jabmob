package Action;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Action_5 extends JFrame implements ActionListener {
	Container con;
	JComboBox jc;
	
	public static void main(String[] args) {
		new Action_5();
	}
	
	public Action_5() {
		setTitle("���ϼ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		String[] bn = "��,ȭ,��,��,��,��,��".split(",");
		
		jc = new JComboBox(bn);
		con.add(jc);
		jc.addActionListener(this);
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println("���õ� ������ " + jc.getSelectedItem() + "���� �Դϴ�.");
		System.out.println("������ �������� " + (jc.getSelectedIndex()+1) + "��° �Դϴ�.");
	}
}