public class Power {



    public static void main(String[] args) {
        System.out.println(calcPow2(2, 2));
    }
    /* 
 * In this example Stack height is aproximate to n
 */



    public static int calcPow(int x , int n){
        if(x == 0 ){
            return 0 ;
        }
        else if(n == 0){
            return 1 ; 
        }else{
            return x*calcPow(x, (n-1));
        }
    }



    /*
     * Stack height = log n 
     */
     static int calcPow2(int x , int n){
        if(n == 0 ){
            return 1 ;
        }
        else if(n%2 == 0){
            return calcPow2(x, n/2)*calcPow2(x, n/2);
        }else{
            return x*(calcPow2(x, n/2) * calcPow2(x, n/2)) ;
        }
    }

}
