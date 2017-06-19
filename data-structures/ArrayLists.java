import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;


// The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed.

// Standard Java arrays are of a fixed length. After arrays are created, they cannot grow or shrink, which means that you must know in advance how many elements an array will hold.

// Array lists are created with an initial size. When this size is exceeded, the collection is automatically enlarged. When objects are removed, the array may be shrunk.

public class ArrayLists {
	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("Enter a bunch of numbers separated by spaces");
		System.out.println(input);
		String[] inputs = input.split(" ");

		ArrayList<Integer> list = new ArrayList<>();
		for (String item : inputs){
			list.add(Integer.parseInt(item));
		}
		
		System.out.println("");

		int sum = 0;
		for (Integer num : list){
			sum += num;
		}

		int min = minimum(list);
		System.out.println(min);

		JOptionPane.showMessageDialog(null, "Minimum = " + min + " Average = " +((double)sum/list.size()));
	}

	public static int minimum(ArrayList<Integer> list){
		int min = list.get(0);
		//for (Integer num : list){ //another way
		for (int i=0; i<list.size(); i++){
			if (list.get(i) < min){ //if (num < min){ //another way
				min = i; //min = num; //another way
			}
		}

		return min;
	}
}
