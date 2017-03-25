/**
 * Created by pavankatepalli on 3/20/17.
 */
public class Arithmetic {
    public static void main(String[] args) {
        //this works but would give you the wrong answer if we're getting the average of 1 and 2
        int avg = (1 + 2 + 3 + 4 + 5)/5;
        System.out.println("int avg = (1 + 2 + 3 + 4 + 5)/5;    avg: " + avg);

        int anotherAvg = (1 + 2)/2;
        System.out.println("int anotherAvg = (1 + 2)/2;    anotherAvg: " + anotherAvg);

        //instead you cast one of them to a double and store it into a variable that is a double and you're in the clear
        double rightAvg = ((double)1 + 2)/2;
        System.out.println("double rightAvg = (1 + 2)/2;    rightAvg: " + rightAvg);

        int mod = 25 % 5;
        System.out.println("int mod = 25 % 5;    mod: " + mod);

        int modAgain = 27 % 5;
        System.out.println("int modAgain = 27 % 5;    modAgain: " + modAgain);
    }
}