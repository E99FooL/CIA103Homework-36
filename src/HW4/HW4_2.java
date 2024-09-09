package HW4;

import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {

        // 修正：二維陣列正確表達員工編號與現金金額
        int[][] employees = {
            {12, 500},   // 員工 12 的現金 500
            {25, 1500},  // 員工 25 的現金 1500
            {19, 700},   // 員工 19 的現金 700
            {27, 2000},  // 員工 27 的現金 2000
            {30, 1200}   // 員工 30 的現金 1200
        };

        // 使用 Scanner 讀取用戶輸入的欲借金額
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入欲借的金額: ");
        int borrowAmount = scanner.nextInt();

        // 變數初始化
        int count = 0;

        // 檢查每個員工的現金是否足夠
        System.out.print("有錢可借的員工編號: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i][1] >= borrowAmount) {  // 檢查第 2 個元素 (現金)
                System.out.print(employees[i][0] + " ");  // 顯示第 1 個元素 (員工編號)
                count++;
            }
        }

        // 顯示統計結果
        System.out.println("共 " + count + " 人!");

        scanner.close();
    }
}
