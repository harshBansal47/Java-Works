public class Encapsulatin {
    public static void main(String[] args) {
       Students s1 = new Students();
       s1.setRollno(1);
       s1.setName("puru");
       System.out.println(s1.getRollno() +" "+ s1.getName());
    }
}
//encapsulation is binding data with methods
 class Students {
    private int rollno;
    private String name;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
//encapsulation is achieved using access modifiers and methods(get-set)
//encapsulation is a process of wrapping code and data in a single thing
//in java encapsulation keep related things and methods together which makes our code cleaner
//it help to avoid the modification of data fields using access modifiers

