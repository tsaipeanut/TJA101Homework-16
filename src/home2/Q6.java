package home2;
//阿文很熱衷大樂透(1~49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class Q6 {
	public static void main(String[] args) {
		int count = 0;
		int num = 1;
		while (num <= 49) {
			int temp = num;
			boolean Four = false;

			while (temp > 0) {
				if (temp % 10 == 4) {
					Four = true;
					break;
				}
				temp /= 10;
			}

			if (!Four) {
				System.out.println(num);
				count++;
			}

			num++;
		}

		System.out.println("可以選擇的數字總共有 " + count + " 個數字");
	}
}
