package home3;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個你不喜歡的數字（1~9）！");
		
		int num = sc.nextInt();
		int count = 0;
		
		for (int j = 1; j < 50; j++) {
			if (j % 10 != num && j / 10 != num) { 
				System.out.print(j + " ");
				count += 1;
			}
		}
		System.out.println("");
		System.out.println("這次樂透你總共可以選"+count+"個數字");
	}
}

