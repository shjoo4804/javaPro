package test.com;

public class Test02arrayarray {

	public static void main(String[] args) {

		System.out.println("array array... 2차원,3차원 배열");

		// int [][]
		// int a0, a1, a2... >>편리하게 쓰기위해>> int[] sus sus[i]
		// int[] sus0, sus1; // 하나의 변수에 여러 개의 데이터를 넣고 싶을 때
		// int[][] suss suss[x][i]

		int[][] suss = new int[2][3];
		// {{0,0,0},
		//  {0,0,0}}
//		suss[0] = new int[] {1,2,3};
//		suss[1] = new int[] {4,5,6};
		
		for (int x = 0; x < suss.length; x++) {
//			suss[x] = new int[] {1,2,3};
			for (int i = 0; i < suss[x].length; i++) {
//				if(x==0) {
//					suss[x][i] = i+1;
//				} else {
//					suss[x][i] = i+4;
//				}
				suss[x][i] = i+1+x*suss[x].length;
			}
		}
		
		System.out.println();
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		

		// String[][]
		// String s0, s1, s2... >>편리하게 쓰기위해>> String[] strs strs[i]
		// String[] strs0, strs1;
		// String[][] strss strss[x][i]
		
		String[][] strss = new String[2][3];
		// { {null, null, null}, {null, null, null} }
		// kim, lee, han
		// kim2, lee2, han2
/*		
		strss[0] = new String[]{"kim", "lee", "han"};
		strss[1] = new String[]{"kim2", "lee2", "han2"};
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i]+" ");
			}
			System.out.println();
		}
		System.out.println();
*/
		String[] strs0 = new String[3];
		strs0[0] = "kim";
		strs0[1] = "lee";
		strs0[2] = "han";
		for (int i = 0; i < strs0.length; i++) {
			System.out.print(strs0[i]+" ");
		}
		System.out.println();
		
		String[] strs1 = new String[3];
		strs1[0] = "kim2";
		strs1[1] = "lee2";
		strs1[2] = "han2";
		for (int i = 0; i < strs1.length; i++) {
			System.out.print(strs1[i]+" ");
		}
		System.out.println();
		
		strss[0] = strs0;
		strss[1] = strs1;
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		

		// boolean[][]
/*		boolean[][] bss = new boolean[2][3];
		bss[0] = new boolean[] {true, false, true};
		bss[1] = new boolean[] {false, true, true};
		
		for (int x = 0; x < bss.length; x++) {
			for (int i = 0; i < bss[x].length; i++) {
				System.out.print(bss[x][i] + " ");
			}
			System.out.println();
		}
*/		
		boolean[] bs1 = new boolean[3];
		boolean[] bs2 = new boolean[3];
		boolean[][] bss = new boolean[][] {bs1,bs2}; // 배열동적할당
		for (int x = 0; x < bss.length; x++) {
			for (int i = 0; i < bss[x].length; i++) {
				System.out.print(bss[x][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// double[][]
/*		double[][] dss = new double[3][2];
		for (int x = 0; x < dss.length; x++) {
			for (int i = 0; i < dss[x].length; i++) {
				dss[x][i] = i+1+x*dss[x].length;
				System.out.print(dss[x][i] + " ");
			}
			System.out.println();
		}
*/
		double[][] dss = new double[2][3];
//		for (int x = 0; x < dss.length; x++) {
//			dss[x] = new double[] {3.14, 3.14, 3.14};
//		}
		for (int x = 0; x < dss.length; x++) {
			for (int i = 0; i < dss[x].length; i++) {
				dss[x][i] = 1.2;
			}
		}
		
		for (int x = 0; x < dss.length; x++) {
			for (int i = 0; i < dss[x].length; i++) {
				System.out.print(dss[x][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		// char[][]
		char[][] css = new char[2][4];
		css[0] = new char[] {'a','b','c','d'};
		css[1] = new char[] {'e','f','g','h'};
		for (int x = 0; x < css.length; x++) {
			for (int i = 0; i < css[x].length; i++) {
				System.out.print(css[x][i] + " ");
			}
			System.out.println();
		}
			

	} // end main()

} // end class
