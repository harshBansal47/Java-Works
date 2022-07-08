import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value of n between 0 and 10 :- ");
        int n = s.nextInt();

        for(int i = 1; i<=n; i++){
        for(int j=n;j>i; j--){
            System.out.print(" ");
        }
        for(int k=0; k<i;k++){
            System.out.print(i + " ");
        }
           System.out.println("");
        }


    }
}
