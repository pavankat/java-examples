public class OverloadingExamplePartTwo {

   public static void main(String args[]) {
      Rectangle r = new Rectangle(50, 40);
      Rectangle r2 = new Rectangle(20, 30);
      Rectangle r3 = new Rectangle();
      System.out.println(r.getArea()); //2000.0
      System.out.println(r2.getArea()); //600.0
      System.out.println(r3.getArea()); //6.0

   }
}

class Rectangle {
	double length;
	double width;
	String test;
	boolean bool;

	//constructor
	Rectangle( ){
		length = 3.0;
		width = 2.0;
	}

	//constructor
	Rectangle( double l, double b ){
		length = l;
		width = b;
	}

	public double getArea() {
		return length * width;
	}
}