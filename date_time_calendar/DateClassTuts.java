// Java has a Date class in util package
// Date() : Java has different contructor of date class according to the parameters
// Date() : Creates date object representing current date and time.
// Date(long milliseconds) : Creates a date object for the given milliseconds since ---- 
//                                ---  January 1, 1970, 00:00:00 GMT.
// Date(int year, int month, int date)
// Date(int year, int month, int date, int hrs, int min)
// Date(int year, int month, int date, int hrs, int min, int sec)

import java.util.*;
class DateClassTuts{
  public static void main(String[] args) {
      Date d1 = new Date();       // default contructor
      System.out.println(d1);     
      Date d2 = new Date(434133232); // record date wrt milliseconds
      System.out.println(d2);
      Date d3 = new Date(121, 11, 18); // creating a date in particular object
      System.out.println(d3);

// methods of date class
// boolean after(Date date) : Tests if current date is after the given date.
// boolean before(Date date) : Tests if current date is before the given date.
// int compareTo(Date date) : Compares current date with given date. 
        //Returns 0 if the argument Date is equal to the Date; 
        //a value less than 0 if the Date is before the Date argument; and a value greater than 0 
        //if the Date is after the Date argument.
// long getTime() : Returns the number of milliseconds since January 1, 1970,
           // 00:00:00 GMT represented by this Date object.
// void setTime(long time) : Changes the current date and time to given time.
    boolean  c = d1.after(d2);
    boolean  d = d2.after(d3);
    boolean  e = d3.before(d1);
      System.out.println("c = "+c);
      System.out.println("d = "+d);
      System.out.println("e = "+e);
      System.out.println(d1.compareTo(d2));
      System.out.println(d1.getTime());
      d2.setTime(3442534545625l);
      System.out.println(d2);
  }  
}

// we get rest of details from calender classs