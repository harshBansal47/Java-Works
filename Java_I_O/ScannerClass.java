import java.util.Scanner; //scanner class present in java.util
// it is used in to get input from system, file ,inputstream , string
public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter a byte value");
        Scanner bt = new Scanner(System.in);                   // reading byte value
        System.out.println("Bt = "+ bt.nextByte());
  

        System.out.println("enter a short value");        //reading short value
        System.out.println("sr = "+bt.nextShort());
        

        System.out.println("enter a int value");  // reading int value
    
        System.out.println("it = "+bt.nextInt());


        System.out.println("enter a long value");
                     // reading long value
        System.out.println("lg = "+bt.nextLong());


        System.out.println("enter a float value");
                 // reading a float
        System.out.println("fl = "+bt.nextFloat());


        System.out.println("enter a double value");
                      //reading a double
        System.out.println("db = "+bt.nextDouble());
        
        System.out.println("enter a line of text");
                   //reading a string
        System.out.println("str = "+bt.nextLine());
 

        System.out.println("Enter a boolean value");
                         //reading a boolean
        System.out.println("bl = "+bt.hasNextBoolean());

        System.out.println("enter a word");
                       //reading a word
        System.out.println("wd = "+bt.next());

        

    }
}
