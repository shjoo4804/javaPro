package test.com;

public class Test04NoteBookMain {
	public static void main(String[] args) {
		System.out.println("notebook...");

//		Test04NoteBookVO vo = new Test04NoteBookVO();
		Test04NoteBookVO vo = new Test04NoteBookVO("N001", "Notebook", "hp009", 1440000);
		System.out.println(vo);
		
		vo.setProductNO("N002"); // ������
		vo.setProductName("��Ʈ��");
		vo.setModelName("LG");
		vo.setPrice(998000);
		
		String productNO = vo.getProductNO(); // ��������
		System.out.println(productNO);
		System.out.println(vo.getProductName());
		System.out.println(vo.getModelName());
		System.out.println(vo.getPrice());
		
	} // end main()

} // end class
