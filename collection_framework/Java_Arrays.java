
/*

public class Java_Arrays {
    public static void main(String[] args) {
        int nums[] = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for(int i =0; i<5; i++){
            System.out.println(nums[i]);
        }
        int nums_1[] = {3,6,4,3,6};
        System.out.println(nums_1[3]);
        //array of objects
        Student s[]  = new Student[4];
         s[0] = new Student();
         s[1] = new Student();
         s[2] = new Student();
         s[3] = new Student();
        //2d array
        int a[][] = {
            {1,2,3,4},
            {2,3,4,5},
            {4,2,6,7}
        };
        System.out.println(a[0][1]);
        for(int i = 0; i<a.length;i++){
            for(int j =0; j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
         }
         //jagged array
         int b[][] = {
            {1,2,3,4,5},
            {2,3,4,5,3,6,3},
            {4,2,6,7,9,3}
        };
        for(int i = 0; i<b.length;i++){
            for(int j =0; j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
         }
         //enhanced for loop
         for(int k:nums){
             System.out.print(k);
         }
         for(int l[]:b){
             System.out.println(" ");
          for(int m:l){
              System.out.print(m);
          }
          System.out.println("");
         }
         Cal obj = new Cal();
        System.out.println(obj.add(3,65,25,75,123,7,36,414,4124,343));

    }
}

class Student{
    String s_name;
    int s_marks;
}
//varrags
class Cal{
    int sum =0;
    public int add(int ... n){//this create a array
        for(int i:n){
           sum = sum + i;
        }
        return sum;     
 
}
}

*/

class Java_Arrays{
   public static void main(String[] args) {
                                 // in java arrays are declared using []
    /* int[] arr = new int[5];
       arr[0]=1;
       arr[1]=1;
       arr[2]=1;
       arr[3]=1;
       arr[4]=1;
       System.out.println(arr);
       for(int i =0; i<arr.length; i++){
           System.out.println(arr[i]);
       }
       int arr1[] = new int[]{1,2,3,4,5,6,7};
       for(int i =0; i<arr1.length; i++){
        System.out.println(arr1[i]);
       }
    */
       // array of objects 
      Student[] arr = new Student[3];
      arr[0] = new Student(2,4);
      arr[1] = new Student(6,8);
      arr[2] = new Student(7,2);
      int[][][] a = {
          {{1,2,4},{2,3,4},{3,34,5}},
          {{1,2,4},{2,3,4},{3,34,5}},
          {{1,2,4},{2,3,4},{3,34,5}}
      };
System.out.println(a[1][1][1]);
System.out.println(a[1][1][2]);
   }
 }
class Student{
    public int id;
    public int std;
    Student(int id , int std){
           this.id = id;
           this.std = std;
    }
    public void display(){
        System.out.println(std);
        System.out.println(id);
    }
}