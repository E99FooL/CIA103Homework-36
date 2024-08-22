package hw1;

public class Student {
int score = 90;
//每休息一個小時，score就會減1
public void play(int hours) {
score =- hours;}

//每讀書一個小時，score就會加1
public void study(int hours) 
System.out.println();	
score += hours; 


//創建兩個student物件，並藉由呼叫play()與study()模擬學生行為
//最後顯示兩位學生的分數觀察是否正確

public static void main(String[])
Student david = new Studnet();
Student james = new Studnet();

System.out.println(david.score);
System.out.println(james.score);

david.play(2);
david.study(6);

jame.play(5);
jame.study(2);
}
