package test.com;

public class RandomMain {

	public static void main(String[] args) {
		System.out.println("Random");
		
		String[] names = new String[] {
				"�װ��� ����", "��ȭ�� ����",
				"�Ƿ����θ�","�峭�����θ�",
				"��ἱ�ð����� ����","PC�� �������α�",
				"������/��������"
		};
		
		System.out.println("names.length:"+names.length);
		
		RandomVO rvo = new RandomVO();
		rvo.setNames(names);
		rvo.setCount(1);
		
		RandomDAO rdao = new RandomDAO();
		String[] lucky = rdao.getRandom(rvo);
		System.out.println("=====^__^=====");
		for (int i = 0; i < lucky.length; i++) {
			System.out.println(lucky[i]);
		}

	}

}
