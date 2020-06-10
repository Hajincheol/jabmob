package 배치관리자;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow_1 extends JFrame {
	public static void main(String[] args) {
		new Flow_1();
	}
	JPanel mp;
	
	public Flow_1() {
		setSize(350, 200);
		setTitle("FlowLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(mp = new JPanel(new FlowLayout()));
		for(int i=0; i<10; i++) {
			mp.add(new JButton("컴포넌트" + (i+1)));
		}
		setVisible(true);
	}
}