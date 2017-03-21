/**
 * Created by pavankatepalli on 3/15/17.
 */

class Vehicle {}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am Pavan");
        System.out.print(5+7);
        System.out.print(" ");
        System.out.print(5.5+7.5);

        //The Java language supports three kinds of comments:
            /*1. text */
                //The compiler ignores everything from /* to */.

            /**2. documentation */
                //This indicates a documentation comment (doc comment, for short).
                //The compiler ignores this kind of comment, just like it ignores                                       comments that use /* and */
                // The JDK javadoc tool uses doc comments when preparing automatically                                  generated documentation.

            //3. text
                //The compiler ignores everything from // to the end of the line.

        /*
         creating variables in JAVA:
         */

            float myFloat = 124.124f;
            double myDouble = 124.214545544;
            char myChar = 'C';
            boolean condition = true;
            System.out.println("");
            System.out.println("myFloat: " + myFloat + " myDouble: " + myDouble + " myChar: " + myChar + " condition: " + condition);

        //creating constants in JAVA:
            final double PI = 3.145;
            System.out.println("");
            System.out.println("PI: " + PI);

        //to update a variable:
            System.out.println("");
            float myFloatt = 124.124f;
            System.out.println("float myFloatt = 124.124f;     myFloatt: " + myFloatt);
            myFloatt = 123.223F; //you don't put the type if you're updating a variable
            System.out.println("myFloatt = 123.223F;     myFloatt: " + myFloatt); //also JAVA is much less forgiving than JavaScript. If you don't include a ; at the end of a line then you will run into errors

        //reusing variables examples:
            int age = 26;
            int yourAge = age + 3;
            System.out.println("");
            System.out.println("int age = 26;   age: " + age);
            System.out.println("int yourAge = age + 3;      yourAge: " + yourAge);

        //reusing variables
            long agee = 2600000000000000000L;
            long yourAgee = agee;
            System.out.println("");
            System.out.println("long agee = 2600000000000000000000L;     agee: " + agee);
            System.out.println("long yourAgee = agee;    yourAgee: " + yourAgee);

            float numberr = 3.1415F;
            double pii = numberr;
            System.out.println("");
            System.out.println("float numberr = 3.1415F;     numberr: " + numberr);
            System.out.println("double pii = numberr;    pii: " + pii);

            //this won't work:
                /*
                    float numb = 3.1415F;
                    int piii = numb;

                    it'll give you this:

                    HelloWorld.java:67: error: incompatible types: possible lossy conversion from float to int
                    int piii = numb;
                */

            //this will work but if number becomes too big then some digits will cut off in value:
                long num = 1234567890;
                int value = (int)num;
                System.out.println("");
                System.out.println("long num = 1234567890;    num:" + num);
                System.out.println("int value = (int)num;    value:" + value);

                long nu = 1234567890123L;
                int valuee = (int)nu;
                System.out.println("");
                System.out.println("long nu = 1234567890123L;    nu:" + nu);
                System.out.println("int valuee = (int)nu;    valuee:" + valuee);

        //cool example of type conversion:
            int letter = 65;
            char alphabet = (char)letter;
            System.out.println("");
            System.out.println("int letter = 65;    letter:" + letter);
            System.out.println("char alphabet = (char)letter;   alphabet:" + alphabet);

        //if type
            String nameJ = "James";

            // following will return true since name is type of String
            boolean result = nameJ instanceof String;
            System.out.println( result );
    }
}

