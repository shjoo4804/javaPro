package test.com;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginfailPage extends JFrame {
	
	public LoginfailPage() {
		// TODO Auto-generated constructor

	//2. �����̳� + ���̾ƿ�
	Container con = getContentPane();  //���� ���� container
	con.setLayout(new GridLayout(1, 1)); //2�� 1��
	//component (JButton, JTextField, JLabel, JTable)
	
	
	//4. �̺�Ʈ ó�� 
	JLabel btn_user = new JLabel("id�� pw�� ��ġ���� �ʽ��ϴ�");

}
	
}
