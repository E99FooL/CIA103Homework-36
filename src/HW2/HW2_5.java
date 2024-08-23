
//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
// 請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
package HW2;

public class HW2_5 {
    public static void main(String[] args) {
        // 計數合法數字的數量
        int count = 0;

        // 遍歷從 1 到 49 的所有數字
        for (int i = 1; i <= 49; i++) {
            // 檢查數字是否不包含 4
            if (!containsDigitFour(i)) {
                count++; // 合法數字數量增加
            }
        }

        // 初始化合法數字的陣列
        int[] validNumbers = new int[count];
        int index = 0;

        // 再次遍歷從 1 到 49 的所有數字，填充合法數字陣列
        for (int i = 1; i <= 49; i++) {
            if (!containsDigitFour(i)) {
                validNumbers[index++] = i; // 添加合法數字到陣列
            }
        }

        // 按照指定格式輸出數字
        for (int i = validNumbers.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(validNumbers[j] + " ");
            }
            System.out.println(); // 換行
        }

        // 輸出合法數字的總數量
        System.out.println("總共有 " + validNumbers.length + " 個合法的數字。");
    }

    // 檢查數字中是否包含數字 4 的輔助方法
    private static boolean containsDigitFour(int number) {
        while (number > 0) {
            if (number % 10 == 4) { // 檢查個位數是否為 4
                return true;
            }
            number /= 10; // 去除個位數，檢查下一位
        }
        return false; // 沒有發現 4 則返回 false
    }
}


