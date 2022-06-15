public class ArrayRotation{
    public void rotate(int arr[],int d){   // d is the number of time array rotate
       for(int i=0;i<d;i++){
           rotateByOne(arr);
       }
       
    }
    public void rotateByOne(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
           arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        ArrayRotation rot = new ArrayRotation();
        rot.rotate(arr, 3);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
