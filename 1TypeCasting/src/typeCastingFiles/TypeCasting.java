package typeCastingFiles;

public class TypeCasting {
    public static void main(String[] args) {
      /*   There are two types of typecasting 
        1.. Automatic
        2.. Manual

        Order ------

        byte
        short
        int 
        long
        float
        double


        in the above order we do automatic typecasting   */

        // Automatic way example

        int a = 9;
        float b = 9.5f;
        long c = a;
        double d = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        // Manual type casting 
        int e = (int)b;
        System.out.println(e);


    }
}
