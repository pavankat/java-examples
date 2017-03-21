//$ java CommandLine this is a command line 200 -100

public class CommandLine {

   public static void main(String args[]) { 
      for(int i = 0; i<args.length; i++) {
         System.out.println("args[" + i + "]: " +  args[i]);
      }
   }
}