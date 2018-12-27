package test.com;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.GameDirDAO;
import test.com.model.GameDirDAOimpl;
import test.com.model.GameVO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.awt.event.ActionEvent;

public class GameInsertPage extends JFrame {
	private JTextField tx_name;
	private JTextField tx_gameLevel;
	private JTextField tx_peopleCount;

	public GameInsertPage() {
		getContentPane().setLayout(new GridLayout(4, 2, 0, 0));

		JLabel name = new JLabel("���� �̸�");
		getContentPane().add(name);

		tx_name = new JTextField();
		getContentPane().add(tx_name);
		tx_name.setColumns(10);

		JLabel gameLevel = new JLabel("���̵�");
		getContentPane().add(gameLevel);

		tx_gameLevel = new JTextField();
		getContentPane().add(tx_gameLevel);
		tx_gameLevel.setColumns(10);

		JLabel peopleCount = new JLabel("���� �ο� ��");
		getContentPane().add(peopleCount);
		
		tx_peopleCount = new JTextField();
		getContentPane().add(tx_peopleCount);
		tx_peopleCount.setColumns(10);

		JButton btn_insertOK = new JButton("���� �߰�");
		btn_insertOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameDirDAO dao = new GameDirDAOimpl();
				GameVO vo = new GameVO();
				vo.setName(tx_name.getText());
				vo.setGameLevel(Integer.parseInt(tx_gameLevel.getText()));
				vo.setPeopleCount(Integer.parseInt(tx_peopleCount.getText()));
				int result = dao.insert(vo);
				new GameSelectAllPage(2018);
				dispose();
			}
		});
		getContentPane().add(btn_insertOK);

		JButton btn_selectAll = new JButton("���� ��ȸ�ϱ�");
		btn_selectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GameSelectAllPage(2018);
			}
		});
		getContentPane().add(btn_selectAll);

		setTitle("GameInsertPage");
		setBounds(new Rectangle(500, 0, 250, 300));
		setVisible(true);
	}

}