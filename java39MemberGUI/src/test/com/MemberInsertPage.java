package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.MemberDAO;
import test.com.model.MemberDAOimpl;
import test.com.model.MemberVO;

public class MemberInsertPage extends JFrame {
	public MemberInsertPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(5, 2));

		JLabel jl_id = new JLabel("id");
		JLabel jl_pw = new JLabel("pw");
		JLabel jl_name = new JLabel("name");
		JLabel jl_tel = new JLabel("tel");

		JTextField tf_id = new JTextField("abc");
		JTextField tf_pw = new JTextField("abc123");
		JTextField tf_name = new JTextField("kim");
		JTextField tf_tel = new JTextField("010");

		JButton btn_insertOK = new JButton("insertOK");
		btn_insertOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("insertOK");
				
				MemberDAO dao = new MemberDAOimpl();
				MemberVO vo = new MemberVO();
				vo.setId(tf_id.getText());
				vo.setPw(tf_pw.getText());
				vo.setName(tf_name.getText());
				vo.setTel(tf_tel.getText());
				
				int result = dao.insert(vo);
				
				if(result==1) new MemberSelectAllPage();
				
			}
		});

		JButton btn_selectAll = new JButton("goto selectAll");
		btn_selectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("goto selectAll");

				new MemberSelectAllPage();

			}
		});

		con.add(jl_id);
		con.add(tf_id);

		con.add(jl_pw);
		con.add(tf_pw);

		con.add(jl_name);
		con.add(tf_name);

		con.add(jl_tel);
		con.add(tf_tel);

		con.add(btn_insertOK);
		con.add(btn_selectAll);

		setBounds(300, 0, 300, 300);
		setTitle("Insert Page");
		setVisible(true);
	} // end MemberInsertPage()
}
