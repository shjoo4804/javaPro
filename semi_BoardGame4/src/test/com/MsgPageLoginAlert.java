package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MsgPageLoginAlert extends JFrame {
	
	JLabel blank = new JLabel();
	
	public  MsgPageLoginAlert() {
		// TODO Auto-generated constructor

	//2. �����̳� + ���̾ƿ�
	Container con = getContentPane();  //���� ���� container
	con.setLayout(new GridLayout(3, 1)); //2�� 1��
	//component (JButton, JTextField, JLabel, JTable)
	
	
	//4. �̺�Ʈ ó�� 
	JLabel btn_user = new JLabel("3�� �ڿ� ����˴ϴ�...");
	con.add(btn_user);
	
	
	//4. �̺�Ʈ ó�� 
	JButton btn_user2 = new JButton("Ȯ��");
	btn_user2.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("btn_user2");
			
			new Thread() {
				public void run() {
					setTime();
				};
			}.start();
			
		}
	}); 

	
	
	//3. ������Ʈ �߰�
 
  		con.add(btn_user2);
  		con.add(blank);
  		
  	
  		
	//1.
	setTitle("alert");
	setBounds(500, 0, 250, 200); //��ġ�� ũ�� �ѹ���
	setVisible(true); //â ����...
	
	}

	
	// �޼ҵ�� �����ؼ� ������ �ȿ� �ֱ�
	public void setTime() {
		try {
			
			for (int i = 3; i > 0; i--) {
	            System.out.println(i);
	            blank.setText((i)+"");
				blank.getText();
				Thread.sleep(1000);
			}
			
			this.setVisible(false);
			new LoginPage();
			

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
