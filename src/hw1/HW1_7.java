
/*請建立一個TestNineNine.java程式，可輸出九九乘法表
• 一：使用for迴圈 + while迴圈
• 二：使用for迴圈 + do while迴圈
• 三：使用while迴圈 + do while迴圈*/
package HW1;

public class HW1_7 {
	public static void main(String[] args) {
		// for 迴圈 + do while 迴圈
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
}
