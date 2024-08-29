package HW1;

//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class HW1_2 {
	public static void main(String[] args) {
		int totalEggs = 200;
		int dozen = totalEggs / 12;
		int remainingEggs = totalEggs % 12;
		System.out.println(" 兩百顆蛋共是 " + dozen + " 打 " + remainingEggs + " 顆 ");
	}
}