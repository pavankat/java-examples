import java.util.Arrays; //need this to use Arrays.toString...

public class MultiArray {

	public static int[][] giveItBack(int[][] arr) {
		return arr;
	}

	public static void main(String[] args) {
		//make multi dimensional array
			int[][] numbers = new int[3][3]; //specify rows and columns

			//or

			int[][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			}; //specify rows and columns

		//loop over a multi dimensional array and print results out
			for (int i=0; i < 3; i++) {
				for (int j=0; j < 3; j++) {
					System.out.println(nums[i][j]);
				}
				System.out.println("");
			}

		//call a method that uses a multi dimensional array and returns one
			int[][] numss = giveItBack(nums);

			System.out.println("");
			
			for (int i=0; i < 3; i++) {
				for (int j=0; j < 3; j++) {
					System.out.println(numss[i][j]);
				}
				System.out.println("");
			}

	}
}