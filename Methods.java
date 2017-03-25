public class Methods {
	public static void main(String[] args) {
		//using minFunction method written below
			int a = 11;
			int b = 6;
			int c = minFunction(a, b);
			System.out.println("Minimum Value = " + c); //Minimum Value = 6

		//using methodRankPoints method written below
			methodRankPoints(255.7); //Rank:A1

		//using a swapFunction method written below
			System.out.println("");
			int d = 30;
			int e = 45;
			System.out.println("Before swapping, d = " + d + " and e = " + e);

			// Invoke the swap method
			swapFunction(d, e);
			System.out.println("\n**Now, Before and After swapping values will be same here**:");
			System.out.println("After swapping, d = " + d + " and e is " + e); //After swapping, d = 30 and e is 45
			System.out.println("");

		//using method over loading 
			int result1 = minFunction(1, 2);

			// same function name with different parameters
			double result2 = minFunction(1.8, 2.9);

			//same result but different NUMBER of parameters
			int result3 = minFunction(99);

			System.out.println("Minimum Value = " + result1);  //Minimum Value = 1
			System.out.println("Minimum Value = " + result2);  //Minimum Value = 1.8
			System.out.println("Minimum Value = " + result3);  //Minimum Value = 99

	}

	public static void methodRankPoints(double points) {
		//points only lives inside this method
	   if (points >= 202.5) {
	      System.out.println("Rank:A1");
	   }else if (points >= 122.4) {
	      System.out.println("Rank:A2");
	   }else {
	      System.out.println("Rank:A3");
	   }
	}

	public static void swapFunction(int d, int e) {
	   System.out.println("Before swapping(Inside), d = " + d + " e = " + e);
	   
	   // Swap n1 with n2
	   int f = d;
	   d = e;
	   e = f;
	   System.out.println("After swapping(Inside), d = " + d + " e = " + e);
	}

	//method OverLoading
		//When a class has two or more methods by the same name but different parameters,
				// for integer

				public static int minFunction(int n1) {
				   return n1;
				}

				public static int minFunction(int n1, int n2) {
				   int min;
				   if (n1 > n2)
				      min = n2;
				   else
				      min = n1;

				   return min; 
				}
				
				// for double
				public static double minFunction(double n1, double n2) {
				  double min;
				   if (n1 > n2)
				      min = n2;
				   else
				      min = n1;

				   return min; 
				}


}