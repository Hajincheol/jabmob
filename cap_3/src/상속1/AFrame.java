package 상속1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class AFrame extends JFrame implements ActionListener {
	JToolBar jtb;
	JPanel mp, south;
	public JButton[] tool;
	
	public void layout(String title, String... bn) {
		//개체 뒤에 ...이 붙으면 무한하게 인수를 받을 수 있다.
		//받은 인수는 배열로 처리
		
		setSize(400, 400);
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		jtb = new JToolBar();
		add(jtb, BorderLayout.NORTH);
		
		String[] fn = {"Home", "New", "Edit", "Remove", "Exit"};
		String[] tip = {"홈으로 이동합니다.", "새문서를 엽니다.", "문서를 편집합니다.", "문서를 삭제합니다.", "종료합니다."};
		tool = new JButton[fn.length];
		
		for(int i=0; i<fn.length; i++) {
			ImageIcon icon = new ImageIcon("아이콘\\" + fn[i] + ".png"); //"아이콘/"
			tool[i] = new JButton(icon);
			jtb.add(tool[i]);
			tool[i].setToolTipText(tip[i]);
			tool[i].addActionListener(this);
		}
		
		mp = new JPanel(new BorderLayout(10, 10));
		south = new JPanel(new FlowLayout());
		
		add(mp);
		mp.setBorder(new EmptyBorder(0, 10, 0, 10));
		mp.add(new JLabel(title), BorderLayout.NORTH);
		mp.add(new JTextArea(), BorderLayout.CENTER);
		mp.add(south, BorderLayout.SOUTH);
		
		for(int i=0; i<bn.length; i++) {
			south.add(new JButton(bn[i]));
		}
		
		setVisible(true);
	}

	public void Event(ActionEvent e) {
		if(e.getSource().equals(tool[0])) {
			JOptionPane.showMessageDialog(null, "홈으로 이동합니다.");
		} else if(e.getSource().equals(tool[1])) {
			JOptionPane.showMessageDialog(null, "새문서를 엽니다.");
		} else if(e.getSource().equals(tool[2])) {
			JOptionPane.showMessageDialog(null, "문서를 편집합니다.");
		} else if(e.getSource().equals(tool[3])) {
			JOptionPane.showMessageDialog(null, "문서를 삭제합니다.");
		} else if(e.getSource().equals(tool[4])) {
			System.exit(0);
		}
	}
}