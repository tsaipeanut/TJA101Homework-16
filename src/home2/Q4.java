package home2;
//請設計一隻Java程式,計算1~10的連乘積(1*2*3*..*10)(用while迴圈)
public class Q4 {

	public static void main(String[] args) {
        int count = 1;
        int i = 1;
        
        while (i <= 10) {
            count = count * i;
            i++;
        }
        
        System.out.println("1~10的連乘積=" + count);
    }
}
