public class SubOfNnaturalNumber {
    public static void main(String[] args) {
        int sum = FindSum(100);
        System.out.println(" ");
        System.out.println("sum = " + sum);
       
        /*
         * Inside Functionality :-
         * program call main method
         * main method goes into the stack memory
         * then main method call FindSum
         * FindSum called for n = n
         * FindSum goes to stack memory above main methed for n = n
         * Findsum called for n = n-1 in recursion process
         * FindSum goes to stack memory above main methed for n = n-1
         *    |
         *    |
         *    |
         *    |
         * FindSum called for n = 1 in recursion process
         * FindSum goes to stack memory above main method for n = n-1
         * FindSum called for n = 0 in recursion process
         * FindSum goes to stack memory for n = 0 (Final method)
         * 
         * Runtime Start
         * stack memory cleared one by one 
         */
    }
    public static int FindSum(int n){
       System.out.print(n+" ");
       if(n==0){
        return 0;
       }else{
        return n+FindSum(n-1);
       }
    }
}

