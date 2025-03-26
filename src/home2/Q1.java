package home2;
// 輸出99乘法表
public class Q1 {

	//使用for迴圈+while迴圈
	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
	}

}

	
	//使用for迴圈+ do while迴圈
//	public static void main(String[] args) {
//		int i = 1;
//
//		for (i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//
//			System.out.println();
//		}
//	}
//
//}
	
	//使用while迴圈+ do while迴圈
//	public static void main(String[] args) {
//		int i = 1;
//		
//		while (i <= 9) {
//			int j = 1;
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			} while (j <= 9);
//			i++;
//			System.out.println();
//		}
//
//	}
//
//}
	
	