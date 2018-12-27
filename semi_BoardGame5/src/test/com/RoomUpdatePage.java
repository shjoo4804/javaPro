package test.com;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.RoomDirDAO;
import test.com.model.RoomDirDAOimpl;
import test.com.model.RoomUserDAO;
import test.com.model.RoomUserDAOimpl;
import test.com.model.RoomVO;

public class RoomUpdatePage extends JFrame {

	public RoomUpdatePage() {
		// TODO Auto-generated constructor stub
	} // end RoomUpdatePage()
	
	public RoomUpdatePage(String num) {
		
		getContentPane().setLayout(new GridLayout(3, 2, 0, 0));

		RoomDirDAO dao = new RoomDirDAOimpl();
		RoomVO vo = new RoomVO();
		vo.setNum(Integer.parseInt(num));
		RoomVO vo2 = dao.selectOne(vo);
		
		JLabel jl_num = new JLabel("�� ��ȣ");
		getContentPane().add(jl_num);

		JLabel jl_num2 = new JLabel(num);
		getContentPane().add(jl_num2);

		JLabel time = new JLabel("�̿�ð�");
		getContentPane().add(time);
		
		JTextField time2 = new JTextField(vo2.getTime());
		getContentPane().add(time2);

		JLabel blank = new JLabel("�̿�ð� �Է� ��");
		getContentPane().add(blank);

		JButton btn_timeSet = new JButton("���Ӽ����ϱ�"); 
		// �̿�ð��� ���� �ð����� ����
		btn_timeSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RoomUserDAO dao = new RoomUserDAOimpl();
				RoomVO vo = new RoomVO();
				vo.setNum(Integer.parseInt(num));
				vo.setTime(Integer.parseInt(time2.getText()));

				String remain_txt = "";
				if (vo.getTime() >= 1) { // �̿�ð��� 1�ð� �̻��̸�
					vo.setRemain(1); // �̿���:1���� ����
					remain_txt = "�̿���";
					
				} else if (vo.getTime() == 0) { // �̿�ð��� 0�ð��϶�
					vo.setRemain(0); // �̿����:0���� ����
					remain_txt = "�̿����";
				}
				
				int result = dao.update(vo);
				
				if (result >= 1) { // update�� �������� ��
					System.out.println("���� �̿�ð��� �����߽��ϴ�.");
				} else {
					System.out.println("���� ����");
				}
				
//				new MsgPageRoom(vo.getNum(),vo.getTime(),remain_txt);
				new GameSelectAllPage(vo);
				
				dispose();
				
			}
		});
		getContentPane().add(btn_timeSet);
		

//		JButton btn_gotoGameSelect = new JButton("���Ӽ����ϱ�");
//		//���� �����Ϸ����� ��ư
//		btn_gotoGameSelect.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				new GameSelectAllPage(vo);
//			}
//		});
//		getContentPane().add(btn_gotoGameSelect);


		setBounds(new Rectangle(500, 0, 300, 300));
		setTitle("RoomUpdatePage");
		setVisible(true);
		
	} // end RoomUpdatePage(String num)
	
}
