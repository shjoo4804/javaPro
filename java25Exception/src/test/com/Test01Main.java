package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {

	public static void main(String[] args){
		System.out.println("Exception");

		//Exception : 프로그램 컴파일 또는 실행 시 
		// 발생될 수 있는 오류를 미연에 처리 또는 전가시키는 것
		/*
		 try {
			// 문제가 발생할 상황
		} catch (Exception e) {
			// TODO: handle exception
			// 문제 발생 시 실행(오류에 대한 것을 보여주기)
			// 문제가 발생해도 정상작동 하도록 도와줌
			 
		} finally {
			//오류 여부에 상관없이 반드시 수행해야될 로직
		}
		
		*/
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String name = null;
		// 오류가 날 코딩은 처음에 null 값으로 초기화하고 try catch문에서 동작..
		
		try {
			is = System.in; // a
			isr = new InputStreamReader(is); // b
			// a에서 오류 발생하면 아래 코딩은 동작안함
			br = new BufferedReader(isr); // c
			
			name = br.readLine(); // 1
			System.out.println(name); // 정상적으로 끝나면  catch문이 나오지 않음 // 2
		} catch (IOException e1) {
			e1.printStackTrace(); // 오류 출력
//			System.out.println(e1);
			name = "오류";
			System.out.println(name); //null로 나옴
		} finally {
			System.out.println("finally");
			
			if(br!=null) { // br이 null이 아닐 때 닫도록 하기
				try {
					br.close(); // 마지막에 쓴 것부터 닫기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 

		} // end finally
		
		
		
		System.out.println("end main  " +name);

	} // end main()

}
