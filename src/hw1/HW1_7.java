package hw1;
/*請建立一個TestNineNine.java程式，可輸出九九乘法表
• 一：使用for迴圈 + while迴圈
• 二：使用for迴圈 + do while迴圈
• 三：使用while迴圈 + do while迴圈*/
public class HW1_7 {
	 public static void doubleForLoop() {
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
	            }
	            System.out.println();
	        }
	    }
	}
