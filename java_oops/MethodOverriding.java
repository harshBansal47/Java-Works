public class MethodOverriding {
    public static void main(String[] args) {
        B obj_1 = new B();
        obj_1.method_1();
        obj_1.method_2();
        obj_1.method_2_();
    }
}
class A{
    public void method_1(){
        System.out.println("A is called");
    }
    public void method_2(){
        System.out.println("A is called as piecewise");
    }
}
class B extends A{
    public void method_1(){
        System.out.println("B is called");
    }
    public void method_2_(){
        System.out.println("B is called as piecewise");
    }
}
