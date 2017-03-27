public class OverloadingExamplePartOne {

   public static void main(String args[]) {
      Rectangle r = new Rectangle();
      System.out.println(r.length); //0.0
      System.out.println(r.width); //0.0
      System.out.println(r.test); //null
      System.out.println(r.bool); //false
   }
}

class Rectangle {
	double length;
	double width;
	String test;
	boolean bool;
	public double getArea() {
		return length * width;
	}
}