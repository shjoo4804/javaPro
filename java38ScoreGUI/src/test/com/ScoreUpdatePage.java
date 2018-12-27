package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.ScoreDAO;
import test.com.model.ScoreDAOimpl;
import test.com.model.ScoreVO;

public class ScoreUpdatePage extends JFrame {

	public ScoreUpdatePage() {
	} // end ScoreUpdatePage()
	
	public ScoreUpdatePage(String num) {
		
		ScoreDAO dao = new ScoreDAOimpl();
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,2));
		
		JLabel jl_num = new JLabel("num");
		JLabel jl_num2 = new JLabel(num);
		
		// selectOne 추가
		ScoreVO vo = new ScoreVO();
		System.out.println("검색할 번호:");
		vo.setNum(Integer.parseInt(num));
		ScoreVO vo2 = dao.selectOne(vo);
		
		JLabel name = new JLabel("name");
		JLabel kor = new JLabel("kor");
		JLabel eng = new JLabel("eng");
		JLabel math = new JLabel("math");
		
		JTextField tf_name = new JTextField(vo2.getName());
		JTextField tf_kor = new JTextField(vo2.getKor()+"");
		JTextField tf_eng = new JTextField(vo2.getEng()+"");
		JTextField tf_math = new JTextField(vo2.getMath()+"");
		
		JButton btn_updateOK = new JButton("updateOK");
		btn_updateOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("updateOK");
				
				ScoreVO vo = new ScoreVO();
				vo.setNum(Integer.parseInt(num));
				vo.setName(tf_name.getText());
				vo.setKor(Integer.parseInt(tf_kor.getText()));
				vo.setEng(Integer.parseInt(tf_eng.getText()));
				vo.setMath(Integer.parseInt(tf_math.getText()));
				
				int result = dao.update(vo);
				if(result>0) {
					new ScoreSelectAllPage();
				}
			}
		});
		
		JButton btn_deleteOK = new JButton("deleteOK");
		btn_deleteOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("deleteOK");
				ScoreVO vo = new ScoreVO();
				System.out.println("삭제할 번호:" + vo.getNum());
				vo.setNum(Integer.parseInt(num));
				int result = dao.delete(vo);
				if(result>=1) {
					new ScoreSelectAllPage();
				}
			}
		});
		
		con.add(jl_num);
		con.add(jl_num2);
		con.add(name);
		con.add(tf_name);
		con.add(kor);
		con.add(tf_kor);
		con.add(eng);
		con.add(tf_eng);
		con.add(math);
		con.add(tf_math);
		con.add(btn_updateOK);
		con.add(btn_deleteOK);
		
		setBounds(0, 300, 250, 300);
		setTitle("UpdatePage");
		setVisible(true);
	} // end ScoreUpdatePage(String num)
	
} // end class
