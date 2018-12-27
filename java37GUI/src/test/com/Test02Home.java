package test.com;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test02Home extends JFrame {

	public Test02Home() {
		
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton btn_Insert = new JButton("goto insert");
		btn_Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btn_Insert);
		
		JButton btnGotoSelectall = new JButton("goto selectAll");
		btnGotoSelectall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnGotoSelectall);
		
		
		setBounds(new Rectangle(0, 0, 250, 300));
		setTitle("Home");
		setVisible(true); // ** 반드시 마지막줄에 
	} // end Test02Home()
	
}
