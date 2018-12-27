package test.com;

import java.util.StringTokenizer;

public class Test01String {

	public static void main(String[] args) {
		System.out.println("String Object");
		
		String str = "무궁화 꽃이 피었습니다.";
		
		// .length() : 문자열의 길이
		System.out.println("str.length() : "+str.length()); 
		
		
		// .charAt() : 문자열에서 값 추출 : 한글자(char)
		// 원하는 위치(인덱스)의 문자 하나 뽑음 (0부터 시작)
		System.out.println("str.charAt(2) : "+str.charAt(2)); 
		
		char c = str.charAt(1);
		System.out.println(c);
		System.out.println((int)c); // 문자형에대한 정수 캐스팅(형변환)
		
		
		// .equals(), .compareTo(), .equalsIgnoreCase() : 문자열 비교
		System.out.println(str.equals("abc")); 
		
		str="abc";
		System.out.println(str.compareTo("abc")==0); // 같으면 0(true)
		
		System.out.println(str.equalsIgnoreCase("Abc")); // 대소문자 노상관
		
		
		// .substring() : 문자열에서 값 추출 : 여러글자(String)
		str="abcdefghijk";
		System.out.println(str.substring(1)); // 시작 인덱스부터 끝까지 추출
		
		int beginIndex = 5;
		int endIndex = beginIndex+3; // beginIndex부터 3글자
		System.out.println(str.substring(beginIndex, endIndex)); 
		// 시작 인덱스부터 끝인덱스 전까지 뽑기(인덱스 1,2,3,4만 뽑음)
		
		
		// .indexOf() : 원하는 글자가 언제 처음 나오는 지 
		str = "asdasfdsbfnlkdsfl;k";
		int bIndex = str.indexOf("f");
		int eIndex = str.indexOf(";");
		System.out.println(bIndex);
		System.out.println(str.substring(bIndex, eIndex));
		
		// .lastIndexOf() : 마지막에 나오는 글자의 위치값 (뒤에서부터 위치)
		System.out.println(str.lastIndexOf("f"));
		
		
		// .replace() : 문자를 다른 문자로 변경하기
		str = "aabbccdd";
		System.out.println(str.replace('a', 't')); // 실제 str이 바뀌지는 않음
		System.out.println(str.replace("bb", "mm")); 
		str = str.replace('a', 't'); // 실제 str을 바꾸는 방법 : str에 값을 넣어주기
		System.out.println(str);
		
		
		// .concat() : 문자열 합치기
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
//			temp = temp.concat(String.valueOf(i)); // 방대한 양을 처리할때 연산시간이 줄어듦
//			//String.valueOf() : 문자열로 형변환
//		}
		System.out.println(System.currentTimeMillis()-startTime); // 연산 걸린시간 체크가능

		
		
		// 문자열 구분
		// .split() : 구분자로 구분된 문자열을 각각의 String배열에 넣어줌
		String temp2 = "aaa:a777:a333:axxxxxx"; // 구분자 // *주의 : |을 구분자로 넣으면 ㄴㄴ(연산자는 구분자로 ㄴㄴ)
//		temp2.split(regex); // regex 패턴(정규표현식)
		String[] datas = temp2.split(":a");
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		
		//StringTokenizer
		temp2 = "aaa|777|333|xxxxxx";
		StringTokenizer st = new StringTokenizer(temp2, "|"); // |사용가능
		while (st.hasMoreElements()) {
			String x = (String) st.nextElement();
			System.out.println(x);
		}
		
	} // end main()

} // end class
