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

		JLabel jl_num = new JLabel("ȸ����ȣ");
		JLabel jl_num2 = new JLabel(num);
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("��й�ȣ");
		JLabel name = new JLabel("ȸ���̸�");
		JLabel tel = new JLabel("����ó");

		MemberVO vo = new MemberVO();
		MemberDirDAO dao = new MemberDirDAOimpl();
		vo.setNum(Integer.parseInt(num));
		MemberVO vo2 = dao.selectOne(vo);

		JLabel tf_id = new JLabel(vo2.getId());
		JLabel tf_pw = new JLabel(vo2.getPw());
		JLabel tf_name = new JLabel(vo2.getName());
		JLabel tf_tel = new JLabel(vo2.getTel());

		JButton btn_selectAll = new JButton("���ȸ����ȸ");

		btn_selectAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MemSelectAllPage();
				dispose();
			}
		});

		JButton btn_deleteOK = new JButton("ȸ�� ����");

		btn_deleteOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_deleteOK");
				System.out.println(jl_num2.getText());
				MemberVO vo = new MemberVO();
				MemberDirDAO dao = new MemberDirDAOimpl();
				vo.setNum(Integer.parseInt(num));
				int result = dao.deleteMember(vo);
				if (result > 0) {
					new MemSelectAllPage();
					dispose();
				}
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
		con.add(btn_selectAll);
		con.add(btn_deleteOK);

		setTitle("ȸ��������ȸ,����");
		setBounds(500, 0, 250, 300);
		setVisible(true);
	}

}
