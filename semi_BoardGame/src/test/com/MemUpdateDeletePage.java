package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.MemberDirDAO;
import test.com.model.MemberDirDAOimpl;
import test.com.model.MemberVO;


public class MemUpdateDeletePage extends JFrame {
	
	
public MemUpdateDeletePage() {

		
	}
	public MemUpdateDeletePage(String num) {
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));
		
		JLabel jl_num = new JLabel("회원번호");
		JLabel jl_num2 = new JLabel(num);
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("비밀번호");
		JLabel name = new JLabel("회원이름");
		JLabel tel = new JLabel("연락처");
		
		MemberVO vo = new MemberVO();
		MemberDirDAO dao = new MemberDirDAOimpl();
		vo.setNum(Integer.parseInt(num));
		MemberVO vo2 = dao.selectOne(vo);
		
		JTextField tf_id = new JTextField(vo2.getId());
		JTextField tf_pw = new JTextField(vo2.getPw());
		JTextField tf_name = new JTextField(vo2.getName());
		JTextField tf_tel = new JTextField(vo2.getTel());
		
		
		JButton btn_deleteOK = new JButton("회원 삭제");
		
		btn_deleteOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_deleteOK");
				System.out.println(jl_num2.getText());
				MemberVO vo = new MemberVO();
				MemberDirDAO dao = new MemberDirDAOimpl();
				vo.setNum(Integer.parseInt(num));
				int result = dao.deleteMember(vo);
				if(result > 0)
					new MemSelectAllPage();
				
			}
		});
		
		JLabel blank = new JLabel("");
		
		
		con.add(jl_num);
		con.add(jl_num2);
		con.add(id);
		con.add(tf_id);
		con.add(pw);
		con.add(tf_pw);
		con.add(name);
		con.add(tf_name);
		con.add(tel);
		con.add(tf_tel);
		con.add(blank);
		con.add(btn_deleteOK);
		
		setTitle("MemUpdateDeletePage");
		setBounds(250, 300, 250, 300);
		setVisible(true);
	}

}
