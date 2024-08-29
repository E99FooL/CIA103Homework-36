package HW2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
public class HW2_3 {
	public static void main(String[] args) {
		int product = 1; // 用來儲存連乘積，初始化為 1
		int i = 1; // 初始化計數變數為 1
// 使用 while 迴圈計算連乘積
		while (i <= 10) {
			product *= i; // 將 product 乘上當前的 i
			i++; // 計數變數加 1
		}

		// 印出結果
		System.out.println("1 ~ 10 的 連 乘 積 為 : " + product);
	}
}
