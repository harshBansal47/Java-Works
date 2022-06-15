/*
public class InterfaceDemo {
   public static void main(String[] args) {
       Abc obj = new Implementor();      
       Abc obj_1 = new Implementor_1();
       Implementor_2 obj_3 = new Implementor_2();
       obj_3.present(obj,obj_1);
//using interface in funtional mode and saving memory of multiple classes
       Abc Obj_2 = ()-> System.out.println("Interface abc is called");
       Obj_2.show();
       obj.show_1();
       Abc.show_2();
   } 
}
//generally interface is like a abstract class
//abstract class have both normal as well as abstract methods
//while interface has only abstract methods
//we can't create objects of interface we can only create a reference
//we can implement multiple interfaces in a class while we can't extends multiple classes
//defining a interface
interface Abc{
    void show();
//to provide body to methods he have to use default keyword
    default void show_1(){
        System.out.println("Show_1 is called");
    }
//using static we can use it as a object
    static void show_2(){
        System.out.println("show_2 is called");
        int i = 9;
        int j = 10;
        //variables in interface are just like have a default final keyword attached to it
        System.out.println("Addition of 9+10 is"+(i+j));
    }    
}
class Implementor implements Abc{
    public void show(){
        System.out.println("Implementor is called");
    }
}
class Implementor_1 implements Abc{
    public void show(){
        System.out.println("Implementor_1 is called");
    }
}
class Implementor_2{
    public void present(Abc I,Abc I1){
        I.show();
        I1.show();
    } 
}
*/
public class InterfaceTuts{
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(22,2);
        Bike b2 = new Bike(43,3);
        System.out.println(b1.speed);
        System.out.println(b2.speed);
        Vehicle.message();
    }
}

interface Vehicle{
    //methods declared in an interface are by default abstract 
    //all fields are public, static and final by default
    int changeSpeed(int a);                //return type is int to use methods exactly in classes
    int applyBrake(int a);                 //default parameters are passes to use it 
    int changeGear(int a);                     // exactly in classes
    static void message(){
        System.out.println("Vehicle interface dirctly called");
    }
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    Bicycle(int speed,int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public int changeSpeed(int speed_change){
        return speed += speed_change;
    }
    public int changeGear(int gear_change){
        return gear+=gear_change;
    }
    public int applyBrake(int speed_change){
        return speed += speed_change;
    }
}
class Bike implements Vehicle{
    int speed;
    int gear;
    Bike(int speed,int gear){
        this.speed = speed;
        this.gear = gear;
    }
    public int changeSpeed(int speed_change){
        return speed += speed_change;
    }
    public int changeGear(int gear_change){
        return gear+=gear_change;
    }
    public int applyBrake(int speed_change){
        return speed += speed_change;
    }
}