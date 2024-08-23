package HW1;
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class HW1_3 {
public static void main(String[] args) {
	int totalSecond = 256559;
	int days = totalSecond/ 86400;
	int hours = (totalSecond % 86400) / 3600;
	int minutes = (totalSecond % 3600) /60;
	int seconds = totalSecond % 60;
	System.out.println(totalSecond + "秒數為 "+ days +" 天 "+ hours + " 小時 "+ minutes + " 分 "+ seconds +" 秒 ");
}
}
