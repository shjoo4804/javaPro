package test.com;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import test.com.model.RoomVO;

public class ResultPage extends JFrame {

	public ResultPage() {
	} // end Resultpage()

	public ResultPage(RoomVO vo) {
		setTitle("Ȯ��â");
		setBounds(500, 0, 400, 300);
		getContentPane().setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel num = new JLabel("������ �� ��ȣ");
		getContentPane().add(num);
		
		JLabel userNum = new JLabel(vo.getNum()+"");
		getContentPane().add(userNum);
		
		JLabel time = new JLabel("�̿�ð�");
		getContentPane().add(time);
		
		Calendar cal = Calendar.getInstance();
		
		int exitTime = (cal.get(Calendar.HOUR_OF_DAY)+vo.getTime());
		String str="";
		if(exitTime > 24) {
			exitTime = 24;
			str = cal.get(Calendar.HOUR_OF_DAY)+"��"
					+ cal.get(Calendar.MINUTE)+"��~"
					+ exitTime+"�� 00�б���";
		} else {
			str = cal.get(Calendar.HOUR_OF_DAY)+"��"
					+ cal.get(Calendar.MINUTE)+"��~"
					+ exitTime+"��"
					+ cal.get(Calendar.MINUTE)+"�б���";
		}
		
		JLabel userTime = new JLabel(str);
		getContentPane().add(userTime);
		
		
		
		JLabel game = new JLabel("���ð���");
		getContentPane().add(game);
		
		JLabel userGame = new JLabel(vo.getRoomGame());
		getContentPane().add(userGame);
		
		JButton btn_exit = new JButton("ùȭ������");
		btn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				dispose();
				
			}
		});
		getContentPane().add(btn_exit);
		
		JButton btn_event = new JButton("�ζ��̺�Ʈ�ϱ�");
		btn_event.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EventPage();
				dispose();
				
			}
		});
		getContentPane().add(btn_event);
		
		setVisible(true);
		
	} // end ResultPage(RoomVO vo)
}
