import java.util.Scanner;
public class Rohmbus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Value of n :- ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            for(int k=n-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0; j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
