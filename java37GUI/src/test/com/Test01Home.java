package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test01Home extends JFrame {

	public Test01Home() {

		// 2. 컨테이너 + 레이아웃
		Container con =	getContentPane();
		con.setLayout(new GridLayout(2, 1));
		
		// 4. 이벤트 처리
		JButton btn_insert = new JButton("goto insert");
		btn_insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // 콜백 메소드
				System.out.println("btn_insert");
				
				new InsertPage();
			}
		}); // 이벤트(클릭하면 어떤 동작이 되는 것) 처리
		
		JButton btn_selectAll = new JButton("goto selectAll"); 
		btn_selectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_selectAll"); 
				
				new SelectAllPage();
			}
		});
		
		
		// 3. 컴포넌트
		con.add(btn_insert);
		con.add(btn_selectAll); // JButton의 인자로 text, icon, ...
		

		// 1.
		setBounds(0, 0, 250, 300); // setLocation()과 setSize()를 같이 설정해줌
		setTitle("HOME");
		setVisible(true); // 기본값:false
	} // end Test01Home()

}
