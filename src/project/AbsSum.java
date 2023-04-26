package project;

abstract class calculation {
	abstract void sum();
}

class cal1 extends calculation {
	void sum() {
		int a = 20, b = 40, c;
		c = a + b;
		System.out.println("the sum of two integer is:" + c);
	}
}

class cal2 extends calculation {
	void sum() {
		float a = 25.6f, b = 40.8f, c;
		c = a + b;
		System.out.println("the sum of two floats is:" + c);
	}
}

public class AbsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal1 c1 = new cal1();
		cal2 c2 = new cal2();
		c1.sum();
		c2.sum();

	}

}
