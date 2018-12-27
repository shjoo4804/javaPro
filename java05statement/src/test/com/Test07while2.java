package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test07while2 {

	public static void main(String[] args) throws IOException {

		System.out.println("while");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x = "";
		while (!x.equals("x")) { // 변수x의 값이 "x"가 아니면 계속 실행함
			// 조건이 true이면 무한히 반복
			System.out.println("while...");
			System.out.println("그만? input x...");
			x = br.readLine(); // x에 "x"를 입력하게 되면  종료됨
		}
		System.out.println("end while");
		

	} // end main()

} // end class