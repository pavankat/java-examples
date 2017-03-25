//this uses SampleConstructorUsed.class
	//as long as the file is in the same directory you can use it in this file
public class ConsDemo {

   public static void main(String args[]) {
      SampleConstructorUsed t1 = new SampleConstructorUsed();
      SampleConstructorUsed t2 = new SampleConstructorUsed();
      System.out.println(t1.x + " " + t2.x); // 10 10

      ParamsConstructor t3 = new ParamsConstructor( 15 );
      ParamsConstructor t4 = new ParamsConstructor( 90 );
      System.out.println(t3.x + " " + t4.x); // 15 90
   }
}