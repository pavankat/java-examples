import java.util.Date; //needed for Date
import java.text.*; //needed for SimpleDateFormat

public class DateDemo {

   public static void main(String args[]) {
    	//basic date usage 
   		//Date uses import java.util.Date;
			// Instantiate a Date object
			Date date = new Date();

			// display time and date using toString()
			System.out.println(date.toString()); // on May 04 09:51:52 CDT 2009

		//formatting dates
			Date dNow = new Date( );

			//SimpleDateFormat uses import java.text.*;
			SimpleDateFormat ft = 
			new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

			System.out.println("Current Date: " + ft.format(dNow));
   }
}