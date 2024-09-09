
//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
package HW4;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入年、月和日
        System.out.print("請輸入西元年 (yyyy): ");
        int year = scanner.nextInt();
        System.out.print("請輸入月份 (mm): ");
        int month = scanner.nextInt();
        System.out.print("請輸入日期 (dd): ");
        int day = scanner.nextInt();

        // 驗證日期是否合法
        if (!isValidDate(year, month, day)) {
            System.out.println("輸入的日期無效，請檢查您的輸入。");
        } else {
            // 計算該日期是該年的第幾天
            int dayOfYear = calculateDayOfYear(year, month, day);
            System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
        }

        scanner.close();
    }

    // 驗證日期是否有效
    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;
        
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        return day > 0 && day <= daysInMonth[month - 1];
    }

    // 判斷是否為閏年
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 計算該日期是該年的第幾天
    public static int calculateDayOfYear(int year, int month, int day) {
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = day;

        // 累加前幾個月的天數
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }
}

