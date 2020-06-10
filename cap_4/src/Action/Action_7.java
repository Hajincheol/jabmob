package Action;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Action_7 extends JFrame implements ActionListener {
	JButton[] jb = new JButton[3];
	
	public static void main(String[] args) {
		new Action_7();
	}
	
	public Action_7() {
		setTitle("요일선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		String[] bn = {"회원가입", "로그인", "종료"};
		for(int i=0; i<bn.length; i++) {
			jb[i] = new JButton(bn[i]);
			jb[i].addActionListener(this);
			add(jb[i]);
		}
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("회원가입") || e.getActionCommand().equals("로그인")) {
			JOptionPane.showMessageDialog(null, e.getActionCommand() + " 버튼을 선택하셨습니다.");
		} else {
			System.exit(0);
		}
	}
}