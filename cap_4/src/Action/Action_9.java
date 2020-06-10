package Action;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Action_9 extends JFrame implements ActionListener {
	JRadioButton[] jr = new JRadioButton[5];
	JButton jb;
	JPanel mp, w;
	ButtonGroup bg;
	String[] program = {"Word", "Java", "Excel", "PPT", "C++"};
	//String[] program = "Word,Java,Excel,PPT,C++".split(",");
	
	public Action_9() {
		setTitle("ActionListener");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp = new JPanel(new BorderLayout());
		mp.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		w = new JPanel(new GridLayout(5, 1, 5, 5));
		mp.add(w, BorderLayout.WEST);
		bg = new ButtonGroup();
		
		for(int i=0; i<program.length; i++) {
			jr[i]=new JRadioButton(program[i]);
			bg.add(jr[i]);
			w.add(jr[i]);
		}
		
		jb = new JButton("실행");
		jb.addActionListener(this);
		mp.add(jb, BorderLayout.EAST);
		add(mp);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<jr.length; i++) {
			if(jr[i].isSelected()) {
				JOptionPane.showMessageDialog(null, jr[i].getText() + "과목을 선택되었습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		new Action_9();
	}
}