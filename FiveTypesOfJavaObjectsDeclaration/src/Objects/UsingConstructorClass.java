package Objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingConstructorClass {
    public static void main(String[] args)throws NoSuchMethodException, SecurityException,
    InstantiationException, IllegalAccessException, IllegalArgumentException,
    InvocationTargetException{

        Constructor<Student> constr = Student.class.getConstructors();
        Student st1 =  constr.newInstance();
        st1.setInfo(1,"vivian");
        st1.getInfo();
    }
}
class Student{
    private String name;
    private int id;
    public void setInfo(int id , String name){
       this.id = id;
       this.name = name;
    }
    public void getInfo(){
        System.out.println(id + " " + name);
    }
}
