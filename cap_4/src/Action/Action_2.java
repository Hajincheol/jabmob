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
		setTitle("남녀 선택");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		String[] bn = {"남자", "여자", "종료"};
		for(int i=0; i<bn.length; i++) {
			jb = new JButton(bn[i]);
			p.add(jb);
			jb.addActionListener(this);
		}
		
		jl=new JLabel("성별을 선택하세요.");
		p.add(jl);
		add(p);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("남자")) {
			jl.setText("남자를 선택하였습니다.");
		} else if(e.getActionCommand().equals("여자")) {
			jl.setText("여자를 선택하였습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "종료합니다");
			System.exit(0);
		}
	}
}