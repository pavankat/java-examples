//call by value vs call by reference
/*
	Java does manipulate objects by reference, and all object variables are references. However, Java doesn't pass method arguments by reference; it passes them by value.
*/
public class CallingMethods {
	public static void main(String[] args){
		int original = 10;

		//sq is a variable
		Square sq = new Square();
		sq.side = 10;

		System.out.println("before modifying: original " + original);
		System.out.println("before modifying: sq.side " + sq.side);
		modify(original); //this won't modify the original
		modify(sq); //this will modify the original
		System.out.println("after modifying: original " + original);
		System.out.println("after modifying: sq.side " + sq.side);
	}

	public static void modify(int number){
		System.out.println("inside modify " + number);
		number = 1000;
		System.out.println("inside modify " + number);
	}

	public static void modify(Square object){
		System.out.println("inside modify BEFORE " + object.side);
		object.side = 500;
		System.out.println("inside modify AFTER " + object.side);
	}
}

class Square {
	double side;
	double calculateArea(){
		return side*side;
	}
}