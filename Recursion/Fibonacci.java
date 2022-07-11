public class Fibonacci {
    public static void main(String[] args) {
            System.out.print(0+" ");
            System.out.print(1+" ");
        Fibonacci(1000, 0, 1);
    }

    public static void Fibonacci(int n, int a ,int b){
        if((a+b)>n) {   
            return;
        } else{
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c; 
            Fibonacci(n, a, b);          
        }
    }
}



/*
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 
 */