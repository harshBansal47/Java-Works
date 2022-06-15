public class ObjectOrientedBasics{
    public static void main(String[] args) {
                                            //declaring a object of calc class
      Calc obj = new Calc(10,20);
    //   obj.a =2;
    //   obj.b = 3;
      obj.Add();
      System.out.println(obj.result);
      obj.Multiply();
      System.out.println(obj.result);
                                           // declaring a object of employee class
      System.out.println(Emp.ceo);
      Emp guru = new Emp(25,6000,2);
      System.out.println(guru.identity_no+" "+guru.age+" "+guru.salary+" "+Emp.ceo);
      Emp gurjant = new Emp();
      gurjant.Details(27, 4350, 3);
                                           //demonstration of outer inner class
      Outer obj1 = new Outer();
      Outer.Inner obj2 = obj1.new Inner();
      obj2.func_1();

    }
}
    
                                            // class for calculator
class Calc{
                                            // declaring variables in class
    int a;
    int b;
    int result;
                                            // declaring methods in class
    public void Add(){
        result = a+b;
    }
    public void Substract(){
        result = a-b;
    }
    public void Multiply(){
       result = a*b;
    }
    public void Devide(){
        result = a/b;
    }

                                           // defining basic constructor(it is a default -
                                           //  - method which called everytime when a object is created )
    public Calc(){
        System.out.println("calc is called");
        a = 5;
        b = 5;
    }
                                          // defining constructor with parameters(after creation of object-
                                          //  -we can modify the constructor as per our priority)
                                          // this is also an example of method overloading
    public Calc(int a, int b){
                                          // this keyword (it is used to relate local variables -
                                          // - global variables)
         this.a = a;
         this.b = b;
    }

}

                                          // declaring another class employee
class Emp{
    int age;
    int salary;
                                          // static keyword (it makes the thing permanent)
    static String ceo;
    int identity_no;

    public Emp(){
        ceo = "harry";
    }
    public Emp(int age,int salary,int identity_no){
      this.age = age;
      this.identity_no = identity_no;
      this.salary =salary;  
    }
    public void Details(int age,int salary,int identity_no){
      this.age = age;
      this.identity_no = identity_no;
      this.salary =salary; 
      System.out.print(this.identity_no+" ");
      System.out.print(this.salary+" ");
      System.out.print(this.age+" ");
      System.out.print(ceo+" ");
    }
                                                             //static block (we can permanently declare-
                                                             // - a particular variable in this way)
    static{
      ceo  = "harry";
    }
}

                                                          //inner-outer class //three types 
                                                          //inner-member class //inner-static class 
                                                          //inner anonymous class
                                                          //classes can be created in this way
class Outer{
  class Inner{
     public void func_1(){
       System.out.println(" ");
       System.out.println("func_1 is called");
     }
  }
}