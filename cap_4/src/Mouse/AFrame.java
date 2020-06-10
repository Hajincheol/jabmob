package Mouse;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AFrame extends JFrame implements ActionListener, MouseListener, WindowListener, FocusListener {
	JPanel np, ep, sp, wp, cp;
	
	public AFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(this);
		np = new JPanel(new BorderLayout());
		ep = new JPanel(new BorderLayout());
		sp = new JPanel(new BorderLayout());
		wp = new JPanel(new BorderLayout());
		cp = new JPanel(new BorderLayout());
		
		add(np, BorderLayout.NORTH);
		add(ep, BorderLayout.EAST);
		add(sp, BorderLayout.SOUTH);
		add(wp, BorderLayout.WEST);
		add(cp, BorderLayout.CENTER);
	}
	
	public void showFrame() {
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public void showPack() {
		setVisible(true);
		setLocationRelativeTo(null);
		pack();
	}
	
	public void size(Component c, int w, int h) {
		c.setPreferredSize(new Dimension(w, h));
	}
	
	public void wsmg(String t) {
		JOptionPane.showMessageDialog(null, t, "¿À·ù", JOptionPane.WARNING_MESSAGE);
	}
	
	public void ismg(String t) {
		JOptionPane.showMessageDialog(null, t, "È®ÀÎ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void sfont(Component c, int i) {
		c.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, i));
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}