/**
 * Created by pavankatepalli on 3/20/17.
 */
public class Relational {
    public static void main(String[] args) {
        //comparisons
            boolean a = 1 == 5;
            System.out.println(a); //false

            boolean b = 1 < 5;
            System.out.println(b); //true

            boolean c = 1 > 5;
            System.out.println(c); //false

            boolean d = 1 != 5;
            System.out.println(d); //true

        //you can't compare double variables with the == operator
            //samething goes for float
                double e = 0.7 + 0.1;
                double f = 0.9 - 0.1;
                System.out.println(e == f); //false
                System.out.println("e is " + e); //0.7999999999999999
                System.out.println("f is " + f); //0.8
                System.out.println(Double.compare(e,f)); //-1 meaning that f is bigger. If it was 0 then it would mean they're equal and if it's 1 it means the left most number is greater

                    //for floats it's Float.compare(numOneGoesHere, numTwoGoesHere)

        //assign two variables and type them at the sametime
            int g = 3, h = 4;
            System.out.println("g is " + g); //3
            System.out.println("h is " + h); //4

        //+= -= *= /= %= demonstration
            int num = 4;

            num += 5;
            System.out.println("num is " + num); //9


            num -= 3;
            System.out.println("num is " + num); //6

            num *= 2;
            System.out.println("num is " + num); //12

            num /= 2;
            System.out.println("num is " + num); //6

            num %= 2;
            System.out.println("num is " + num); //0

        //++ demonstration
            int i = 6;
            int j = i++;
            System.out.println("j is " + j); //6
            System.out.println("i is " + i); //7

            int k = 6;
            int l = ++k;
            System.out.println("k is " + k); //7
            System.out.println("l is " + l); //7

                //samething for --

        //boolean
            boolean m = true;
            boolean n = !m;
            System.out.println(m + " " + n); //true, false

        //conditionals  
            if (true && true){
                System.out.println("hit if"); //this one
            }else{
                System.out.println("hit else");
            }

            if (false && true){
                System.out.println("hit if");
            }else{
                System.out.println("hit else"); //this one
            }

            if (false && true){
                System.out.println("hit if");
            }else{
                System.out.println("hit else"); //this one
            }

            int o = 4;
            int p = 4;

            if (o > p){
                System.out.println("hit if");
            }else if (o == p){
                System.out.println("hit else if"); //this one
            }else{
                System.out.println("hit else");
            }

            String q = 4 > 2 ? "4 is greater than 2" : "4 is not greater than 2";
            System.out.println(q);

            String r = 1 > 2 ? "1 is greater than 2" : "1 is not greater than 2";
            System.out.println(r);

        //switch
            char grade = 'C';

            switch(grade) {
                case 'A' :
                    System.out.println("Excellent!"); 
                    break;
                case 'B' :
                    System.out.println("Great job!");
                    break;
                case 'C' :
                    System.out.println("Well done");
                    break;
                case 'D' :
                    System.out.println("You passed");
                case 'F' :
                    System.out.println("Better try again");
                    break;
                default :
                    System.out.println("Invalid grade");
            }

            System.out.println("Your grade is " + grade);
    }
}








