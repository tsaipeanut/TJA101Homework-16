package home1;

//銀行存入150萬，銀行利率2%，每年利息繼續存入銀行，算出10年後本金加利息共有多少錢?
//複利公式：本利和=本金*(1+年利率)^期間
public class MyHomework5 {

	public static void main(String[] args) {
		int i = 1500000;
		double r = 1 + 0.02;

		for (int a = 1; a <= 10; a++) {
			i = (int) (i * r);
		}
		System.out.println(i);
	}
}