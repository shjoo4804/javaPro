package test.com;

public class RandomMain {

	public static void main(String[] args) {
		System.out.println("Random");
		
		String[] names = new String[] {
				"��¹�","������","������","������",
				"���Ҷ�","��μ�","�ǿ���","������",
				"������","�輺��","�ڽ���","������",
				"������","Ȳ����","�ֱԹ�","������"
		};
		
		System.out.println("names.length:"+names.length);
		
		RandomVO rvo = new RandomVO();
		rvo.setNames(names);
		rvo.setCount(2);
		
		RandomDAO rdao = new RandomDAOimpl();

		String[] lucky = rdao.getRandom(rvo);
		System.out.println("=====^__^=====");
		for (int i = 0; i < lucky.length; i++) {
			System.out.println(lucky[i]);
		}

	}

}
