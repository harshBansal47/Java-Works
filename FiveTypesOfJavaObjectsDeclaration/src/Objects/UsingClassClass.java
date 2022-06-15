package Objects;

public class UsingClassClass {
    public static void main(String[] args)throws InstantiationException, IllegalAccessException
    ,ClassNotFoundException {
        Student s1 = Student.class.newInstance();
//The method newInstance() from the type Class<Student> is deprecated since version 9Java(67110270) 
        s1.setInfo(1, "george");
        s1.getInfo();

        Student s2 = (Student)Class.forName("Objects.Student").newInstance();
//The method newInstance() from the type Class<Student> is deprecated since version 9Java(67110270)
        s2.setInfo(2, "hillery");
        s2.getInfo();
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