package test.com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.RoomDirDAO;
import test.com.model.RoomDirDAOimpl;
import test.com.model.RoomVO;

public class RoomSelectAllPage extends JFrame {
	
//	public final int dirPassword= 2018;
	
	// �մԿ� SelectAll������ 
	public RoomSelectAllPage() { 
		setBounds(500, 0, 400, 300);
		setTitle("�� �����ϱ�");
		
		String[] columns = new String[] { "���ȣ", "�̿�ð�", "�̿뿩��", "���ð���"};
		RoomDirDAO dao = new RoomDirDAOimpl();
		List<RoomVO> vos = dao.selectAll();
		
		String[][] datas = new String[vos.size()][columns.length];
		int count =0;
		for (RoomVO vo : vos) {
			String useRemain="";
			if (vo.getRemain()==1) {
				useRemain="�̿���";
			} else if (vo.getRemain()==0) {
				useRemain="�������";
			}
			datas[count]=new String[] {
					vo.getNum()+"",
					vo.getTime()+"",
					useRemain,
					vo.getRoomGame()
			};
			count ++;
		}
		
		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mouseClicked(MouseEvent e) {
				String num = datas[table.getSelectedRow()][0];
					
				if(vos.get(table.getSelectedRow()).getRemain() == 1) { 
					// �̿���(remain�� 1)�� ���� ������ �� �޼����� ������
					JOptionPane.showMessageDialog(null, "�̹� �̿����� ���Դϴ�.", "�̿���", JOptionPane.PLAIN_MESSAGE);
				}
				
				else if(vos.get(table.getSelectedRow()).getRemain() == 0) {
					new RoomUpdatePage(num);
					dispose();
				}
				
			}
		});
		JScrollPane scrollPane = new JScrollPane(table);
		
		
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		setVisible(true);
	} // end RoomSelectAllPage()
	
	
	
	// �����ڿ� SelectAll ������ new RoomSelectAllPage(2018); �� ����
	public RoomSelectAllPage(int num) { 
		setBounds(500, 0, 400, 300);
		setTitle("��� �� ��ȸ�ϱ�");
		
		if(num==2018) { // ������ ������
			getContentPane().setLayout(new BorderLayout(0, 0));
			JLabel lblNewLabel = new JLabel("�����ϰų� ������ų ���� Ŭ�����ּ���.");
			lblNewLabel.setPreferredSize(new Dimension(30, 15));
			lblNewLabel.setMinimumSize(new Dimension(30, 15));
			lblNewLabel.setMaximumSize(new Dimension(30, 15));
			getContentPane().add(lblNewLabel, BorderLayout.NORTH);
			
			
			JButton btnNewButton = new JButton("�� ���� �߰��ϱ�");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					RoomDirDAO dao = new RoomDirDAOimpl();
					RoomVO vo = new RoomVO();
					
					int result = dao.insert(vo);
					
					if (result == 1) { // insert�� �������� ��
						System.out.println("�� �߰��� �����߽��ϴ�");
					} else if (result == 0) {
						System.out.println("�� �߰��� �����߽��ϴ�");
					}

					new RoomSelectAllPage(2018);
					dispose();
				}
			});
			btnNewButton.setPreferredSize(new Dimension(65, 23));
			btnNewButton.setMinimumSize(new Dimension(65, 23));
			btnNewButton.setMaximumSize(new Dimension(65, 23));
			getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		}
		

		String[] columns = new String[] { "���ȣ", "�̿�ð�", "�̿뿩��", "���ð���"};
		RoomDirDAO dao = new RoomDirDAOimpl();
		List<RoomVO> vos = dao.selectAll();
		
		String[][] datas = new String[vos.size()][columns.length];
		int count =0;
		for (RoomVO vo : vos) {
			String useRemain="";
			if (vo.getRemain()==1) {
				useRemain="�̿���";
			} else if (vo.getRemain()==0) {
				useRemain="�������";
			}
			datas[count]=new String[] {
					vo.getNum()+"",
					vo.getTime()+"",
					useRemain,
					vo.getRoomGame()
			};
			count ++;
		}
		
		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
			@Override
			public void mouseClicked(MouseEvent e) {
				String num = datas[table.getSelectedRow()][0];
				new RoomUpdateDeletePage(num);
				dispose();
			}
		});
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		
		setVisible(true);
	} // end RoomSelectAllPage(int num)

}
