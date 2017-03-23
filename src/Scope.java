/**
 * Created by pavankatepalli on 3/22/17.
 */

//in Java scope lives in the curly brackets
public class Scope {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
       System.out.println(i);

       for (int j = 10; j < 15; j++) {
          System.out.println(j);

          for (int k = 25; k < 30; k++) {
            System.out.println(i); //this will work, because i is enclosed in the curly brackets
            System.out.println(k);
          }
          
          /*
            Scope.java:24: error: cannot find symbol
                      System.out.println(k);
                                         ^
              symbol:   variable k
              location: class Scope
            1 error
          */
          //System.out.println(k); 
       }

    }
  }
}