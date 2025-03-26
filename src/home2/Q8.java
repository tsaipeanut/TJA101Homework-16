package home2;
//請設計一隻Java程式，輸出結果為以下:
//A
//9
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Q8 {

	public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            char letter = (char) ('A' + i);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
