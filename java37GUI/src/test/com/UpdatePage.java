package test.com;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.NoteBookDAO;
import test.com.model.NoteBookDAOimpl;
import test.com.model.NoteBookVO;

public class UpdatePage extends JFrame {

	public UpdatePage() {
		// TODO Auto-generated constructor stub
	}

	public UpdatePage(String num) {
		// 2. 컨테이너+레이아웃
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));

		// 3. 필요한 컴포넌트 오브젝트들 생성
		JLabel jl_num = new JLabel("num");
		JLabel jl_num2 = new JLabel(num);

		JLabel productNo = new JLabel("productNo");
		JLabel productName = new JLabel("productName");
		JLabel modelName = new JLabel("modelName");
		JLabel price = new JLabel("price");
		
		NoteBookDAO dao = new NoteBookDAOimpl();
		NoteBookVO vo = new NoteBookVO();
		vo.setNum(Integer.parseInt(num));
		
		NoteBookVO vo2 = dao.selectOne(vo);

		JTextField tf_productNo = new JTextField(vo2.getProductNO()); // 더미값
		JTextField tf_productName = new JTextField(vo2.getProductName());
		JTextField tf_modelName = new JTextField(vo2.getModelName());
		JTextField tf_price = new JTextField(vo2.getPrice()+"");

		JButton btn_updateOK = new JButton("updateOK");
		JButton btn_deleteOK = new JButton("deleteOK");

		// 4. 이벤트 처리
		btn_updateOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_updateOK");
//				System.out.println(jl_num2.getText());
//				System.out.println(tf_productNo.getText());
//				System.out.println(tf_productName.getText());
//				System.out.println(tf_modelName.getText());
//				System.out.println(tf_price.getText());
				
				NoteBookDAO dao = new NoteBookDAOimpl();
				NoteBookVO vo = new NoteBookVO();

				vo.setNum(Integer.parseInt(jl_num2.getText()));
				vo.setProductNO(tf_productNo.getText()); 
				vo.setProductName(tf_productName.getText());
				vo.setModelName(tf_modelName.getText());
				vo.setPrice(Integer.parseInt(tf_price.getText()));

				int result = dao.update(vo);
				System.out.println("update result : " + result);
				if (result>=1) {
					new SelectAllPage();
				}
				
			}
		});

		btn_deleteOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn_deleteOK");
				
				NoteBookDAO dao = new NoteBookDAOimpl();
				NoteBookVO vo = new NoteBookVO();

				vo.setNum(Integer.parseInt(num));

				int result = dao.delete(vo);
				System.out.println("delete result : " + result);

				if(result > 0) {
					new SelectAllPage();
				}
			}
		});

		// 5. 컨테이너에 컴포넌트 추가
		con.add(jl_num);
		con.add(jl_num2);

		con.add(productNo);
		con.add(tf_productNo);

		con.add(productName);
		con.add(tf_productName);

		con.add(modelName);
		con.add(tf_modelName);

		con.add(price);
		con.add(tf_price);

		con.add(btn_updateOK);
		con.add(btn_deleteOK);

		// 1
		setTitle("Update Page");
		setBounds(0, 300, 250, 300);
		setVisible(true);
	}

}
