package test.com;

import java.util.StringTokenizer;

public class Test01String {

	public static void main(String[] args) {
		System.out.println("String Object");
		
		String str = "����ȭ ���� �Ǿ����ϴ�.";
		
		// .length() : ���ڿ��� ����
		System.out.println("str.length() : "+str.length()); 
		
		
		// .charAt() : ���ڿ����� �� ���� : �ѱ���(char)
		// ���ϴ� ��ġ(�ε���)�� ���� �ϳ� ���� (0���� ����)
		System.out.println("str.charAt(2) : "+str.charAt(2)); 
		
		char c = str.charAt(1);
		System.out.println(c);
		System.out.println((int)c); // ������������ ���� ĳ����(����ȯ)
		
		
		// .equals(), .compareTo(), .equalsIgnoreCase() : ���ڿ� ��
		System.out.println(str.equals("abc")); 
		
		str="abc";
		System.out.println(str.compareTo("abc")==0); // ������ 0(true)
		
		System.out.println(str.equalsIgnoreCase("Abc")); // ��ҹ��� ����
		
		
		// .substring() : ���ڿ����� �� ���� : ��������(String)
		str="abcdefghijk";
		System.out.println(str.substring(1)); // ���� �ε������� ������ ����
		
		int beginIndex = 5;
		int endIndex = beginIndex+3; // beginIndex���� 3����
		System.out.println(str.substring(beginIndex, endIndex)); 
		// ���� �ε������� ���ε��� ������ �̱�(�ε��� 1,2,3,4�� ����)
		
		
		// .indexOf() : ���ϴ� ���ڰ� ���� ó�� ������ �� 
		str = "asdasfdsbfnlkdsfl;k";
		int bIndex = str.indexOf("f");
		int eIndex = str.indexOf(";");
		System.out.println(bIndex);
		System.out.println(str.substring(bIndex, eIndex));
		
		// .lastIndexOf() : �������� ������ ������ ��ġ�� (�ڿ������� ��ġ)
		System.out.println(str.lastIndexOf("f"));
		
		
		// .replace() : ���ڸ� �ٸ� ���ڷ� �����ϱ�
		str = "aabbccdd";
		System.out.println(str.replace('a', 't')); // ���� str�� �ٲ����� ����
		System.out.println(str.replace("bb", "mm")); 
		str = str.replace('a', 't'); // ���� str�� �ٲٴ� ��� : str�� ���� �־��ֱ�
		System.out.println(str);
		
		
		// .concat() : ���ڿ� ��ġ��
		String a = "aaa";
		String b = "bbb";
		String sum = a+b;
		System.out.println(sum);
		String sum2 = a.concat(b);
		System.out.println(sum2);
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		String temp = " ";
//		for (int i = 0; i < 100000; i++) {
//			temp += i;
//		}
//		for (int i = 0; i < 100000; i++) {
//			temp = temp.concat(String.valueOf(i)); // ����� ���� ó���Ҷ� ����ð��� �پ��
//			//String.valueOf() : ���ڿ��� ����ȯ
//		}
		System.out.println(System.currentTimeMillis()-startTime); // ���� �ɸ��ð� üũ����

		
		
		// ���ڿ� ����
		// .split() : �����ڷ� ���е� ���ڿ��� ������ String�迭�� �־���
		String temp2 = "aaa:a777:a333:axxxxxx"; // ������ // *���� : |�� �����ڷ� ������ ����(�����ڴ� �����ڷ� ����)
//		temp2.split(regex); // regex ����(����ǥ����)
		String[] datas = temp2.split(":a");
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		
		//StringTokenizer
		temp2 = "aaa|777|333|xxxxxx";
		StringTokenizer st = new StringTokenizer(temp2, "|"); // |��밡��
		while (st.hasMoreElements()) {
			String x = (String) st.nextElement();
			System.out.println(x);
		}
		
	} // end main()

} // end class
