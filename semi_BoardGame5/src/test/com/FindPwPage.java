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

public class FindPwPage extends JFrame {
	
	public FindPwPage() {
		// 2.�����̳� + ���̾ƿ�
		Container con = getContentPane();
		con.setLayout(new GridLayout(4, 2));
		
		
		//3.�ʿ��� ������Ʈ ������Ʈ�� ����
		JLabel name = new JLabel("�̸�");
		JLabel tel = new JLabel("����ó");
		JLabel id = new JLabel("ID");
		
		
		JTextField tf_name = new JTextField("");
		JTextField tf_tel = new JTextField("");
		JTextField tf_id = new JTextField("");
	
		
		
		JButton btn_OK = new JButton("Ȯ��");
		
		//4.�̺�Ʈó��
		btn_OK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_OK");
				System.out.println(tf_name.getText());
				System.out.println(tf_tel.getText());
				System.out.println(tf_id.getText());
				
				MemberUserDAO dao = new MemberUserDAOimpl();
				MemberVO vo = new MemberVO();
				vo.setName(tf_name.getText());
				vo.setTel(tf_tel.getText());
				vo.setId(tf_id.getText());
				
				MemberVO vo2 = dao.findPw(vo);
				MemberVO m1 = dao.pwCheck(vo);
				
				if(m1 != null) {
					new MsgPageFindPw(vo2.getPw());
					dispose();
				} else {
					System.out.println("��ġ�ϴ� password�� �����ϴ�.");
					JOptionPane.showMessageDialog(null, "��ġ�ϴ� password�� �����ϴ�.", "�˸�", JOptionPane.WARNING_MESSAGE);
				}
			

				
			}
		});
		
		JLabel blank = new JLabel("");
		
		//5.�����̳ʿ� ������Ʈ �߰�
		con.add(name);
		con.add(tf_name);
		con.add(tel);
		con.add(tf_tel);
		con.add(id);
		con.add(tf_id);
		con.add(blank);
		con.add(btn_OK);
	
		
		// 1.
		setTitle("��й�ȣã��");
		setBounds(500, 300, 250, 300);
		setVisible(true);
	}
	

}
