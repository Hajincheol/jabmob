package JFrame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(300, 300);
		jf.setTitle("JTable 데이터(2차원)");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String cn[] = {"번호", "이름", "성별"};
		Object data[][] = {
				{"1번", "홍길동", "17"},
				{"2번", "유관순", "16"},
				{"3번", "이순신", "15"}
		};
		JTable jta = new JTable(data, cn);
		JScrollPane jsp = new JScrollPane(jta);
		
		jsp.setSize(285, 285);
		jf.add(jsp);
		jf.setVisible(true);
	}
}