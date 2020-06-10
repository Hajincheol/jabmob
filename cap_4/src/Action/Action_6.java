package Action;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Action_6 extends JFrame implements ActionListener {
	JCheckBox[] jc = new JCheckBox[4];
	
	public static void main(String[] args) {
		new Action_6();
	}
	
	public Action_6() {
		setTitle("요일선택");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		String[] cbn = {"워드", "자바", "엑셀", "파워포인트"};
		for(int i=0; i<cbn.length; i++) {
			jc[i] = new JCheckBox(cbn[i]);
			jc[i].addActionListener(this);
			add(jc[i]);
		}
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<jc.length; i++) {
			if(e.getSource().equals(jc[i])) {
				if(jc[i].isSelected()) {
					JOptionPane.showMessageDialog(null, jc[i].getText() + "을 선택했습니다.");
				} else {
					JOptionPane.showMessageDialog(null, jc[i].getText() + "를 해제했습니다.");
				}
			}
		}
	}
}