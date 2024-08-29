package HW3;

import java.util.Scanner; // 匯入 Scanner 類別

public class HW3_5 {
    public static void main(String[] args) {
        // 宣告變數
        int i;           // 宣告一個 int 整數
        double d;        // 宣告一個 double 浮點數
        
        // 建立 Scanner 物件，從 System.in 讀取輸入
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字: ");

        // 檢查使用者輸入是否為整數
        if (sc.hasNextInt()) {
            i = sc.nextInt(); // 讀取整數輸入
            System.out.println("輸入的整數為: " + i);
        }

        // 檢查使用者輸入是否為浮點數
        if (sc.hasNextDouble()) {
            d = sc.nextDouble(); // 讀取浮點數輸入
            System.out.println("輸入的浮點數為: " + d);
        }

        // 關閉 Scanner 物件以釋放資源
        sc.close();
    }
    }
