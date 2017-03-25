import java.util.Arrays; //need this to use Arrays.toString...

public class MoreArray {

	//how to write functions in JAVA
	//this one prints everything onto one line
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}

		return min;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		//loop over array and print out results
			int[] numbers = {12, 3, 5};
			
			for (int number : numbers) {
				System.out.print(number + " ");
			}

					

		//another way with a method
			System.out.println("");
			printArray(numbers);
		
		//duplicating an array
			System.out.println("");
			System.out.println(" -- ");
			int[] series = new int[numbers.length]; //makes an array with 3 zeroes in it

			//copying numbers to series
			System.arraycopy(numbers, 0, series, 0, numbers.length);

			System.out.println( Arrays.toString(numbers));
			System.out.println( Arrays.toString(series));

		//duplicating an array in another way
			System.out.println(" --- ");
			int[] seriesAnother = Arrays.copyOf(numbers, numbers.length);
			System.out.println( Arrays.toString(seriesAnother));

		//find the min in the array
			int min = numbers[0];
			for (int i = 1; i < numbers.length; i++){
				if(numbers[i] < min){
					min = numbers[i];
				}
			}
			System.out.println("");
			System.out.println(min);

		//find the min in the array with a function
			System.out.println("");
			System.out.println(" ---- ");
			System.out.println(min(numbers));

		//find the max in the array with a function
			System.out.println("");
			System.out.println(" ----- ");
			System.out.println(max(numbers));

	}
}