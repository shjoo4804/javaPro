package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.BoardDAO;
import test.com.model.BoardDAOimpl;
import test.com.model.BoardVO;


public class BoardSelectAllPage extends JFrame {

	public BoardSelectAllPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		BoardDAO dao = new BoardDAOimpl();
		List<BoardVO> vos = dao.selectAll();
		System.out.println("vos.size:"+vos.size());
		
		String[] columns = new String[] {"NUM", "TITLE", "CONTENT", "WRITER", "WDATE"};
		String[][] datas = new String[vos.size()][columns.length];
		
		int count = 0;
		for (BoardVO vo2 : vos) {
			datas[count] = new String[] {
					vo2.getNum()+"",
					vo2.getTitle(),
					vo2.getContent(),
					vo2.getWriter(),
					vo2.getwDate()+""
			};
			count++;
			
		}
		
		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouse clicked..");
				String num = datas[table.getSelectedRow()][0];
				System.out.println(num);
				
				new BoardUpdatePage(num);
			}
		});
		
		
		JButton btn_insert = new JButton("goto insert");
		btn_insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_insert");
				new BoardInsertPage();
			}
		});
		
		
		con.add(new JScrollPane(table));
		con.add(btn_insert);
		

		setBounds(500, 0, 500, 500);
		setTitle("SelectAll Page");
		setVisible(true);
	} // end BoardSelectAllPage()
	
}
