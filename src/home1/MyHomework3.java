package home1;
//算出256559秒是多少天、多少小時、多少分、多少秒

public class MyHomework3 {

	public static void main(String[] args) {
		int question = 256559;
		int sec = 1, min = sec * 60, hour = min * 60, day = hour * 24;

		int a = question / day;
		int b = question % day / hour;
		int c = question % day % hour / min;
		int d = question % day % hour % min;

		String s1 = "256559秒是", s2 = "天", s3 = "小時", s4 = "分", s5 = "秒";
		
		System.out.println(s1 + a + s2 + b + s3 + c + s4 + d + s5);
	}
}

