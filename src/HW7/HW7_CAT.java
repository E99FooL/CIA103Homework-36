package HW7;

import java.io.Serializable;

public class HW7_CAT extends HW7_Pet implements Serializable {
	private String name;

	public HW7_CAT(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}