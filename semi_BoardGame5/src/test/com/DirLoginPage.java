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

public class DirLoginPage extends JFrame {
	
	private final String dirPw = "1"; // ������ ��й�ȣ

	public DirLoginPage() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 1));
		
		JLabel msg = new JLabel("������ ��й�ȣ�� �Է��ϼ���");
		JTextField inputPw = new JTextField();
		
		
		JButton check = new JButton("������ ȭ�� �����ϱ�");
		check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(inputPw.getText().equals(dirPw)) {

					new DirPage();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �����ʽ��ϴ�.", "�α��� ����", JOptionPane.WARNING_MESSAGE);

				}
				
			}
		});
		
		con.add(msg);
		con.add(inputPw);
		con.add(check);
		
		
		setBounds(250, 0, 250, 300);
		setTitle("������ �α���");
		setVisible(true);
	}
	
}
