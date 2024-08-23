
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:

//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)
package HW3;

import java.util.Scanner;
import java.util.Arrays;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入三個整數
        System.out.println("請輸入三個整數數字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 將邊長存入陣列並進行排序
        int[] sides = {a, b, c};
        Arrays.sort(sides);

        // 排序後，sides[2] 是最長邊，sides[0] 和 sides[1] 是其餘兩條邊
        if (isValidTriangle(sides)) {
            if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("正三角形");
            } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
                System.out.println("等腰三角形");
            } else if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                System.out.println("直角三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scanner.close();
    }

    // 輔助方法：判斷是否為有效的三角形
    private static boolean isValidTriangle(int[] sides) {
        return (sides[0] > 0 && sides[1] > 0 && sides[2] > 0) && (sides[0] + sides[1] > sides[2]);
    }
}
