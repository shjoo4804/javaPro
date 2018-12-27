package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoardHome extends JFrame {

	public BoardHome() {

		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 1));

		JLabel title = new JLabel(">> Board GUI HOME");

		JButton btn_insert = new JButton("goto insert");
		btn_insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto insert");

				new BoardInsertPage();
			}
		}); // end btn_insert ActionListener

		JButton btn_selectAll = new JButton("goto selectAll");
		btn_selectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto selectAll");

				new BoardSelectAllPage();
			}
		}); // end btn_selectAll ActionListener

		con.add(title);
		con.add(btn_insert);
		con.add(btn_selectAll);

		setBounds(0, 0, 250, 300);
		setTitle("Board GUI");
		setVisible(true);
	}

}
