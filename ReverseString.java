/**
 * create a new file called ReverseString.java
 * create a function that takes in a string
 * and prints out the reverse of that string
 */
public class ReverseString {
	//this one returns a result
	public static String revStr(String str) {
	   String revString = "";
	   //hello.substring(4,5)
	   //hello.substring(3,4)
	   //hello.substring(2,3)
	   //revString = oll
	   /**
		str.substring(i, i+1);

		str[i]
	   */
	   for (int i = str.length() -1; i > -1; i--) {
	      revString = revString + str.substring(i, i+1);
	   }

	   return revString;
	}

	public static void main(String[] args) {
		String test = "hello";
		System.out.println(revStr(test));
	}
}