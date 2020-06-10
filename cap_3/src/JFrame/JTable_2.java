package JFrame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(300, 300);
		jf.setTitle("JTable 데이터(1차원 배열) 추가");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String cn[] = {"번호", "이름", "성별"};
		String data[] = {"1번", "홍길동", "17"};
		DefaultTableModel tmodel = new DefaultTableModel(null, cn);
		tmodel.addRow(data);
		
		JTable jta = new JTable(tmodel);
		JScrollPane jsp = new JScrollPane(jta);
		
		jsp.setSize(285, 285);
		jf.add(jsp);
		jf.setVisible(true);
	}
}