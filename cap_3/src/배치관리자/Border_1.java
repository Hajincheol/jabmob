package 배치관리자;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_1 extends JFrame {
	public static void main(String[] args) {
		new Border_1();
	}
	
	JPanel mp;
	
	public Border_1() {
		setSize(300, 200);
		setTitle("Border 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp=new JPanel(new BorderLayout());
		add(mp);
		mp.add(new JButton("북"), BorderLayout.NORTH);
		mp.add(new JButton("서"), BorderLayout.WEST);
		mp.add(new JButton("중앙"), BorderLayout.CENTER);
		mp.add(new JButton("동"), BorderLayout.EAST);
		mp.add(new JButton("남"), BorderLayout.SOUTH);
		setVisible(true);
	}
}