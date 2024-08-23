package HW2;
//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class HW2_6 {
    public static void main(String[] args) {
        // Loop through the characters from 'A' to 'F'
        for (char c = 'A'; c <= 'F'; c++) {
            // Print each character 'c' for (c - 'A' + 1) times
            for (int i = 0; i < (c - 'A' + 1); i++) {
                System.out.print(c);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
