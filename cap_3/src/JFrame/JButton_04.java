package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButton_04 implements ActionListener {
	public static void main(String[] args) {
		new JButton_04().form();
	}
	
	public void form() {
		JFrame jf = new JFrame();
		jf.setSize(200, 360);
		jf.setTitle("JButton");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] bn = {"1��", "2��", "3��", "����"};
		
		for(int i=0; i<bn.length; i++) {
			JButton jb = new JButton(bn[i]);
			jb.setBounds(20, 30 + 70*i, 146, 50);
			jb.addActionListener(this);
			jf.add(jb);
		}
		
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "�̺�Ʈ �߻���ȣ��\n" + e.getActionCommand() + "�Դϴ�.");
		}
	}
}