package 배치관리자;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border_2 extends JFrame {
	public static void main(String[] args) {
		new Border_2();
	}
	
	JPanel mp, pan;
	
	public Border_2() {
		setSize(400, 200);
		setTitle("Border 예제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		mp=new JPanel(new BorderLayout(5, 5));   //5, 5  각 칸 빈칸 생성
		add(mp);
		
		String bn[] = {"North", "East", "Center", "South"};
		for(int i=0; i<bn.length; i++) {
			mp.add(new JButton(bn[i] + "버튼"), bn[i]);
		}
		
		pan = new JPanel(new GridLayout(2, 1, 10, 10));
		for(int i=0; i<2; i++) {
			pan.add(new JButton("West 버튼" + (i+1)));
		}
		
		mp.add(pan, BorderLayout.WEST);
		setVisible(true);
	}
}