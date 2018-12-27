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

import test.com.model.NoteBookDAO;
import test.com.model.NoteBookDAOimpl;
import test.com.model.NoteBookVO;

public class SelectAllPage extends JFrame {

	public SelectAllPage() {

		// 2. �����̳�+���̾ƿ�
		Container con = getContentPane();
		con.setLayout(new GridLayout(2,1));
		
		// 4. �̺�Ʈ ó��
		JButton btn_insertOK = new JButton("goto insert");
		btn_insertOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_insertOK");
				new InsertPage();
			}
		});
		
		NoteBookDAO dao = new NoteBookDAOimpl();
		List<NoteBookVO> vos = dao.selectAll();
		System.out.println("vos.size:"+vos.size());
		
		String[] columns = new String[] {"NUM","PRODUCTNO","PRODUCTNAME","MODELNAME","PRICE"};
		String[][] datas = new String[vos.size()][columns.length]; // List���� �־��ֱ�
		
		int count = 0;
		
		for (NoteBookVO vo : vos) {
//			System.out.print(vo.getNum() + " ");
//			System.out.print(vo.getProductNO() + " ");
//			System.out.print(vo.getProductName() + " ");
//			System.out.print(vo.getModelName() + " ");
//			System.out.println(vo.getPrice());
			datas[count] = new String[] {
					vo.getNum()+"",
					vo.getProductNO(),
					vo.getProductName(),
					vo.getModelName(),
					vo.getPrice()+""
			};
			count++;
		}
		
		DefaultTableModel dm = new DefaultTableModel(datas,columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked..");
//				System.out.println(table.getSelectedRow());
//				System.out.println(datas[table.getSelectedRow()][0]);
				String num = datas[table.getSelectedRow()][0];
				System.out.println(num);
				
				
				new UpdatePage(num);
			}
		}); // ���콺 Ŭ�� (MouseAdapter:MouseListener�� ��ӹ��� Ŭ����)
		
		con.add(new JScrollPane(table)); // JScrollPane
		con.add(btn_insertOK); // JBotton
		

		setTitle("SelectAll Page");
		setBounds(500, 0, 250 * 2, 300);
		setVisible(true);
	} // end SelectAllPage()

}
