package Action;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Action_4 extends JFrame implements ActionListener {
	JPanel jp;
	JLabel jl;
	JTextField[] jt = new JTextField[2];
	JButton jb;
	JFrame jf;
	
	public static void main(String[] args) {
		new Action_4();
	}
	
	public Action_4() {
		setSize(300, 300);
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		String[] ln = {"ID", "PW"};
		for(int i=0; i<ln.length; i++) {
			jl = new JLabel(ln[i]);
			jp.add(jl);
			jl.setPreferredSize(new Dimension(30, 20));
			
			if(i==0) {
				jt[i] = new JTextField(10);
				jp.add(jt[i]);
			} else {
				jt[i] = new JPasswordField(10);
				jp.add(jt[i]);
			}
		}
		
		JButton[] jb = new JButton[2];
		String[] bn = {"확인", "취소"};
		for(int i=0; i<bn.length; i++) {
			jb[i] = new JButton(bn[i]);
			jb[i].addActionListener(this);
			jp.add(jb[i]);
		}
		
		add(jp);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("")) {
			if(jt[0].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
				jt[0].requestFocus();
			} else if(jt[1].getText().equals("")) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				jt[1].requestFocus();
			} else if(jt[0].getText().equals("admin") && jt[1].getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "로그인 정보가 일치하지 않습니다.");
				for(int i=0; i<jt.length; i++) {
					jt[i].setText("");
				}
				jt[0].requestFocus();
			}
		} else if(e.getActionCommand().equals("취소")) {
			dispose();
		}
	}
}