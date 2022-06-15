// ArrayList is a dynamic array in java

import java.util.Collection;
import java.util.*;
class Students{                                                       //creating class
    int roll_no;                                                      //creating fields
    String name;
    String address;
    public Students(int roll_no,String name,String address){          //creating contructor
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }
    public String toString(){                                         
        return  "Roll no = "+this.roll_no +" Name =  "+ this.name +" Address = "+ this.address ;
    }
}
public class Arraylist_Demonstration{                                // public class
    public static void main(String[] args) {
       ArrayList<Students> ar = new ArrayList<Students>();            //creating arraylist of objects
       ar.add(new Students(401, "parker", "san"));
       ar.add(new Students(403, "duffy", "californ"));
       ar.add(new Students(405, "downey", "pitsbg"));
       ar.add(new Students(409, "mike", "melbrn"));
       ar.add(new Students(411, "tyler", "sydne"));
       ar.add(new Students(540, "brown", "aukland"));
       for(int i=0; i<ar.size();i++ ){
           System.out.println(ar.get(i));
       }
       //removing a element 
       ar.remove(5);
       System.out.println(ar.size()); 
       Students s1 = new Students(540, "brown", "aukland");
       
       //Modifying a element
       ar.set(4, s1);
       System.out.println(ar.size()); 










       List <String> fruits = new ArrayList<String>();
       fruits.add("apple");
       fruits.add("mango");
       fruits.add("orange");
       fruits.add("banana");                                      //  adding elements in a arraylist
       fruits.add("grapes");
       System.out.println("size of fruits list : " + fruits.size()); //  size() to display size
       System.out.println(fruits);                                    // printing whole list
       fruits.remove(0);                                       //  removing an element of list
       System.out.println(fruits);
       System.out.println("Hashcode = " + fruits.hashCode());         //  getting hashcode
       System.out.println(fruits.get(0));                      //  accesing a element
       fruits.set(0,"guava");                         //  changing a element
       System.out.println(fruits);
       for(String fruit : fruits){                                  //   iteration using for each loop 
           System.out.println(fruit);
       }
                                        //other methods are clear(),isEmpty(),contains(),toArray()
       // Array asList() method [present in java.util.Arrays]  returns fixed-size list backed by array                               
       fruits.addAll(Arrays.asList("coconut","melon","papaya"));
       System.out.println("Updated list = "+fruits);


    }
}