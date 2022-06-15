public class Abstraction{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(42.34,52.6,"red");
        Square s1 = new Square(61.4,"orange");
        System.out.println(r1.toString());
        System.out.println(s1.toString());
        Shapes.message(); // calling a static method directly from abstract class
    }
}

//Abstraction is the process in which only essential details are displayed to the user
//In java, abstraction is achieved by interfaces and abstract classes
//We can achieve 100% abstraction using interfaces

abstract class Shapes{                               // creating abstract class
   String color;                                     //field inside abstract class
   public abstract double area();                    // abstract methods 
   public abstract String toString();
   Shapes(String color){                             // abstract class constructor
       this.color = color;
   }
   static void message(){
    System.out.println("This is a static method of abstract class it can be called directly");
   }
}

class Rectangle extends Shapes{                     // inheritance of abstract class
    double length;
    double width;
     Rectangle(double length,double width,String color){     
        super(color);                               // calling constructor of abstract class
        this.length = length;
        this.width = width;
    }
    public double area(){                           //initiallizing abstract methods
       return this.length*this.width;
    } 
    public String toString(){
        return "area of rectangle is " + this.length + "*"+this.width+" = "+area()+" color is "+color;
    }
}
class Square extends Shapes{
    double length;
     Square(double length,String color){
        super(color); 
        this.length = length;
    }
    public double area(){
       return this.length*this.length;
    } 
    public String toString(){
        return " area of square is " + this.length + "*"+this.length+" = "+area()+" color is "+color;
    } 
}