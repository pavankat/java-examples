import java.util.Arrays; //need this to use Arrays.toString...

public class TestArray {

   //how to write functions in JAVA
      //this one prints everything onto one line
      public static void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
         }
      }

      //this one returns a result
      public static int[] reverse(int[] list) {
         int[] result = new int[list.length];

         for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
         }
         return result;
      }

   public static void main(String[] args) {
      //declaring arrays
         
         double[] myListt;   // preferred way.
         
         //or
         
         double myListDifferent[];   // works but not preferred way.

      //Following statement declares an array variable, ml, creates an array of 10 elements of double type and assigns its reference to myList −

         double[] ml = new double[10];
         System.out.println(ml); //[D@7852e922
         System.out.println( Arrays.toString(ml)); //[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

      //foreach
         double[] mll = {1.9, 2.9, 3.4, 3.5};

         // Print all the array elements
         for (double ele: mll) {
            System.out.println(ele);
         }

      //things you can do to an array in JAVA
         double[] myList = {1.9, 2.9, 3.4, 3.5};

         // Print all the array elements
            for (int i = 0; i < myList.length; i++) {
               System.out.println(myList[i] + " "); //1.9 -> new line -> 2.9 -> 3.4 -> 3.5 -> 1.9 -> 2.9 -> 3.4 -> 3.5
            }
        
         // Summing all elements
            double total = 0;
            for (int i = 0; i < myList.length; i++) {
               total += myList[i];
            }
            System.out.println("Total is " + total); //Total is 11.7
            
         // Finding the largest element
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
               if (myList[i] > max) max = myList[i];
            }
            System.out.println("Max is " + max); //Max is 3.5

      //use the printArray method from above
         printArray(new int[]{1, 8, 2, 3, 1, 1}); //1 8 2 3 1 1
         System.out.println("");
         System.out.println(Arrays.toString(reverse(new int[]{3, 1, 2, 6, 4, 2}))); //[2, 4, 6, 2, 1, 3]


   }
}