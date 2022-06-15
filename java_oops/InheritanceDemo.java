public class InheritanceDemo {
    public static void main(String[] args) {
        CalcAdv obj = new CalcAdv();
        System.out.println(obj.Modulus(10,4));
        obj.a = 5;
        obj.b = 6;
        obj.Add();
        System.out.println(obj.result);
        Calcadv_calc obj_1 = new Calcadv_calc(5);
        System.out.println(obj_1.Add_mult(5,2,65,23,74,12,5,324,63,313,565,232));
        obj_1.a = 7;
        obj_1.b = 3;
        obj_1.Substract();
        System.out.println(obj_1.result);
    }
}
class CalcAdv extends Calc{
    public CalcAdv(){
            System.out.println("calcadv is called");
        }
    public CalcAdv(int j){
           System.out.println("parameterized calcadv is called");
    }    
    public int Modulus(int a,int b){
          return a%b;
      }
}
class Calcadv_calc extends CalcAdv{
    public Calcadv_calc(){
        System.out.println("calcadv_calc is called");
    }
    public Calcadv_calc(int i){
        super(i);
        System.out.println("parameterized calcadv_calc is called");
    }
    int sum = 0;
    public int Add_mult(int ... n){
    for(int k:n){
        sum = sum+k;
    }
    return sum;
    }
}
//use of super keyword during inheritance 
//as super is a method which is used in inheritance
// sub class extends super class //in inheritance one is super class and one is sub class 
//we can define a super constructor by using super() in that particular constructor
//super method is useful only when there are various constructors with different types of parameters
//super is also used in method overriding