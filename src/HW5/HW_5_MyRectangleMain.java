package HW5;

public class HW_5_MyRectangleMain {

	public static void main(String[] args) {
		HW_5_MyRectangle r1=new HW_5_MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		r1.getArea();
		HW_5_MyRectangle r2=new HW_5_MyRectangle(10,20);
		r2.getArea();
	}
}