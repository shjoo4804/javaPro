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

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class ScoreSelectAllPage extends JFrame {

	public ScoreSelectAllPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		ScoreDAO dao = new ScoreDAOimpl();
		List<ScoreVO> vos = dao.selectAll();
		System.out.println("vos.size:"+vos.size());
		
		String[] columns = new String[] {"NUM", "NAME", "KOR", "ENG", "MATH","TOAL", "AVG", "GRADE"};
		String[][] datas = new String[vos.size()][columns.length];
		int count = 0;
		
		for (ScoreVO vo : vos) { 
			datas[count] = new String[] {
					vo.getNum()+"",
					vo.getName(),
					vo.getKor()+"",
					vo.getEng()+"",
					vo.getMath()+"",
					vo.getTotal()+"",
					vo.getAvg()+"",
					vo.getGrade()
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
				System.out.println(num);
				
				new ScoreUpdatePage(num);
			}
		});
		
		
		JButton btn_insertOK = new JButton("goto insert");
		btn_insertOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_insertOK");
				new ScoreInsertPage();
			}
		});
		
		con.add(new JScrollPane(table));
		con.add(btn_insertOK);
		
		setBounds(500, 0, 500, 500);
		setTitle("SelectAll Page");
		setVisible(true);
	} // end ScoreSelectAllPage()
	
} // end class
