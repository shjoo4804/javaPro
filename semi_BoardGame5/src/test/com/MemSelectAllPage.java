package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.MemberDirDAO;
import test.com.model.MemberDirDAOimpl;
import test.com.model.MemberVO;


public class MemSelectAllPage extends JFrame {
	
	public MemSelectAllPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(2,1));
		
		
		String[] columns = new String[] {
				"ȸ����ȣ","ID","��й�ȣ","ȸ���̸�","����ó"
		};
		MemberDirDAO dao = new MemberDirDAOimpl();
		List<MemberVO> vos = dao.selectAll();
		System.out.println("vos.size()" +vos.size());
		
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
		}//
		
		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouce clicked...");
				String num = datas[table.getSelectedRow()][0];
				System.out.println(num);
				new MemUpdateDeletePage(num);
				dispose();
			}
	
		});
		
		con.add(new JScrollPane(table));
		
		setTitle("��� ȸ������ ��ȸ");
		setBounds(500,0,500,300);
		setVisible(true);
	}

}
