package home4;
//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)

public class Q1 {

	public static void main(String[] args) {
	int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}; //宣告新的一維陣列的同時，把值帶入
	int sum= 0; // 宣告一個變數=0，陣列總和指定給他
	
	for (int i = 0; i < a.length ; i++) {
		sum = sum + a[i];
		}//用迴圈來加總陣列每個元素
	
	int avg = sum / a.length; // 陣列總和的平均值
	
	System.out.println("陣列所有元素的平均值為"+ "" + avg);
	
	System.out.println("大於平均值的元素有：");
	for (int i = 0; i < a.length ; i++) {
		if (a[i] > avg) {
			System.out.print(a[i]+" ");
			}
		}
	}
}
