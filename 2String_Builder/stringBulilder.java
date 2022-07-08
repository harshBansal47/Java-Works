public class stringBulilder{
    public static void main(String[] args) {
        // String is immutable in java
        // StringBuilder in Java is a class used to create a mutable String

        StringBuilder s = new StringBuilder("Hello");
        System.out.println(s);

        s.append(" ");
        System.out.println("Space appended "+ s);

        s.insert(6, "Ww");
        System.out.println("String Inserted "+s);

        s.delete(7, 8);  
        System.out.println("String Deleted "+s);

       System.out.println( "Character at 7th Index "+s.charAt(6));





       /// Reversing a string using algorithms
       System.out.println("==> ==> ==> ==> ==> ==> ==> ==> Algo 1 ");
       for(int i=0;i<=s.length()/2;i++){
        int front = i; 
        int back = s.length() -1 -i ;
        char frontChar = s.charAt(front);
        char backChar  = s.charAt(back);
        s.setCharAt(front, backChar);
        s.setCharAt(back ,frontChar);
       }
       System.out.println(s);


       // alternate
       System.out.println("Reversed String "+s.reverse());


    }
}