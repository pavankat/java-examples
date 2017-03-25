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

	//indexes
		System.out.println("");
		String bro = "My name is arnold.";
		int arnoldIndex = bro.indexOf("arnold");
		System.out.println(arnoldIndex); //11

	//trim
		System.out.println("");
		String rich = "    My name is rich.     ";
		String richTrimmed = rich.trim();
		System.out.println(richTrimmed);

	//uppercase
		System.out.println("");
		System.out.println("hello".toUpperCase());

	//lowercase
		System.out.println("");
		System.out.println("BYE".toLowerCase());

	//substrings
		//starts at first number and goes to the end if no second argument is present
		//starts at first number and goes right before the second number if second number is present
		String s1 = "Lot of rules. Lot of rules. On the street, we didn't have any rules.";
		String s2 = s1.substring(15);
		String s3 = s1.substring(6, 9);
		System.out.println(s1);
		System.out.println(s2); //ot of rules. On the street, we didn't have any rules.
		System.out.println(s3); // ru

	//string builder vs concat
		StringBuilder sb = new StringBuilder("Hello from ");
		sb.append("Trump"); //this modifies sb and adds Trump to it
		
		String s4 = "Hello from ";
		String s5 = s4.concat("Trump");

		System.out.println("");
		System.out.println(sb);
		System.out.println(s5);

	//use methods of StringBuilder
		sb.replace(0, 5, "Sup");
		System.out.println(sb);

		sb.insert(0, "Coding ");
		System.out.println(sb);

		sb.deleteCharAt(0);
		System.out.println(sb);

		sb.delete(0,3);
		System.out.println(sb);

	//convert String to int, boolean
		String number = "12345";
		int no = Integer.parseInt(number);
		System.out.println(no);

		String boo = "true";
		boolean bo = Boolean.parseBoolean(boo);
		System.out.println(bo);


   }
}