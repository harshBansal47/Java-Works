import java.util.*;
public class Collection_problems {
    
}
                               ///////////////////////////////////////////////////////////
//  1.           program to traversing a arraylist

// class Traversing {
//     public static void main(String[] args) {
//         ArrayList<Integer> ar = new ArrayList <Integer>(); //declaring arraylist 
//         ar.add(2);
//         ar.add(4);
//         ar.add(5);                              //adding elements
//         ar.add(6);
//         ar.add(7);
//          // using for loop
//         for(int i = 0; i<ar.size(); i++){
//             System.out.print("using for loop " + ar.get(i) + " ");  //iterating
//         }
//         System.out.println("");
//         // using for-each loop
//         for(Integer i : ar){
//             System.out.print("using for_each loop "+i + " ");
//         }
        
//     } 
// }   
                              ///////////////////////////////////////////////////////////

                              ///////////////////////////////////////////////////////////
// 2.    program to traverse a hashset

// class traversing{
//     public static void main(String[] args) {
//         HashSet<Integer> hs = new HashSet<>();
//         hs.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,9));
//         System.out.println("HashSet = "+hs);
//         //iterating using Iterator interface
//         Iterator<Integer> i = hs.iterator();
//         if(i.hasNext()){
//             for(int j = 0;j<hs.size();j++){
//                 System.out.println(i.next());
//             }
//         }
//     }
// }
                              /////////////////////////////////////////////////////////// 
                              
                              ///////////////////////////////////////////////////////////
//  3. Program for iteration of Hashmap using for-each loop

class traversing {
    public static void main(String[] args) {
        HashMap<Integer,String> fruits = new HashMap<>();
        fruits.put(1,"apple");
        fruits.put(2,"mango");
        fruits.put(3,"banana");
        fruits.put(4,"guava");
        fruits.put(5,"cherry");
        fruits.put(6,"grapes");
        fruits.put(7,"orange"); 
    
    }                       
}