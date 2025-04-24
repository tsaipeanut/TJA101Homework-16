package home3;

import java.util.Scanner;

//用亂數產生0~9的數字，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
//scanner、亂數方法、無限迴圈

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請猜一個數字吧~~");
		int num = (int) (Math.random() * 10); // 產生1~9亂數
		int guess; // 把猜的數字指定給guess變數
		
		int i = 0;
		while (i < 1) {
			guess = sc.nextInt();
			if (guess == num) {
				System.out.println("你猜對囉！");
				i++;
			} else {
				System.out.println("猜錯了繼續猜");
				continue;
			}
		}
	}
}