import javax.swing.*;
import java.util.ArrayList;

public class StaticExample {
    public static void main(String[] args) {
    	//hit cmd on the class to see it
    	//Math is a standard Java class that uses static in it
    	System.out.println(Math.max(2, 3));

    	int stop = 1;
    	boolean keepRunning = true;
    	ArrayList<Student> list = new ArrayList<>();
    	while (keepRunning){
    		String firstName = JOptionPane.showInputDialog("First Name");
    		String lastName = JOptionPane.showInputDialog("Last Name");
    		String className = JOptionPane.showInputDialog("Class Name");
    		String collegeName = JOptionPane.showInputDialog("College Name");
    		stop = Integer.parseInt(JOptionPane.showInputDialog("Stop? \n1: Yes\n2: No"));

    		Student s = new Student(firstName, lastName, className, collegeName);
    		
    		list.add(s);
    		System.out.println("*********************************************");

    		for (Student current: list){
    			//calling a static method from the Student class
    			Student.printStudent(current);
    		}

    		if (stop == 1){
    			keepRunning = false;
    		}
    	}
    }
}