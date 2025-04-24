package home4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

public class Q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年/月/日");

		// 閏年
		int[][] leapyear = 
			{  
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } 
			};
			

		// 一般年
		int[][] normalyear = 
			{ 
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } 
			};

		// 宣告一個陣列，把輸入的三個數字放入陣列裡面

		int[] num = new int[3];

		for (int x = 0; x < 3; x++) 
			{
			if (sc.hasNext()) {
				num[x] = sc.nextInt();
				}
			}

		int year = num[0];
		int month = num[1];
		int day = num[2];
		int countday = 0;

		// 先判斷是閏年還是一般年，閏年為4的倍數
		if (year % 4 == 0 && year > 0) {
			// 排除錯誤的月份日期
			if (month > 0 && month < 13 && day > 0 && day <= leapyear[1][month - 1]) {
				// 用迴圈填入每月天數，當月的天數要另外加入
				for (int i = 0; i < month - 1; i++) {
					countday = countday + leapyear[1][i];
					}
				countday = countday + day;
				System.out.println("這天是該年的第" + countday + "天");

			} else {
				System.out.println("錯誤!!請輸入正確年月份");
				}

			// 一般年
		} else {
			// 排除錯誤的月份日期
			if (year > 0 && month > 0 && month < 13 && day > 0 && day <= normalyear[1][month - 1]) {
				// 用迴圈填入每月天數，當月的天數要另外加入
				for (int j = 0; j < month - 1; j++) {
					countday = countday + normalyear[1][j];
					}
				countday = countday + day;
				System.out.println("這天是該年的第" + countday + "天");

			} else {
				System.out.println("錯誤!!請輸入正確年月份");
				}
		}
	}

}