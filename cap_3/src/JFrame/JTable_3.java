package JFrame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(300, 300);
		jf.setTitle("JTable ������(2����)");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String cn[] = {"��ȣ", "�̸�", "����"};
		Object data[][] = {
				{"1��", "ȫ�浿", "17"},
				{"2��", "������", "16"},
				{"3��", "�̼���", "15"}
		};
		JTable jta = new JTable(data, cn);
		JScrollPane jsp = new JScrollPane(jta);
		
		jsp.setSize(285, 285);
		jf.add(jsp);
		jf.setVisible(true);
	}
}