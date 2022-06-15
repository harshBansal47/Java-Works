public class Generics_demo{
    public static void main(String[] args) {
        PrinterInteger i = new PrinterInteger(4);
        PrintFloat f = new PrintFloat(4.6);
        PrinterString S = new PrinterString("fhs");

        // here to obtain such a code for different data types we have writen 
        // multiple duplicate codes
        // now Generics can solve this probelem 
        Printer <Integer> p = new Printer<>(525);
        // Reference of generic class with 2 parameters 
        ParameterizedPrinter <Integer ,String> pp = new ParameterizedPrinter<>(1,"fwfd"); 
        Animals<Dog , Cat> an = new Animals<>(new Dog(), new Cat());
    }
}

class PrinterInteger{
   public PrinterInteger(int a){
       System.out.println(a);
   }
}
class PrintFloat{
    public PrintFloat(Double a){
        System.out.println(a);
    }
}
class PrinterString{
    public PrinterString(String a){
        System.out.println(a);
    }
}

// Now we are declaring a generic class
class Printer <T> {
    public Printer(T t){
      System.out.println(t);
    }
}

class Animals <Dog , Cat> {
    public Animals(Dog dog ,Cat cat){
     System.out.println("Dog: "+ dog);
     System.out.println("Cat: "+ cat);
    }
}
class Dog{  
   
    public String toString() {
        // TODO Auto-generated method stub
        return "bark" ;
    } 
}
class Cat{
    
    public String toString() {
        // TODO Auto-generated method stub
        return "meow" ; 
    }
}

// Generic class for 2 or more parameters
class ParameterizedPrinter <U,V>{

    public ParameterizedPrinter(U u , V v) {
        System.out.println("First parameter "+u);
        System.out.println("Second parameter "+v);
    }
}

