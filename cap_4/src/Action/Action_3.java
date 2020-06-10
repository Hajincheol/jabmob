package Action;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;

public class Action_3 implements ActionListener {
	JLabel jl;
	JButton jb;
	ButtonGroup bg1, bg2;
	JPanel jp1, jp2;
	JRadioButton[] jr1 ,jr2;
	JFrame jf;
	
	public static void main(String[] args) {
		new Action_3();
	}
	
	public Action_3() {
		jf = new JFrame();
		jf.setSize(260, 240);
		jf.setTitle("성별 및 학년 선택");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		jl = new JLabel("성별");
		jl.setBounds(50, 10, 60, 20);
		jf.add(jl);
		
		jp1 = new JPanel();
		jp1.setBorder(new EtchedBorder());
		jp1.setBounds(10, 30, 110, 100);
		jf.add(jp1);
		
		jr1 = new JRadioButton[2];
		bg1 = new ButtonGroup();
		String[] rn1 = {"남자", "여자"};
		for(int i=0; i<rn1.length; i++) {
			jr1[i] = new JRadioButton(rn1[i]);
			jr1[i].setBounds(25, 20 + i * 40, 60, 20);
			jp1.add(jr1[i]);
			bg1.add(jr1[i]);
		}
		jr1[0].setSelected(true);
		
		jl = new JLabel("학년");
		jl.setBounds(165, 10, 60, 20);
		jf.add(jl);

		jp2 = new JPanel();
		jp2.setBorder(new EtchedBorder());
		jp2.setBounds(125, 30, 110, 100);
		jf.add(jp2);
		
		jr2 = new JRadioButton[3];
		bg2 = new ButtonGroup();
		for(int i=0; i<3; i++) {
			jr2[i] = new JRadioButton((i+1) + "학년");
			jr2[i].setBounds(25, 10 + i * 30, 60, 20);
			jp2.add(jr2[i]);
			bg2.add(jr2[i]);
		}
		jr2[0].setSelected(true);
		
		jb = new JButton("확인");
		jb.setSize(100, 50);
		jb.addActionListener(this);
		jb.setBounds(75, 150, 100, 30);
		
		jf.add(jb);
		
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String gender = null, grade = null;
		
		for(int i=0; i<jr1.length; i++) {
			if(jr1[i].isSelected()) {
				gender = jr1[i].getText();
			}
		}
		
		for(int i=0; i<jr2.length; i++) {
			if(jr2[i].isSelected()) {
				grade = jr2[i].getText();
			}
		}
		
		if(gender==null || grade == null) {
			JOptionPane.showMessageDialog(null, "성별과 학년을 입력해주세요.");
		} else {
			JOptionPane.showMessageDialog(null, gender + ", " + grade + "을 선택하셨습니다.");
		}
	}
}