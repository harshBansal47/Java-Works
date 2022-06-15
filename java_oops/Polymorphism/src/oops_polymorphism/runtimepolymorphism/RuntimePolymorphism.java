package oops_polymorphism.runtimepolymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Sim s1 = new Airtel();
        Sim s2 = new Jio(); 
        s1.call();
        s2.call();
        s1.data();
        s2.data();     
    }
}

abstract class Sim{
     abstract void call();
     abstract void data();
}

class Airtel extends Sim{
    @Override
   public void call(){
       System.out.println("airtel is called");
   }
   @Override
   public void data(){
       System.out.println("Airtel is using data");
   }
}

class Jio extends Sim{
    public void call(){
        System.out.println("Jio is called");
    }
    public void data(){
        System.out.println("Jio is usung data");
    }
}