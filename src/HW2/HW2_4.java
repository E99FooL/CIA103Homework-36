package HW2;
//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
public class HW2_4 {
public static void main(String[]args) {
	//使用for迴圈計算初一到十平方根
	for (int i = 1; i <= 10; i++) {
		int square = i * i;//計算出平方數
		System.out.print(square +" ");
	}
	System.out.println();//換行
	
}
}
