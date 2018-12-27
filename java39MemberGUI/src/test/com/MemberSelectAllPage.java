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

import test.com.model.MemberDAO;
import test.com.model.MemberDAOimpl;
import test.com.model.MemberVO;

public class MemberSelectAllPage extends JFrame {
	public MemberSelectAllPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		MemberDAO dao = new MemberDAOimpl();
		List<MemberVO> vos = dao.selectAll();
		
		String[] columns = new String[] {"NUM", "ID", "PASSWORD", "NAME", "TEL"};
		String[][] datas = new String[vos.size()][columns.length];
		
		int count = 0;
		
		for (MemberVO vo : vos) {
			datas[count] = new String[] {
				vo.getNum()+"",
				vo.getId(),
				vo.getPw(),
				vo.getName(),
				vo.getTel()
			};
			count++;
		}

		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked..");
				String num = datas[table.getSelectedRow()][0];
				
				new MemberUpdatePage(num);
			}
		});
		
		JButton btn_insert = new JButton("goto insert");
		btn_insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto insert");
				
				new MemberInsertPage();
			}
		});
		
		con.add(new JScrollPane(table));
		con.add(btn_insert);
		
		
		setBounds(600, 0, 500, 300);
		setTitle("SelectAll Page");
		setVisible(true);
	} // end MemberSelectAllPage()
}
