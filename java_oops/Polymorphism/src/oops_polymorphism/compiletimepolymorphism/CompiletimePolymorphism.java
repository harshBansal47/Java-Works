package oops_polymorphism.compiletimepolymorphism;
public class CompiletimePolymorphism {
    public static void main(String[] args) {
        Maths m = new Maths();
        System.out.println(m.add(3,5));
        System.out.println(m.add(3.5,5.56));
        System.out.println(m.add(3,5,8));
    }
}

class Maths{
    public int add(int a , int b){
        return a+b;
    }
    public double add(double a , double b){
        return a+b;
    }
    public int add (int a ,int b ,int c){
        return a+b+c;
    }
}