import java.io.*;
import java.util.*;

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        AdvancedArithmetic aA = new MyCalculator();
        int f = input.nextInt();
        int r = aA.divisor_sum(f);
        System.out.println(r);
    }
}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    MyCalculator(){
        System.out.println("I implemented: AdvancedArithmetic");
    }
    public int divisor_sum(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0)
              sum = sum + i;
        }
        return sum;
    }
}