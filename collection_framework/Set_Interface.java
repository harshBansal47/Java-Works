import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {
    public static void main(String[] args) {
                              // location : java.util package
                              // perform operations like mathematical set (intersection , union , difference)
                              // it does'nt allow duplicate elements
                              // extends - sorted set , navigable set 
                              // classes - HashSet , TreeSet , EnumSet , LinkedHashSet
        Set <Integer> numbers = new HashSet<>();
        numbers.add(2);  
        numbers.add(4); 
        numbers.add(3); 
        numbers.add(7);     
        numbers.add(3); 
        numbers.add(8);
        System.out.println("set1 = "+numbers);
                                                                     // creating another set  
        Set <Integer> numbers_1 = new HashSet<>();  
        numbers_1.add(3); 
        numbers_1.add(2); 
        numbers_1.add(1); 
        numbers_1.add(5);   
        numbers_1.add(6); 
        numbers_1.add(9); 
        System.out.println("set2 = "+ numbers_1);                     // set operations
                                                                      // intersection of two set
        Set <Integer> intersection_set = new HashSet<Integer>(numbers);
        intersection_set.retainAll(numbers_1);
        System.out.println("intersection_set = "+intersection_set);
                                                                      // union of two set
        Set <Integer> union_set = new HashSet<Integer>(numbers);
        union_set.addAll(numbers_1);
        System.out.println("union_set = "+union_set);
                                                                      // difference of two set
        Set<Integer> difference_set = new HashSet<Integer>(numbers);
        difference_set.removeAll(numbers_1);
        System.out.println("difference_set = "+difference_set);  
        
                                                        // iteration of set using iterator method
        Iterator <Integer> i = numbers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
}
}