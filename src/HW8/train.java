package HW8;

import java.util.Objects;

public class train 
implements Comparable<train>{

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public train() {
	}

	public train(int number,String type ,String start, String dest, double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		train other = (train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(train o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.number, o.number)*-1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String(this.number+this.type+this.start+this.dest+this.price);
	}

}
