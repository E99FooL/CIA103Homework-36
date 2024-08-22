package hw1;
//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
public class HW1_5 {
    public static void main(String[] args) {
        double principal = 1500000; // 初始本金
        double rate = 0.02;         // 年利率
        int years = 10;             // 年數

        // 使用複利公式計算
        double amount = principal * Math.pow(1 + rate, years);

        // 輸出結果
        System.out.printf("10年後的本金加利息共有: %.2f 元", amount);
    }
}
