package test.com;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.GameVO;
import test.com.model.RoomDirDAO;
import test.com.model.RoomDirDAOimpl;
import test.com.model.RoomUserDAO;
import test.com.model.RoomUserDAOimpl;
import test.com.model.RoomVO;

public class RoomUpdateDeletePage extends JFrame {
	private JTextField tx_name;
	private JTextField tx_gameLevel;
	private JTextField tx_peopleCount;

	public RoomUpdateDeletePage() {
		// TODO Auto-generated constructor stub
	}

	public RoomUpdateDeletePage(String num) {
		getContentPane().setLayout(new GridLayout(5, 2, 0, 0));

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

		JLabel time2 = new JLabel(vo2.getTime() + "");
		getContentPane().add(time2);

		JLabel remain = new JLabel("�̿뿩��");
		getContentPane().add(remain);

		JLabel remain2 = new JLabel(vo2.getRemain() + "");
		getContentPane().add(remain2);
		
		JLabel roomGame = new JLabel("���ð���");
		getContentPane().add(roomGame);

		JLabel roomGame1 = new JLabel(vo2.getRoomGame() + "");
		getContentPane().add(roomGame1);

		JButton btn_roomReset = new JButton("�� �ʱ�ȭ");
		// �̿�ð��� 0, �̿뿩�θ� 0���� ����
		btn_roomReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomUserDAO dao = new RoomUserDAOimpl();
				RoomVO vo = new RoomVO();
				vo.setNum(Integer.parseInt(num));
				vo.setTime(0);
				vo.setRemain(0);
				vo.setRoomGame(null);
				
				int result = dao.update(vo);
				
				if (result >= 1) { // update�� �������� ��
					System.out.println("���� �̿�ð��� �ʱ�ȭ �߽��ϴ�.");
				} else {
					System.out.println("�ʱ�ȭ ����");
				}
				
				new RoomSelectAllPage(2018);
				dispose();
			}
		});
		getContentPane().add(btn_roomReset);

		JButton btn_roomDelete = new JButton("�� ����");
		btn_roomDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomVO vo = new RoomVO();
				vo.setNum(Integer.parseInt(num));

				int result = dao.delete(vo);
				if (result >= 1) { // delete�� �������� ��
					System.out.println("�� ������ �����߽��ϴ�.");
				} else if (result == 0) {
					System.out.println("�� ������ �����߽��ϴ�. ���� ���� �� �ֽ��ϴ�.");
				}
				
				new RoomSelectAllPage(2018);
				dispose();
			}
		});
		getContentPane().add(btn_roomDelete);

		setVisible(true);
		setBounds(new Rectangle(500, 0, 250, 300));
		setTitle("RoomUpdateDeletePage");
	}
}
