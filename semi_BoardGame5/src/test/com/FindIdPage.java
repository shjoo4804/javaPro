package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.com.model.MemberDirDAO;
import test.com.model.MemberDirDAOimpl;
import test.com.model.MemberUserDAO;
import test.com.model.MemberUserDAOimpl;
import test.com.model.MemberVO;

public class FindIdPage extends JFrame {
	

	public FindIdPage() {
		// 2.�����̳� + ���̾ƿ�
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2));
		
		
		//3.�ʿ��� ������Ʈ ������Ʈ�� ����
		JLabel name = new JLabel("�̸�");
		JLabel tel = new JLabel("����ó");
		
		JTextField tf_name = new JTextField("");
		JTextField tf_tel = new JTextField("");
		
		JButton btn_OK = new JButton("IDã��");
		
		//4.�̺�Ʈó��
		btn_OK.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_OK");
				System.out.println(tf_name.getText());
				System.out.println(tf_tel.getText());
				
				MemberUserDAO dao = new MemberUserDAOimpl();
				MemberVO vo = new MemberVO();
				vo.setName(tf_name.getText());
				vo.setTel(tf_tel.getText());
				
				
				MemberVO vo2 = dao.findId(vo);
				MemberVO m1 = dao.idCheck(vo);
				
				if(m1 != null) {
					new MsgPageFindId(vo2.getId());
					
				} else {
					System.out.println("��ġ�ϴ� id�� �����ϴ�.");
					JOptionPane.showMessageDialog(null, "��ġ�ϴ� id�� �����ϴ�.", "�˸�", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		JLabel blank = new JLabel("");
		
		//5.�����̳ʿ� ������Ʈ �߰�
		con.add(name);
		con.add(tf_name);
		con.add(tel);
		con.add(tf_tel);
		con.add(blank);
		con.add(btn_OK);
	
		
		// 1.
		setTitle("IDã��");
		setBounds(250, 300, 250, 300);
		setVisible(true);
	}
}
