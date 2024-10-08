package HW4;
////• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class HW4_1_1 {
	public static void main(String[] args) {
        int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;

        System.out.println("平均值: " + average);
        System.out.print("大於平均值的元素: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }
}

