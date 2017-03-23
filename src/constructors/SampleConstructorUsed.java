//A constructor initializes an object when it is created. It has the same name as its class 
	//it's similar to a method
		//However, there's nothing it returns

//Typically, you will use a constructor to give initial values to the instance variables defined by the class, or to perform any other startup procedures required to create a fully formed object.

//All classes have constructors, 
	//whether you define one or not, 
		//because Java automatically provides a default constructor that initializes all member variables to zero. 
			//However, once you define your own constructor, the default constructor is no longer used.

// Here is a simple example that uses a constructor without parameters

// A simple constructor.
class SampleConstructorUsed {
   int x;

   // Following is the constructor
   SampleConstructorUsed() {
      x = 10;
   }
}