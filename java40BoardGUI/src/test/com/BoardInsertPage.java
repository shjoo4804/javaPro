package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.BoardDAO;
import test.com.model.BoardDAOimpl;
import test.com.model.BoardVO;


public class BoardInsertPage extends JFrame {

	public BoardInsertPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(4, 2));
		
		JLabel title = new JLabel("title");
		JLabel content = new JLabel("content");
		JLabel writer = new JLabel("writer");
		
		JTextField tf_title = new JTextField("java");
		JTextField tf_content = new JTextField("funny java");
		JTextField tf_writer = new JTextField("lee");
		
		JButton btn_insertOK = new JButton("insertOK");
		btn_insertOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BoardDAO dao = new BoardDAOimpl();
				BoardVO vo = new BoardVO();
				vo.setTitle(tf_title.getText());
				vo.setContent(tf_content.getText());
				vo.setWriter(tf_writer.getText());
				int result = dao.insert(vo);

				if(result==1) new BoardSelectAllPage();
			}
		});

		JButton btn_selectAll = new JButton("goto selectAll");
		btn_selectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new BoardSelectAllPage();
			}
		});
		
		con.add(title);
		con.add(tf_title);
		con.add(content);
		con.add(tf_content);
		con.add(writer);
		con.add(tf_writer);
		con.add(btn_insertOK);
		con.add(btn_selectAll);
		
		
		setBounds(250, 0, 250, 300);
		setTitle("Insert Page");
		setVisible(true);
	} // end BoardInsertPage()
	
}
