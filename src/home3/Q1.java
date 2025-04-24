package home3;

import java.util.Scanner;

//查詢三角形的定義、Scanner
public class Q1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入三個整數");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if ( a + b > c || a + c > b || b + c > a) {
		if(a==b && a==c) {
			System.out.println("這是正三角形");
		}else if ( a==b || a==c || b==c) {
			System.out.println("這是等腰三角形");
		}else if (a*a == b*b+c*c || b*b== b*b+a*a || c*c==a*a+b*b) {
			System.out.println("這是直角三角形");
		}else {		
			System.out.println("這是其他三角形");
		}
	}else {		
		System.out.println("這不是三角形");
		}

	}
}