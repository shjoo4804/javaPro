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

public class BoardUpdatePage extends JFrame {
	public BoardUpdatePage() {
	} // end BoardUpdatePage()
	
	
	public BoardUpdatePage(String num) {
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(5, 2));
		
		JLabel jl_num = new JLabel("num");
		JLabel jl_num2 = new JLabel(num);
		
		JLabel title = new JLabel("title");
		JLabel content = new JLabel("content");
		JLabel writer = new JLabel("writer");
		
		BoardDAO dao = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
		vo.setNum(Integer.parseInt(num));
		BoardVO vo2 = dao.selectOne(vo);
		
		JTextField tf_title = new JTextField(vo2.getTitle());
		JTextField tf_content = new JTextField(vo2.getContent());
		JTextField tf_writer = new JTextField(vo2.getWriter());
		
		JButton btn_updateOK = new JButton("updateOK");
		btn_updateOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BoardDAO dao = new BoardDAOimpl();
				BoardVO vo = new BoardVO();
				vo.setNum(Integer.parseInt(num));
				vo.setTitle(tf_title.getText());
				vo.setContent(tf_content.getText());
				vo.setWriter(tf_writer.getText());
				int result = dao.update(vo);

				if(result>0) new BoardSelectAllPage();
			}
		});

		JButton btn_deleteOK = new JButton("deleteOK");
		btn_deleteOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BoardDAO dao = new BoardDAOimpl();
				BoardVO vo = new BoardVO();
				vo.setNum(Integer.parseInt(num));
				int result = dao.delete(vo);
				
				if(result>0) new BoardSelectAllPage();
			}
		});
		
		con.add(jl_num);
		con.add(jl_num2);
		con.add(title);
		con.add(tf_title);
		con.add(content);
		con.add(tf_content);
		con.add(writer);
		con.add(tf_writer);
		con.add(btn_updateOK);
		con.add(btn_deleteOK);
		
		
		setBounds(0, 300, 250, 300);
		setTitle("Insert Page");
		setVisible(true);
	} // BoardUpdatePage(String num)
}
