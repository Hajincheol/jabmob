package Action;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Action_2 extends JFrame implements ActionListener {
	JButton jb;
	JLabel jl;
	
	public static void main(String[] args) {
		new Action_2();
	}
	
	public Action_2() {
		setTitle("���� ����");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		String[] bn = {"����", "����", "����"};
		for(int i=0; i<bn.length; i++) {
			jb = new JButton(bn[i]);
			p.add(jb);
			jb.addActionListener(this);
		}
		
		jl=new JLabel("������ �����ϼ���.");
		p.add(jl);
		add(p);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {
			jl.setText("���ڸ� �����Ͽ����ϴ�.");
		} else if(e.getActionCommand().equals("����")) {
			jl.setText("���ڸ� �����Ͽ����ϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�����մϴ�");
			System.exit(0);
		}
	}
}