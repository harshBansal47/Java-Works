public class BitWiseOperators{
    public static void main(String[] args) {
        // bitwise OR
        int a =5;
        int b =6;
        int c = a|b;
        System.out.println("5 Or 6 = " + c);

        // bitwise and 
        c = a & b;
        System.out.println("5 And 6 = "+c);

        // bitwise not
        c = ~a;
        System.out.println("Not of 5 = "+ c);

        // bitwise Xor 1 to 0 amd 0 to 1
        c = a^b;
        System.out.println("5 XOR 6 = "+c);

        // left shift
        c = a<<5;
        System.out.println("left shift of 5 by 5 = "+ c);

        // right shift
        c = b>>2;
        System.out.println("right shift of 6 by 2 = "+c);


    }
}