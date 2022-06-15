import java.io.*;
import java.util.*;
public class ExceptionHandling {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try{
      int x = input.nextInt();
      int y = input.nextInt();
        System.out.println(x/y);  
      }catch(Exception e){
          if(e instanceof java.lang.ArithmeticException )
              System.out.println(e.toString());
          if(e instanceof java.util.InputMismatchException)
              System.out.println(e.toString());
      }
   }
}

// exceptions in java
// exception is a unexpected error or event occur during program execution-
// -that can affect flow of program or can terminate the program

// java exception hierarchy 
// Throwable---  1. Error  
//               2. Exception----
//                  (i) RuntimeException 
//                  (ii) IOException
//         here Throwable class is the root class in hierarchy

// error :-  irrecoverable conditions such as jvm running out of memory , memory leaks , 
// stack overflow errors , library incompability , infinite recursion, etc .. .
// errors are usually beyondd he control of programmers

// Exceptions :- they can be caught and handled by the program
// when an exception occurs within a method , it creates an object , this -
// -object is called exception object

// (i) RuntimeException :- happens due to programming error also known -
// - as unchecked exceptions
// some common runtime exceptions are 
//                      - IllegalArgumentException 
//                      - NullPointerException
//                      - ArrayIndexOutOfBoundException
//                      - ArithmeticException
// if there is a runtime exception it is a fault in programming

//(ii) IOException :- also known as checked exception 
// they are checked by compiler in compile time and programmer is prompted to handle these exceptions
// ex - FileNotFoundException

// Java Exception Handling :- approaches to handle exceptions in java
//                         1. try .. catch block
//                         2. finally block
//                         3. throw and throws keyword

//                                        1. Java try..catch block
//                                        syntax
//     try {
//         int devidebyzero = 5/0;
//         System.out.println("rest of code in try block");
//     }
//     catch (ArithmeticException e){
//         System.out.println("Arithmatic Exception => " + e.getMessage());
//     }                     


//                                       2. Java finally block                                   
// it is executed no matter there is exception or not
// for each try block there can be only one finally block
// if an exception occur finally block is executed after try..catch block otherwise after try block
//     try {
//         int devidebyzero = 5/0;
//     } catch (Exception e) {
//         System.out.println("ArithmaticException => " + e.getMessage());
//     }
//       finally{
//           System.out.println("this is finally block");
//       } 


//                                       3. Java throw and throws keyword
// throw keyword explicitly throws a single exception (it is throwed by choice of programmer)
// when we throw an exception the flow of program moves from try block to catch block
// ex :-
// class AgeValidation{
//     public void age_validate(int age){
//         if(age <18){
//             throw new ArithmeticException("Age is not valid");
//         }
//         else{
//             System.out.println("welcome");
//         }
//      }
// }
// try {
//     AgeValidation obj1 = new AgeValidation();
//     obj1.age_validate(16);
//    } catch (Exception e) {
//        System.out.println(e.getMessage());
//    }

//                                            throws keyword
// throws keyword is used to declare exception while throw keyword is used to explicitely -
// - throw an exception 
// throws keyword is used by programmer when we see's an chance's of occurance of error -
// -while calling a method ... in that way programmer use exceptional handling
//                                         syntax  
//  type method_name(parameters) throws exception_list
// exception list is comma separated list of exceptions
// it is required only for checked exceptions and meaningless for unchecked exceptions
// it is required only to convince compiler
// ex:-
// static void fun() throws IllegalAccessException {
//     System.out.println("Inside fun().");
//     throw new IllegalAccessException("demo");           
//  }
// public static void main(String[] args) {
//    try {
//        fun();
//    } catch (IllegalAccessException e) {
//        System.out.println(" IllegalAccessException() is thrown");
//    }
// }                                                                                