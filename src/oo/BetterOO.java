/*
	this is good OO design because the area is always right.
*/
public class BetterOO {
	public static void main(String[] args){
		//sq is a variable
		Square sq = new Square();
		sq.side = 3;
		double area = sq.calculateArea();

		Square sq2 = new Square();
		sq2.side = 9;
		System.out.println(sq2.calculateArea());
	}
}

class Square {
	double side;
	double calculateArea(){
		return side*side;
	}
}