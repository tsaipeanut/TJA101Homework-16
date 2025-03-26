package home2;
//計算1~1000的偶數和(2+4+6+...+1000)

public class Q2 {

	public static void main(String[] args) {
		int sum = 0;

		 for (int i = 1; i <= 1000; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }
		System.out.println("1到1000的偶數和=" + sum);
	}
}

		
