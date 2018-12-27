package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class ScoreInsertPage extends JFrame {

	public ScoreInsertPage() {
		System.out.println("Insert Page");

		Container con = getContentPane();
		con.setLayout(new GridLayout(5, 2));

		JLabel name = new JLabel("name");
		JLabel kor = new JLabel("kor");
		JLabel eng = new JLabel("eng");
		JLabel math = new JLabel("math");

		JTextField tf_name = new JTextField("abc");
		JTextField tf_kor = new JTextField("90");
		JTextField tf_eng = new JTextField("80");
		JTextField tf_math = new JTextField("70");

		JButton btn_insertOK = new JButton("insertOK");
		btn_insertOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("=====1.insert=====");
				ScoreDAO dao = new ScoreDAOimpl();
				ScoreVO vo = new ScoreVO();
				vo.setName(tf_name.getText());
				vo.setKor(Integer.parseInt(tf_kor.getText()));
				vo.setEng(Integer.parseInt(tf_eng.getText()));
				vo.setMath(Integer.parseInt(tf_math.getText()));

				int result = dao.insert(vo);

				if(result==1) {
					new ScoreSelectAllPage();
				}
			}
		});

		JButton btn_selectAll = new JButton("goto selectAll");
		btn_selectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new ScoreSelectAllPage();
			}
		});

		con.add(name);
		con.add(tf_name);
		con.add(kor);
		con.add(tf_kor);
		con.add(eng);
		con.add(tf_eng);
		con.add(math);
		con.add(tf_math);
		con.add(btn_insertOK);
		con.add(btn_selectAll);

		setBounds(250, 0, 250, 300);
		setTitle("Insert Page");
		setVisible(true);
	} // end ScoreInsertPage()

} // end class
