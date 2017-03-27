import javax.swing.*;


//here you have to choose SMALL, MEDIUM, LARGE, EXTRA_LARGE and that's it

//Enums are lists of constants 

//Enum constants are implicitly static and final and can not be changed once created.

/*
http://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/

Point-4

	Enum constants are implicitly static and final and can not be changed once created.

Point-5

	Enum can be safely compare using:

		Switch-Case Statement
		== Operator
		.equals() method

	Code:
		Company eBay = Company.EBAY;
		if(eBay == Company.EBAY){
		  log.info("enum in java can be compared using ==");
		}

Point-9

	An enum can be declared outside or inside a class, but NOT in a method.

Point-10

	An enum declared outside a class must NOT be marked static, final , abstract, protected , or private

Point-11

	Enums can contain constructors, methods, variables, and constant class bodies.

Point-13

	enum constructors can have arguments, and can be overloaded.

Point-14

	enum constructors can NEVER be invoked directly in code. They are always called automatically when an enum is initialized.

Point-15

	The semicolon at the end of an enum declaration is optional.

*/

public class PizzaWithEnumeration {
	public static void main(String[] args){
		String input = JOptionPane.showInputDialog("How big is your pizza?\n1: Small\n2: Medium\n3: Large\n4: Extra Large");
		String message;

		//what's ok and what's not with enums

			//this is ok
			Size sample = Size.SMALL;

			//this gives you an error
				//PizzaWithEnumeration.java:35: error: incompatible types: String cannot be converted to Size
					//Size ss = "MEDIUM"; 

				//PizzaWithEnumeration.java:36: error: incompatible types: int cannot be converted to Size
					//Size sss = 1;

			// MyEnum.valueOf(input) takes the value and gets the appropriate enum
				Size size = Size.valueOf(input); //changed int to Size
		
		Pizza pizza = new Pizza();
		pizza.setSize(size);

		switch (size) {
			case SMALL:
				message = "good for 1 person";
				break;
			case MEDIUM:
				message = "good for 2 people";
				break;
			case LARGE:
				message = "good for 3 people";
				break;
			case EXTRA_LARGE:
				message = "good for 3 hungry people";
				break;
			default:
				message = "Oops did I miss something?";
				break;
		}

		JOptionPane.showMessageDialog(null, message + " . Size: " + pizza.getSize());

		//MyEnum.values() gets you an array of the enum values

		for (Size s: Size.values()){
			System.out.println(s); //prints SMALL ...
			System.out.println(s.name()); //prints SMALL ...
			System.out.println(s.ordinal()); //prints 0 ...

			System.out.println(s.getAbbreviation()); //prints small ...
		}
	}
}


//to use you have to input SMALL, MEDIUM, LARGE, EXTRA_LARGE
//SMALL, MEDIUM, LARGE and EXTRA_LARGE are all constants
//enumerations FORCE your user to use a group of constants and only those constants
enum Size { //changed class to enum
	SMALL("small"),
	MEDIUM("medium"),
	LARGE("large"),
	EXTRA_LARGE("extra large");

	private String abbreviation;

	Size(String abbr){
		abbreviation = abbr;
	}

	public String getAbbreviation(){
		return abbreviation;
	}
}

class Pizza {
	private Size size; //changed int to Size

	public Size getSize(){ //changed int to Size
		return size;
	}

	public void setSize(Size s){ //changed int to Size
		this.size = s;
	}
}