package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {

	public static void main(String[] args){
		System.out.println("Exception");

		//Exception : ���α׷� ������ �Ǵ� ���� �� 
		// �߻��� �� �ִ� ������ �̿��� ó�� �Ǵ� ������Ű�� ��
		/*
		 try {
			// ������ �߻��� ��Ȳ
		} catch (Exception e) {
			// TODO: handle exception
			// ���� �߻� �� ����(������ ���� ���� �����ֱ�)
			// ������ �߻��ص� �����۵� �ϵ��� ������
			 
		} finally {
			//���� ���ο� ������� �ݵ�� �����ؾߵ� ����
		}
		
		*/
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String name = null;
		// ������ �� �ڵ��� ó���� null ������ �ʱ�ȭ�ϰ� try catch������ ����..
		
		try {
			is = System.in; // a
			isr = new InputStreamReader(is); // b
			// a���� ���� �߻��ϸ� �Ʒ� �ڵ��� ���۾���
			br = new BufferedReader(isr); // c
			
			name = br.readLine(); // 1
			System.out.println(name); // ���������� ������  catch���� ������ ���� // 2
		} catch (IOException e1) {
			e1.printStackTrace(); // ���� ���
//			System.out.println(e1);
			name = "����";
			System.out.println(name); //null�� ����
		} finally {
			System.out.println("finally");
			
			if(br!=null) { // br�� null�� �ƴ� �� �ݵ��� �ϱ�
				try {
					br.close(); // �������� �� �ͺ��� �ݱ�
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
