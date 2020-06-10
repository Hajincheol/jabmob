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
		setTitle("요일선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		con = getContentPane();
		String[] bn = "월,화,수,목,금,토,일".split(",");
		
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
		System.out.println("선택된 요일은 " + jc.getSelectedItem() + "요일 입니다.");
		System.out.println("선택한 아이템은 " + (jc.getSelectedIndex()+1) + "번째 입니다.");
	}
}