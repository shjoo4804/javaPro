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

public class MemberUpdatePage extends JFrame {
	public MemberUpdatePage() {
		// TODO Auto-generated constructor stub
	} // end MemberUpdatePage()
	
	public MemberUpdatePage(String num) {
		MemberDAO dao = new MemberDAOimpl();
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));
		
		JLabel jl_num = new JLabel("num");
		JLabel jl_num2 = new JLabel(num);
		
		JLabel jl_id = new JLabel("id");
		JLabel jl_pw = new JLabel("pw");
		JLabel jl_name = new JLabel("name");
		JLabel jl_tel = new JLabel("tel");
		
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(num));
		MemberVO vo2 = dao.selectOne(vo);

		JTextField tf_id = new JTextField(vo2.getId());
		JTextField tf_pw = new JTextField(vo2.getPw());
		JTextField tf_name = new JTextField(vo2.getName());
		JTextField tf_tel = new JTextField(vo2.getTel());

		JButton btn_updateOK = new JButton("updateOK");
		btn_updateOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("updateOK");
				
				
				MemberVO vo = new MemberVO();
				vo.setNum(Integer.parseInt(num));
				vo.setId(tf_id.getText());
				vo.setPw(tf_pw.getText());
				vo.setName(tf_name.getText());
				vo.setTel(tf_tel.getText());
				int result = dao.update(vo);
				
				if(result>0) new MemberSelectAllPage();
				
			}
		});

		JButton btn_deleteOK = new JButton("deleteOK");
		btn_deleteOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("deleteOK");
				
				MemberVO vo = new MemberVO();
				vo.setNum(Integer.parseInt(num));
				int result = dao.delete(vo);
				
				if(result>0) new MemberSelectAllPage();
				
			}
		});
		
		con.add(jl_num);
		con.add(jl_num2);
		
		con.add(jl_id);
		con.add(tf_id);

		con.add(jl_pw);
		con.add(tf_pw);

		con.add(jl_name);
		con.add(tf_name);

		con.add(jl_tel);
		con.add(tf_tel);

		con.add(btn_updateOK);
		con.add(btn_deleteOK);
		
		setBounds(0, 300, 300, 300);
		setTitle("SelectAll Page");
		setVisible(true);
	} // end MemberUpdatePage(String num)
}
