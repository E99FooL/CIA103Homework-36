
//1.請建立一個Test4Numbers.java，
	//可輸出0～100裡4的倍數
package HW1;
public class classtest1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		
//		System.out.print("\n");
		
//		System.out.println("\n");
		
		for (int i = 0; i <= 100; i += 4) {
			System.out.print(i + " ");
		}
		
		
		
		
	}
}