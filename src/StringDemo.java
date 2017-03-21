public class StringDemo {

   public static void main(String args[]) {
	char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	String helloString = new String(helloArray);  
	System.out.println( helloString ); //hello.

	String palindrome = "Dot saw I was Tod";
	int len = palindrome.length();
	System.out.println( "String Length is : " + len ); //String Length is : 17

	//concat two strings together with .concat
      	System.out.println("My name is ".concat("Zara"));

	//concat two strings together with the + sign
      	String string1 = "saw I was ";
      	System.out.println("Dot " + string1 + "Tod");

    //format String
      	float floatVar = 124.124f;
      	String stringVar = "James";
      	int intVar = 5;

		String fs;
		fs = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", floatVar, intVar, stringVar);
		System.out.println(fs);

		//or

		System.out.printf("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", floatVar, intVar, stringVar);
   }
}