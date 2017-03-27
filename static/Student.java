class Student {
	private String firstName;
	private String lastName;
	private static String className;
	private static String collegeName;

	// a static block :)
	//this runs before the constructor
	static {
		System.out.println("First");
		//firstName = "blue"; // won't work because firstName is private
		//lastName = "dragon"; // won't work because lastName is private
		className = "Yawn";
		collegeName = "Kung Fu Bootcamp";
	}

	//constructor
	Student(String fName, String lName, String csName, String clName){
		firstName = fName;
		lastName = lName;
		className = csName;
		collegeName = clName;
	}

	public static String getClassName(){
		return className;
	}

	public static void setclassName(String className){
		Student.className = className;
	}

	public static String getCollegeName(){
		return collegeName;
	}

	public static void setCollegeName(String collegeName){
		Student.collegeName = collegeName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public static void printStudent(Student s){
		System.out.println(s.firstName);
	}
}