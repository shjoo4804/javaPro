package test.com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.com.model.GameDirDAO;
import test.com.model.GameDirDAOimpl;
import test.com.model.GameVO;
import test.com.model.RoomDirDAO;
import test.com.model.RoomDirDAOimpl;
import test.com.model.RoomUserDAO;
import test.com.model.RoomUserDAOimpl;
import test.com.model.RoomVO;

public class GameSelectAllPage extends JFrame {
   private JTable table;

   public GameSelectAllPage(int number) { // ������������

      getContentPane().setLayout(new BorderLayout(0, 0));

      JLabel lblNewLabel = new JLabel("�����ϰų� ������ų ��ȣ�� Ŭ�����ּ���.");
      lblNewLabel.setPreferredSize(new Dimension(30, 15));
      lblNewLabel.setMinimumSize(new Dimension(30, 15));
      lblNewLabel.setMaximumSize(new Dimension(30, 15));
      getContentPane().add(lblNewLabel, BorderLayout.NORTH);

      JButton btnNewButton = new JButton("�߰��ϱ�");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new GameInsertPage();
            dispose();
         }
      });
      btnNewButton.setPreferredSize(new Dimension(65, 23));
      btnNewButton.setMinimumSize(new Dimension(65, 23));
      btnNewButton.setMaximumSize(new Dimension(65, 23));
//      btnNewButton.setActionCommand("South");
      getContentPane().add(btnNewButton, BorderLayout.SOUTH);

      String[] columns = new String[] { "���ӹ�ȣ", "�����̸�", "���̵�", "���Ӱ����ο���" ,"������ Ƚ��"};

      GameDirDAO dao = new GameDirDAOimpl();
      List<GameVO> vos = dao.selectAll();
      
      GameVO gvo = new GameVO();
//      gvo.setNum(vos.get(table.getSelectedRow()).getNum());
//      GameDirDAO gDao = new GameDirDAOimpl();
      GameVO vo_game = dao.selectOne(gvo);
      dao.updatePopularity(vo_game);

      String[][] datas = new String[vos.size()][columns.length];
      int count = 0;
      for (GameVO vo : vos) {
         datas[count] = new String[] { vo.getNum() + "", vo.getName(), vo.getGameLevel() + "",
               vo.getPeopleCount() + "",vo.getPopularity()+"" };// count�濡 �ְ� ...
         count++;
      }

      DefaultTableModel dm = new DefaultTableModel(datas, columns);
      JTable table = new JTable(dm);
      table.addMouseListener(new MouseAdapter() {// ���콺 Ŭ�� �̺�Ʈ
         @Override
         public void mouseClicked(MouseEvent e) {
            String num = datas[table.getSelectedRow()][0];
            new GameUpdateDeletePage(num);
            dispose();
//            new GameUpdatePage();

         }
      });

      JScrollPane scrollPane = new JScrollPane(table);
      getContentPane().add(scrollPane, BorderLayout.CENTER);

      setVisible(true);
      setBounds(new Rectangle(500, 0, 400, 300));
      setTitle("GameSelectAllPage");
   }

   


   public GameSelectAllPage(RoomVO rvo) { // ����ڿ� ������
      String[] columns = new String[] { "���ӹ�ȣ", "�����̸�", "���̵�", "���Ӱ����ο���" };

      GameDirDAO dao = new GameDirDAOimpl();
      List<GameVO> vos = dao.selectAll();

      String[][] datas = new String[vos.size()][columns.length];
      int count = 0;
      for (GameVO vo : vos) {
         datas[count] = new String[] { vo.getNum() + "", vo.getName(), vo.getGameLevel() + "",
               vo.getPeopleCount() + "" };
         count++;
      }

      DefaultTableModel dm = new DefaultTableModel(datas, columns);
      JTable table = new JTable(dm);
      table.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            String num = datas[table.getSelectedRow()][0];
            
            
            RoomDirDAO rDao = new RoomDirDAOimpl();
            RoomVO vo_saveGame= rDao.selectOne(rvo); // ������ ������ ������ Room��ü ����
            
            vo_saveGame.setRoomGame(vos.get(table.getSelectedRow()).getName());
            
            RoomUserDAO rDao2 = new RoomUserDAOimpl();
            rDao2.update(vo_saveGame);
            
            GameVO gvo = new GameVO();
            gvo.setNum(vos.get(table.getSelectedRow()).getNum());
            GameDirDAO gDao = new GameDirDAOimpl();
            GameVO vo_game = gDao.selectOne(gvo);
            gDao.updatePopularity(vo_game);
            
            
            new ResultPage(vo_saveGame);
            dispose();

         }
      });
      getContentPane().setLayout(new GridLayout(2, 1, 0, 0));

      JScrollPane scrollPane = new JScrollPane(table);
      getContentPane().add(scrollPane);

      GameVO vo = new GameVO();

      Random r = new Random();
      int su = r.nextInt(vos.size()) + 1;
      vo.setNum(su);
      
      int vo2 = dao.showPopularity(vo);
      
      JLabel lrandom = new JLabel("������ �α� ������ " + vo.getName() + "�Դϴ�.");
      getContentPane().add(lrandom);

      setVisible(true);
      setTitle("GameSelectAllPage");
      setBounds(new Rectangle(500, 0, 400, 300));
   }

}