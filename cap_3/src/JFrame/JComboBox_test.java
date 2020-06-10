package JFrame;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox_test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("JComboBox_test");
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] animals = {"사자", "토끼", "다람쥐", "살쾡이", "여우"};
		//String[] animals = "사자,토끼,다람쥐,고양이,강아지".split(",");
		
		JComboBox jc = new JComboBox(animals);
		jc.setBounds(10, 20, 100, 30);
		jf.add(jc);
		
		JButton jb = new JButton("위치확인");
		jb.setBounds(10, 60, 100, 30);
		jf.add(jb);
		
		jf.setVisible(true);
	}
}