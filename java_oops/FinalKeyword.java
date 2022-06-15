public class FinalKeyword {
    public static void main(String[] args) {
        //we can use final keyword with the variable, method ,class
        //it creates the entity constant with which it used  
        //ex for variable
        final int a = 10;
        //a = 11; it creates a error 'cannot assign a value to final variable a'
    }
}
//ex for class
final class A{
   public final void show(){
   }
}
// class B extends A{
                                           // it creates a error
// }

class B{
    public final void show(){

    }
}
//ex for method
// class C extends B{
//    public void show(){
                                    // it creates a error like this "overridden method is final"
//    }
// }