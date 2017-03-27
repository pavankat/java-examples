import javax.swing.*;

//if you run this you can put in whatever number you want
public class PizzaWithoutEnumeration {
	public static void main(String[] args){
		String input = JOptionPane.showInputDialog("How big is your pizza? \n 1: Small \n 2: Medium \n 3: Large \n 4: Extra Large");
		int size = Integer.parseInt(input);
		Pizza pizza = new Pizza();
		pizza.setSize(size);
		JOptionPane.showMessageDialog(null, "Size: " + pizza.getSize());
	}
}

class Size {
	public static final int SMALL = 1;
	public static final int MEDIUM = 2;
	public static final int LARGE = 4;
	public static final int EXTRA_LARGE = 5;
}

class Pizza {
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int size){
		this.size = size;
	}
}