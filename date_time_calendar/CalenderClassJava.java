// Calender class is a abstract class
// we can't able to create contructor of calender class as it is abstract class
// we use it's static methods
// It get and converts specific date and time to another
// WE use it's static method Calender.getInstance() 
import java.util.*;
public class CalenderClassJava {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();               // IT IS NECESSARY
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getFirstDayOfWeek());

        // get method
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        // getMaxm 
        System.out.println(c.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
        
        // getMinm
        System.out.println(c.getMinimum(Calendar.DAY_OF_WEEK));
        System.out.println(c.getMinimum(Calendar.DAY_OF_MONTH));

        // add method
        System.out.println(c.getTime());
        c.add(Calendar.DATE,+15);
        System.out.println(c.getTime());
        c.add(Calendar.MONTH,+4);
        System.out.println(c.getTime());
    }
}
