package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MsgPageFindPw extends JFrame {

	
	public MsgPageFindPw(String text) {
		// TODO Auto-generated constructor

	//2. �����̳� + ���̾ƿ�
	Container con = getContentPane();  //���� ���� container
	con.setLayout(new GridLayout(2, 2)); //2�� 1��
	//component (JButton, JTextField, JLabel, JTable)
	
	
	//4. �̺�Ʈ ó�� 
	JLabel btn_user = new JLabel("��й�ȣ:");
	JLabel btn_user2 = new JLabel(text);
	
	
	//4. �̺�Ʈ ó�� 
	JButton btn_user3 = new JButton("�α����ϱ�");
	btn_user3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("btn_user3");
			new LoginPage();
			dispose();
		}
	}); 
		

	JLabel blank = new JLabel("");
	
	//3. ������Ʈ �߰�
 
  		con.add(btn_user);
  		con.add(btn_user2);
  		con.add(blank);
  		con.add(btn_user3);
  		
	                                     
	//1.
	setTitle("FindPW");
	setBounds(500, 300, 250, 200); //��ġ�� ũ�� �ѹ���
	setVisible(true); //â ����...
	
	}
	
}
