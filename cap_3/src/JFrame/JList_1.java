package JFrame;

import javax.swing.JFrame;
import javax.swing.JList;

public class JList_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(60, 180);
		jf.setTitle("JComboBox");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String[] List = {"배", "딸기", "사과", "참외", "키위"};
		JList jl = new JList(List);
		jl.setSize(50, 100);
		jl.setLocation(20, 20);
		jf.add(jl);
		
		jf.setVisible(true);
	}
}