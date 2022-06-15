

// An exception is an “unwanted or unexpected event
// When an exception occurs, execution of the program gets terminated.

// try: The try block contains set of statements where an exception can occur.
// catch : Catch block is used to handle the exception that occurs in associated try block
// throw: Throw keyword is used to transfer control from try block to catch block
// throws: Throws keyword handle exception without try & catch block.
   // by specifieng the exceptions that a method can throw to the caller and does not handle itself
// finally : executed after catch block.Contains some common code in case of multiple catch blocks.

///     example of try catch and finally   

// public class ExceptionHandlingProblems {
    
//     public static void main(String[] args) {
//         int[] arr = new int[5];                        // creating a array
//     for(int i =0; i<5; i++){                           // filling array
//         arr[i] = i+1;
//     }
//     for (int j = 0; j<5; j++){                         // iterating array
//         System.out.print(arr[j]+" ");
//     }
//     System.out.println("");
//     try {                                              // putting exception code in try block
//         System.out.println(arr[5]); 
//     } catch (ArrayIndexOutOfBoundsException e) {       // handling exception
//         System.out.println( e.getMessage());           // getting message
//     }
//     finally{
//         System.out.println("Exception handled");
//     }  
//     }
// }

//  ROOT class of exception and error is Throwable class
//  Exception class extends Throwable class
//  Exception class is parent class for exceptions
//  It contain various subclasses depending upon the type of exceptions execution
//  All subclsses have the subclasses of individual exceptions
//  We can create user-defined exception by extending the exception class

// At baisc level exception get handles using 2 ways 
// 1. By system (jre): By default it handle the exceptions 
//       if it is not handled by it it is showed at run time

//2. By programmer : via five keywords: try, catch, throw, throws, and finally

//Program statements that you think can raise exceptions are contained within a try block.
// If an exception occurs within the try block, it is thrown. 
// Your code can catch this exception (using catch block) and handle it in some rational manner.
// System-generated exceptions are automatically thrown by the Java run-time system. 
//To manually throw an exception, use the keyword throw. 
//Any exception that is thrown out of a method must be specified as such by a throws clause. 
//Any code that absolutely must be executed after a try block completes is put in a finally block.

// throw and throws keyword
// using throw keyword we generate a exception inside method 
// using throws keyword if we previously know that a method can generate a exception than
// we throws a exceptio by ourself and it handled inside a catch block

// public class ExceptionHandlingProblems{
//      void method_1() throws ArithmeticException{

//     } 
//     public static void main(String[] args) {
//         ExceptionHandlingProblems eh = new ExceptionHandlingProblems();
        
//         try {
//            eh.method_1();
//         } catch (Exception e ) {
//             System.out.println(e.getMessage());
//         }

//     }
// }


// null pointer exception 
// class ExceptionHandlingProblems{
//     public static void main(String[] args) {
//         String str = null;
//         try {
//             str.length();
//         } catch (NullPointerException e) {
//            System.out.println(e.getLocalizedMessage());
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//         }
//     }
// }
// Dealing with multiple exception
// class ExceptionHandlingProblems{
//     int a = 1;
//     int b = 2;
//     void method_1(int a , int b)throws ArithmeticException{
//         System.out.println("Multiply = "+(a*b));
//         System.out.println("Devide = "+ (a/b));
//         if(b == 0){
//             throw new ArithmeticException("can't devide by 0");
//         }

//     }
//     @Override
//     public String toString() throws NumberFormatException {
//         try {
//             return "xyz";
//         } catch (Exception e) {
//             e.hashCode();
//         }
//         throw new NumberFormatException("xyz");
        
//     }
//     public static void main(String[] args) {
//         ExceptionHandlingProblems obj = new ExceptionHandlingProblems();
//         int[] a = new int[4];
//         String str = null;
//         try {
//             Integer s = Integer.parseInt("xyz");
//             System.out.println(s);
//             obj.toString();
//             obj.method_1(3, 0);
//             System.out.println(a[5]);
//             str.length();
//         }catch (MissingFormatWidthException e) {
//             System.out.println(e.getMessage());
//             System.out.println("MissingFormatException");
//         }catch(RuntimeException es){
//             System.out.println(es.getMessage());
//             System.out.println("RuntimeException");
//         }catch(NullPointerException es){
//              System.out.println(es.getMessage());
//         }
//     }
// }

// Manual EXCEPTION 
// class ExceptionHandlingProblems{
//   public class MyException extends Exception{             // it is a user created exception
//     int a = 10;     
//     MyException(String s){
//              super(s);
//          }
//     }
//   public void example(int Weight) throws MyException{            // when this method is called it 
//       if(Weight >= 60){                                          //  it generate exception
//           throw new MyException("Seems to be Overweight");
//       }

//   }
//     public static void main(String[] args) {
//         ExceptionHandlingProblems obj1 = new ExceptionHandlingProblems();
       
        
//         try {
//             obj1.example(78);      // this need to be put in try_catch block to handle exception
//         } catch (Exception e) {
//             System.out.println(e);
//             System.out.println(e.getMessage());
//             System.out.println(e.getLocalizedMessage());
//         }
//     }
// }