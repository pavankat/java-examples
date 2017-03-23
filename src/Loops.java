/**
 * Created by pavankatepalli on 3/20/17.
 */
public class Loops {
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

        //while loop
          System.out.println("");
          System.out.println("while loop:");

          int i = 0;
          while(i < 4){
            System.out.println(i);
            i++;
          }


        //do while loop
          int j = 0;
          do {
            System.out.println("j is: " + j);
            j++;
          } while (j < 5);

        //break example
        System.out.println("");
        for( String name : names ) {
          if (name == "James"){
            continue; //skips this iteration of loop if name is James
          }

          System.out.print( name );
          System.out.print(",");

          if (name == "Tom"){
            break; //exits out of the for loop if name is Tom
          }
        }
    }
}








