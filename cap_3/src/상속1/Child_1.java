package ���1;

import java.awt.event.ActionEvent;

public class Child_1 extends AFrame {
	public Child_1() {
		layout("����", "�ݱ�");
	}
	
	public void actionPerformed(ActionEvent e) {
		Event(e);
	}
	
	public static void main(String[] args) {
		new Child_1();
	}
}