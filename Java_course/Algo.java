import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Algo {
    public static void main(String[] args) throws IOException {
        // taking input
         // two ways
         //1. Scanner class
         //2. Bufferedreader class

         // here we use Bufferedreader to read a character stream
        //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scr = new Scanner(System.in);
         System.out.println("Enter a number");
        //  int a = br.read();
        int a = scr.nextInt();
         for(int i = 0; i<a; i++){
             if(i==0 || i==a-1){
                 for(int j =0; j<a; j++){
                    System.out.print("*");
                 }
                 System.out.println("");
             }
             else{
                 for(int j=0;j<a-i;j++){
                     System.out.print(" ");
                 }
                 System.out.print("*");
                 System.out.println("");
             }
         }
    }
}
