package HW2;
//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

public class HW2_1 {
	public static void main(String[] args) {
		int sum = 0; // 用來儲存偶數和

		// 遍歷從 1 到 1000 的所有數字
		for (int i = 2; i <= 1000; i += 2) {
			sum += i; // 將偶數加到 sum 上
		}

		// 印出結果
		System.out.println("1~1000的偶數為: " + sum);
	}
}
