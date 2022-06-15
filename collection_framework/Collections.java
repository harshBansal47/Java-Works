import java.util.*;
/**
 * Collections
 */
public class Collections {
  public static void main(String[] args) {
                                                              // arraylist - resizable array , 
                                                              // can grow and shrink dynamically , 
                                                              // non synchronized , 
                                                              // grow to 50 % of initial size 
                                                              // maintains it's order of insertion
                                                              //implements to list interface
     
                                                                //LinkedList
                                                                //there is very much  about linked_list as
                                                                //- these are data structures 
                                                                //introduction coding
      LinkedList <String> vegs = new LinkedList<>();
      vegs.add("tomato");
      vegs.add("potato");
      vegs.add("carrot");
      vegs.add("capsicum");
      vegs.add("garlic");
      System.out.println(vegs);
      System.out.println(vegs.get(2));                           
                                                       // special methods in linked_list 
      String str1 = vegs.poll();                       // due to its implementation with queue and deque
      vegs.offer("cabbage");                           // poll() , offer()
      System.out.println(vegs);                        // linked list behave as queue after this
      System.out.println(str1);                        //queue is a list of type(last in first out)

      
  }
}