package home2;
//阿文很熱衷大樂透(1~49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class Q6 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {   //數1~39
			if (i % 10 != 4 || i / 10 != 4) { // 檢查數字是否包含 4
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println("");
		System.out.println("總共"+count+"個");
	}
}