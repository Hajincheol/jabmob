package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Action_1 extends JFrame implements ActionListener {
	JButton jb;
	
	public static void main(String[] args) {
		new Action_1();
	}
	
	public Action_1() {
		setTitle("ActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		jb = new JButton("ActionEvent");
		add(jb);
		jb.addActionListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, e.getActionCommand());
	}
}