package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButton_03 implements ActionListener {
	public static void main(String[] args) {
		new JButton_03().form();
		//리스터는 자신 이벤트를 실행 못하므로 반드시 서브로 사용
	}
	
	public void form() {
		JFrame jf = new JFrame();
		jf.setSize(200, 290);
		jf.setTitle("JButton");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] bn = {"1번", "2번", "3번"};
		
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
		JOptionPane.showMessageDialog(null, "이벤트 발생번호는\n" + e.getActionCommand() + "입니다.");
	}
}