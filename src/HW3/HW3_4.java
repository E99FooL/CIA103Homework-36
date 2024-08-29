package HW3;

public class HW3_4 {
    public static void main(String[] args) {
        // 產生 1 到 10 之間的隨機數字
        int random1To10 = (int) (Math.random() * 10) + 1;
        System.out.println("1 到 10 之間的隨機數字: " + random1To10);

        // 產生 20 到 50 之間的隨機數字
        int random20To50 = (int) (Math.random() * 31) + 20;
        System.out.println("20 到 50 之間的隨機數字: " + random20To50);
    }
}
