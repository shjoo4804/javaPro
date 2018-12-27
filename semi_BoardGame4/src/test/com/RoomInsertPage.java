//package test.com;
//
//import java.awt.GridLayout;
//import java.awt.Rectangle;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//import test.com.model.GameDirDAO;
//import test.com.model.GameDirDAOimpl;
//import test.com.model.GameVO;
//import test.com.model.RoomDirDAO;
//import test.com.model.RoomDirDAOimpl;
//import test.com.model.RoomVO;
//
//public class RoomInsertPage extends JFrame {
//	private JTextField tx_name;
//	private JTextField tx_gameLevel;
//	private JTextField tx_peopleCount;
//
//	public RoomInsertPage() {
//		getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
//
//		JLabel name = new JLabel("���ȣ");
//		getContentPane().add(name);
//
//		tx_name = new JTextField();
//		getContentPane().add(tx_name);
//		tx_name.setColumns(10);
//
//		JButton btn_insertOK = new JButton("�� �߰�");
//		btn_insertOK.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				RoomDirDAO dao = new RoomDirDAOimpl();
//				RoomVO vo = new RoomVO();
//				vo.setNum(Integer.parseInt(tx_name.getText()));
//				int result = dao.insert(vo);
//				
//				if (result == 1) { // insert�� �������� ��
//					System.out.println("�� �߰��� �����߽��ϴ�");
//				} else if (result == 0) {
//					System.out.println("�� �߰��� �����߽��ϴ�");
//				}
//
//				new RoomSelectAllPage(2018);
//				dispose();
//			}
//		});
//		getContentPane().add(btn_insertOK);
//
//		JButton btn_selectAll = new JButton("�� ��ȸ�ϱ�");
//		btn_selectAll.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				new RoomSelectAllPage(2018);
//				dispose();
//			}
//		});
//		getContentPane().add(btn_selectAll);
//
//		setTitle("RoomInsertPage");
//		setBounds(new Rectangle(500, 0, 250, 300));
//		setVisible(true);
//	} // end RoomInsertPage()
//
//}
