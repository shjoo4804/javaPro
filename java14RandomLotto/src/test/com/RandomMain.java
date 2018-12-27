package test.com;

public class RandomMain {

	public static void main(String[] args) {
		System.out.println("Random");
		
		String[] names = new String[] {
				"±è½Â¹Î","½ÅÇü°ï","½ÅÇöÁÖ","Á¤¿¬ÁÖ",
				"°­¼Ò¶ó","±è¹Î¼ö","±Ç¿ÀÇõ","ÀÌÁ¤Çö",
				"ÀÌÀçÈÆ","±è¼º¿î","¹Ú½ÂÀ±","¹ÚÁ¤¿í",
				"ÇãÁøÈñ","È²¿¹Àº","ÃÖ±Ô¹ü","±èÁö¿ø"
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
