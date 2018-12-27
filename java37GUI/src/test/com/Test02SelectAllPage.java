package test.com;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Test02SelectAllPage extends JFrame {
	private JTable table;
	
	public Test02SelectAllPage() {
		setTitle("SelectAllPage");
		setBounds(new Rectangle(500, 0, 500, 300));
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column"
				}
				));
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		
		getContentPane().add(scrollPane);

		
		setVisible(true);
	} // end Test02SelectAllPage()
	
}
