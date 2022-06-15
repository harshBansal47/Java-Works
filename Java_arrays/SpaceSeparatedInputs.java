import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SpaceSeparatedInputs{
    
    public static void main(String[] args) throws IOException {
        
        // trying to read space separated inputs using buffered reader 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        str = br.readLine().split(" ");
        for(int i=0; i<str.length;i++){
            System.out.println(str[i]);
        } 
// making commint for git repo testing
        // using scanner class in java
        Scanner sc = new Scanner(System.in);  
        String[] arr = new String[5];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.next();
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}