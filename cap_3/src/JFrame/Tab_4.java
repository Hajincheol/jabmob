package JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tab_4 extends JFrame {
	JTabbedPane tabPan;
	JTable1 table;
	JTextArea jta;
	
	class JTable1 extends JPanel {
		public JTable1() {
			String col[] = {"��ȣ", "�̸�", "����"};
			Object row[][] = {
					{"1��", "ȫ�浿", "17"},
					{"2��", "������", "16"},
					{"3��", "�̼���", "15"}
			};
			
			JTable jta = new JTable(row, col);
			JScrollPane jsp = new JScrollPane(jta);
			add(jsp, BorderLayout.CENTER);
			jsp.setPreferredSize(new Dimension(200, 150));
			pack();
		}
	}
	
	public Tab_4() {
		table = new JTable1();
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container con = getContentPane();
		tabPan = new JTabbedPane(JTabbedPane.TOP);
		con.add(tabPan, BorderLayout.CENTER);
		
		tabPan.add("���̺���", table);
		jta = new JTextArea("2�� ����");
		tabPan.add(new JScrollPane(jta), "����");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tab_4();
	}
}