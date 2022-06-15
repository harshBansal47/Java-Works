public class AnonymousClassDemo {
    public static void main(String[] args) {
       Abc obj_1 = new Abc();
       obj_1.show(); 
    //if we want to print something different here by calling this method show() 
    //we have to either create a parallel class and extend abc in it or create a anonymous class
       Abc obj_2 = new Abc(){
           public void show(){
               System.out.println("aNYTHING DIfferent from previous");
           }
       };
       obj_2.show();
    //we can also create a anonymous class using interface and we don't need to create classes to use interfaces   
       Bcd obj_3 = new Bcd(){
           public void show(){
               System.out.println("aNYTHING DIfferent from interfaces");
           }
       };
       obj_3.show();
       //short cut of this
       Bcd obj_4 =()->System.out.println("shortcut DIfferent from interfaces");
       obj_4.show();
    }
}
//ex -take a class
class Abc{
    public void show(){
        System.out.println("Anything is called");
    }
}
interface Bcd{
    void show();
}