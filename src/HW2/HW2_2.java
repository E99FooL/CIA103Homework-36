package HW2;
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

public class HW2_2 {
	public static void main(String[] args) {
		int product = 1; // 用來儲存連乘積，初始化為 1

		// 遍歷從 1 到 10 的所有數字
		for (int i = 1; i <= 10; i++) {
			product *= i; // 將 product 乘上當前的 i
		}

		// 印出結果
		System.out.println("1~10的連乘積為: " + product);
	}
}
