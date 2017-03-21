/**
 * Created by pavankatepalli on 3/20/17.
 */
public class Relational {
    public static void main(String[] args) {
        //an array in java
        //the type of elements in the array is int
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
           System.out.print( x );
           System.out.print(",");
        }
        System.out.print("\n");

        //another array in java
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
           System.out.print( name );
           System.out.print(",");
        }
    }
}








