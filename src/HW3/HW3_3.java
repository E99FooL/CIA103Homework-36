package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> availableNumbers = new ArrayList<>();
        
        // 添加 1 到 49 的數字到列表中
        for (int i = 1; i <= 49; i++) {
            availableNumbers.add(i);
        }

        System.out.print("阿文...請輸入你討厭哪個數字(1~9)？ ");
        int dislikeNumber = scanner.nextInt();

        // 移除包含討厭數字的號碼
        availableNumbers.removeIf(number -> String.valueOf(number).contains(String.valueOf(dislikeNumber)));

        // 顯示剩下的號碼
        System.out.println("你可以選擇的號碼有：");
        for (int number : availableNumbers) {
            System.out.print(number + " ");
        }

        // 顯示剩餘號碼的總數
        System.out.println("\n總共有 " + availableNumbers.size() + " 個數字可以選擇");
        
        scanner.close();
    }
}
