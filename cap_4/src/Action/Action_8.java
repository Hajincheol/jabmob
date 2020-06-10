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
		
		jm = new JMenu("사용자 메뉴");
		String mu[] = {"입력", "수정", "삭제", "종료"};
		for(int i=0; i<mu.length; i++) {
			item[i]=new JMenuItem(mu[i]);
			item[i].addActionListener(this);
			jm.add(item[i]);
			jm.addSeparator();  //메뉴 분리선
		}
		
		bar.add(jm);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item[0]) {
			JOptionPane.showMessageDialog(null, "입력폼으로 이동합니다.");
		} else if(e.getSource() == item[1]) {
			JOptionPane.showMessageDialog(null, "수정폼으로 이동합니다.");
		} else if(e.getSource() == item[2]) {
			JOptionPane.showMessageDialog(null, "삭제폼으로 이동합니다.");
		} else {
			JOptionPane.showMessageDialog(null, "종료합니다.");
			System.exit(0);
		}
	}
}