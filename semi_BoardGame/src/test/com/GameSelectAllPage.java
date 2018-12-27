package test.com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.GameDirDAO;
import test.com.model.GameDirDAOimpl;
import test.com.model.GameVO;

public class GameSelectAllPage extends JFrame {
	private JTable table;

	public GameSelectAllPage(int number) {

		getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("수정하거나 삭제시킬 번호를 클릭해주세요.");
		lblNewLabel.setPreferredSize(new Dimension(30, 15));
		lblNewLabel.setMinimumSize(new Dimension(30, 15));
		lblNewLabel.setMaximumSize(new Dimension(30, 15));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JButton btnNewButton = new JButton("추가하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GameInsertPage();
			}
		});
		btnNewButton.setPreferredSize(new Dimension(65, 23));
		btnNewButton.setMinimumSize(new Dimension(65, 23));
		btnNewButton.setMaximumSize(new Dimension(65, 23));
//      btnNewButton.setActionCommand("South");
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);

		String[] columns = new String[] { "게임번호", "게임이름", "난이도", "게임가능인원수" };

		GameDirDAO dao = new GameDirDAOimpl();
		List<GameVO> vos = dao.selectAll();
//      System.out.println("vos size:" + vos.size());

		String[][] datas = new String[vos.size()][columns.length];
		int count = 0;
		for (GameVO vo : vos) {
			datas[count] = new String[] { vo.getNum() + "", vo.getName(), vo.getGameLevel() + "",
					vo.getPeopleCount() + "" };// count방에 넣고 ...
			count++;
		}

		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mouseClicked(MouseEvent e) {
				String num = datas[table.getSelectedRow()][0];
				new GameUpdateDeletePage(num);
//            new GameUpdatePage();

			}
		});

		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		setVisible(true);
		setBounds(new Rectangle(500, 0, 400, 300));
		setTitle("GameSelectAllPage");
	}

	public GameSelectAllPage() {

		String[] columns = new String[] { "게임번호", "게임이름", "난이도", "게임가능인원수" };

		GameDirDAO dao = new GameDirDAOimpl();
		List<GameVO> vos = dao.selectAll();

		String[][] datas = new String[vos.size()][columns.length];
		int count = 0;
		for (GameVO vo : vos) {
			datas[count] = new String[] { vo.getNum() + "", vo.getName(), vo.getGameLevel() + "",
					vo.getPeopleCount() + "" };
			count++;
		}

		DefaultTableModel dm = new DefaultTableModel(datas, columns);
		JTable table = new JTable(dm);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String num = datas[table.getSelectedRow()][0];
//            user game 선택 후 다음페이지 

			}
		});
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);

//      GameDirDAO dao = new GameDirDAOimpl();
//      List<GameVO> vos = dao.selectAll();
		GameVO vo = new GameVO();

		Random r = new Random();
		int su = r.nextInt(vos.size()) + 1;
		vo.setNum(su);
		GameVO vo2 = dao.selectOne(vo);

		JLabel lrandom = new JLabel("오늘의 추천 게임은 " + vo2.getName() + "입니다.");
		getContentPane().add(lrandom);

		setVisible(true);
		setTitle("GameSelectAllPage");
		setBounds(new Rectangle(500, 0, 400, 300));

	}

}