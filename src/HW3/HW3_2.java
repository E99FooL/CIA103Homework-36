package HW3;
import java.util.Random;
import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        // 建立 Scanner 物件來讀取使用者輸入
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 隨機生成 0 到 9 的數字
        int numberToGuess = random.nextInt(10);
        int userGuess = -1;

        System.out.println("開始猜數字吧！");

        // 使用無窮迴圈,讓使用者不斷猜數字，直到猜對為止
        while (userGuess != numberToGuess) {
            // 提示使用者輸入猜測數字
            System.out.print("請輸入你的猜測 (0-9): ");
            userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("答對了！答案就是" + numberToGuess);
            } else {
                System.out.println("猜錯囉");
            }
        }

        scanner.close(); // 關閉 
    }
}
