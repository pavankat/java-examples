import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;

public class GrabInput {
	public static void main(String[] args) throws Exception{
		System.out.println("enter a number.");

		//this works if I enter a number in
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			System.out.println(num);

		//another way
			//will wait till you enter a value. If you enter an enter it won't proceed. It'll wait till you put in a value.
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println(number);

		//you can keep asking for multiple things with the scanner and it'll put them in the appropriate variables
			// you can enter them in one at a time and press enter 
			// or
			// you can enter them in seperated by a space like this: 4 8
			System.out.println("enter numbers.");

			int numberTwo = scanner.nextInt();
			int numberThree = scanner.nextInt();
			System.out.println(numberTwo);
			System.out.println(numberThree);

		//you can keep it going until the number entered is -1 or its not an integer
			while(scanner.hasNextInt()){
				int numberFour = scanner.nextInt();
				System.out.println(numberFour);

				if (numberFour == -1){
					break;
				}
			}

		//another way (only works in the terminal - not with Intellij IDEA )
			System.out.println("Using the Console");
			Console console = System.console();
			int numberFive = Integer.parseInt(console.readLine());
			System.out.println(numberFive);
	}
}
