package HW5;

public class  HW_5_MyRectangle {
	double width;
	double depth;

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	double getArea() {
		double result=width*depth;
		System.out.println(result);
		return result;
	}

	public HW_5_MyRectangle() {
	};

	public HW_5_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	};
}