package JFrame;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class JPanel_3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(260, 200);
		jf.setTitle("성별 및 학년 선택");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		JLabel jl = new JLabel("성별");
		jl.setBounds(50, 10, 60, 20);
		jf.add(jl);
		
		JPanel jp1 = new JPanel();
		jp1.setBorder(new EtchedBorder());
		jp1.setBounds(10, 30, 110, 100);
		jf.add(jp1);
		
		JRadioButton[] jr1 = new JRadioButton[2];
		ButtonGroup bg1 = new ButtonGroup();
		String[] rn1 = {"남자", "여자"};
		for(int i=0; i<rn1.length; i++) {
			jr1[i] = new JRadioButton(rn1[i]);
			jr1[i].setBounds(25, 20 + i * 40, 60, 20);
			jp1.add(jr1[i]);
			bg1.add(jr1[i]);
		}
		jr1[0].setSelected(true);
		
		jl = new JLabel("학년");
		jl.setBounds(165, 10, 60, 20);
		jf.add(jl);

		JPanel jp2 = new JPanel();
		jp2.setBorder(new EtchedBorder());
		jp2.setBounds(125, 30, 110, 100);
		jf.add(jp2);
		
		JRadioButton[] jr2 = new JRadioButton[3];
		ButtonGroup bg2 = new ButtonGroup();
		for(int i=0; i<3; i++) {
			jr2[i] = new JRadioButton((i+1) + "학년");
			jr2[i].setBounds(25, 10 + i * 30, 60, 20);
			jp2.add(jr2[i]);
			bg2.add(jr2[i]);
		}
		jr2[0].setSelected(true);
		
		jf.setVisible(true);
	}
}