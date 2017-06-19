import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {
	//assumes b is greater than a
	public static ArrayList printEvenBetween(int a, int b) {
		ArrayList<Integer> list = new ArrayList<>();
		Integer start;
		Integer end;

		if (a < b){
			start = a;
			end = b;
		}else {
			start = b;
			end = a;
		}

		for (int i = start+1; i < end; i++) {
			if (i % 2 == 0){
				list.add(i);
			}
		}

		return list;
	}

	public static int addNumbers(ArrayList<Integer> array){
		int result = 0;
		int sizeArray = array.size(); //array.length is equivalent in js
		for (int i = 0; i < sizeArray; i++) {
			result += array.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		//System.out.println(printEvenBetween(3, 9));
		//ArrayList<Integer> list = Arrays.asList(1, 10, 12);
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5,5,5,7));
		// in js: var list = [5,5,5,7];

		System.out.println(addNumbers(list));
	}
}








