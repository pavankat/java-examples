public class BadOO {
	public static void main(String[] args){
		//sq is a variable
		Square sq = new Square();
		sq.side = 3;
		sq.area = 4;
	}
}

class Square {
	double side;
	double area;
}