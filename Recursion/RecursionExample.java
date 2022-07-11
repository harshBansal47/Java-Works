public class RecursionExample{
    public static void main(String[] args) {
        /**
          Recursion is a process in which a method calls itself 
          to do a particular iteration  
         * */ 
        int n = 5; 
        // Factorial is a recursive function
        int factorial = Factorial(n);
        System.out.println("factorial = " + factorial);
        
    }
    // Eg :- Factorial of a number using recursion
      private static int Factorial(int n){
        if(n!=0){
         return n*Factorial((n-1));
        }else{
            return 1;
        }
      }
}