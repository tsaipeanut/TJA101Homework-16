package home1;
	//計算200顆雞蛋共是幾打幾顆(一打12顆)

public class MyHomework2 {

	public static void main(String [] args) {
		int egg = 200;
		int d = egg / 12;
		int i = egg % 12;
		
		System.out.println("200顆雞蛋共是" + d + "打" + i + "顆");
	}
}
