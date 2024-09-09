
//	班上有8位同學,他們進行了6次考試結果如下:
//
//		請算出每位同學考最高分的次數
package HW4;

public class HW4_4 {
    public static void main(String[] args) {
        // 二維陣列存儲每位同學的考試成績，行代表次數，列代表學生
        int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},  // 第1次考試成績
            {37, 75, 77, 89, 64, 75, 70, 95},   // 第2次考試成績
            {100, 70, 79, 90, 75, 70, 79, 90},  // 第3次考試成績
            {77, 95, 70, 89, 60, 75, 85, 89},   // 第4次考試成績
            {98, 70, 89, 90, 90, 75, 90, 89},   // 第5次考試成績
            {90, 80, 100, 75, 50, 20, 99, 75}   // 第6次考試成績
        };

        // 陣列用於儲存每位同學考得最高分的次數
        int[] highestScoreCounts = new int[scores[0].length];

        // 遍歷每次考試
        for (int i = 0; i < scores.length; i++) {
            int maxScore = Integer.MIN_VALUE;  // 初始化當前考試的最高分數

            // 找出每次考試中的最高分
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                }
            }

            // 計算該次考試中有多少位同學獲得了最高分
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == maxScore) {
                    highestScoreCounts[j]++;
                }
            }
        }

        // 輸出每位同學考得最高分的次數
        for (int i = 0; i < highestScoreCounts.length; i++) {
            System.out.println("學生 " + (i + 1) + " 考得最高分的次數: " + highestScoreCounts[i]);
        }
    }
}
