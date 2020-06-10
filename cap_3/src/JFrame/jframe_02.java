package JFrame;

import javax.swing.JFrame;

public class jframe_02 {
	public static void main(String[] args) {
		new jframe_02().form();
	}

	private void form() {
		JFrame jf = new JFrame();
		jf.setSize(600, 300);
		jf.setTitle("JFrame");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
}