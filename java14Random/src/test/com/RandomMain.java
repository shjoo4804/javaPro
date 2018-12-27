package test.com;

public class RandomMain {

	public static void main(String[] args) {
		System.out.println("Random");
		
		String[] names = new String[] {
				"항공권 관리", "영화관 관리",
				"의류쇼핑몰","장난감쇼핑몰",
				"재료선택가능한 빵집","PC방 관리프로그",
				"도서관/도서관리"
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
