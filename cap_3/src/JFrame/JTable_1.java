package JFrame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTable_1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(300, 300);
		jf.setTitle("JTable �÷� �߰�");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		String cn[] = {"��ȣ", "�̸�", "����"};
		DefaultTableModel tmodel = new DefaultTableModel(null, cn);
		
		JTable jta = new JTable(tmodel);
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setSize(285, 285);
		jf.add(jsp);
		jf.setVisible(true);
	}
}