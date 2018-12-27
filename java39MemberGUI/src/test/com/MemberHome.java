package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MemberHome extends JFrame {
	
	public MemberHome() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 1));
		
		JLabel title = new JLabel(">> Member GUI HOME");
		
		JButton btn_insert = new JButton("goto insert");
		btn_insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto insert");
				
				new MemberInsertPage();
			}
		});
		
		JButton btn_selectAll = new JButton("goto selectAll");
		btn_selectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto selectAll");
				
				new MemberSelectAllPage();
				
			}
		});
		
		con.add(title);
		con.add(btn_insert);
		con.add(btn_selectAll);
		
		setBounds(0, 0, 300, 300);
		setTitle("Member GUI");
		setVisible(true);
	} // end MemberHome()

}
