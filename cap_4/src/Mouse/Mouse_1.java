package Mouse;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Mouse_1 extends AFrame {
	JPanel mp;
	JTextField[] jt = new JTextField[4];
	DefaultTableModel tmodel;
	JTable jta;
	JScrollPane jsp;
	
	public Mouse_1() {
		super("테이블 선택 마우스리스너");
		setSize(380, 300);
		mp = new JPanel(new BorderLayout());
		cp = new JPanel(new FlowLayout());
		
		add(mp);
		mp.add(cp);
		
		String[] col = {"이        름", "학        년", "전화번호", "학        과"};
		String[][] row = {
				{"홍길동", "4", "010-1111-1111", "컴퓨터공학과"},
				{"이순신", "1", "010-1234-1234", "컴퓨터공학과"},
				{"유관순", "2", "010-8965-1464", "앱개발과"}
		};
		
		for(int i=0; i<col.length; i++) {
			jt[i] = new JTextField(10);
			jt[i].setHorizontalAlignment(0);

			cp.add(new JLabel(col[i], JLabel.CENTER));
			cp.add(jt[i]);
		}
		
		sp = new JPanel(new FlowLayout());
		tmodel = new DefaultTableModel(row, col);
		jta = new JTable(tmodel);
		mp.add(sp, BorderLayout.SOUTH);
		
		jsp = new JScrollPane(jta);
		jsp.setPreferredSize(new Dimension(350, 170));
		sp.add(jsp);
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(0);
		
		for(int i=0; i<row.length; i++) {
			tmodel.addRow(row[i]);
			jta.getColumnModel().getColumn(i).setCellRenderer(dtcr);
		}
		jta.addMouseListener(this);
		showFrame();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int row = jta.rowAtPoint(e.getPoint());
		for(int i=0; i<tmodel.getColumnCount(); i++) {
			jt[i].setText((String) jta.getValueAt(row, i));
		}
	}

	public static void main(String[] args) {
		new Mouse_1();
	}
}