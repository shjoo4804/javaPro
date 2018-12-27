package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.com.model.MemberUserDAO;
import test.com.model.MemberUserDAOimpl;
import test.com.model.MemberVO;

public class MemInsertPage extends JFrame {
	

	public MemInsertPage() {
		// 2.�����̳� + ���̾ƿ�
		Container con = getContentPane();
		con.setLayout(new GridLayout(5, 2));
		
		
		//3.�ʿ��� ������Ʈ ������Ʈ�� ����
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("��й�ȣ");
		JLabel name = new JLabel("�̸�");
		JLabel tel = new JLabel("����ó");
		
		JTextField tf_id = new JTextField("");
		JTextField tf_pw = new JTextField("");
		JTextField tf_name = new JTextField("");
		JTextField tf_tel = new JTextField("");
		
		JButton btn_back = new JButton("����ȭ��");
		JButton btn_OK = new JButton("�Է�");
		
		//4.�̺�Ʈó��
		btn_OK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_OK");
				System.out.println(tf_id.getText());
				System.out.println(tf_pw.getText());
				System.out.println(tf_name.getText());
				System.out.println(tf_tel.getText());
				
				MemberUserDAO dao = new MemberUserDAOimpl();
				MemberVO vo = new MemberVO();
				vo.setId(tf_id.getText());
				vo.setPw(tf_pw.getText());
				vo.setName(tf_name.getText());
				vo.setTel(tf_tel.getText());
				
				int result = dao.insertMember(vo);
				System.out.println(result);
				if (result==1) {
					JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����߽��ϴ�!", "ȸ������ ����", JOptionPane.INFORMATION_MESSAGE);
					new LoginPage();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����߽��ϴ�.", "ȸ������ ����", JOptionPane.WARNING_MESSAGE);

				}
				
			}
		});
		
		btn_back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UserPage();
				
			}
		});
		
		//5.�����̳ʿ� ������Ʈ �߰�
		con.add(id);
		con.add(tf_id);
		con.add(pw);
		con.add(tf_pw);
		con.add(name);
		con.add(tf_name);
		con.add(tel);
		con.add(tf_tel);
		con.add(btn_OK);
		con.add(btn_back);
		
		// 1.
		setTitle("ȸ������");
		setBounds(500, 0, 250, 300);
		setVisible(true);
	}

}
