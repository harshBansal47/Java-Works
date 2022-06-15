package Objects;

class NormalCreation{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setInfo(1, "alex");
        s1.getInfo();
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