public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "tower1", "tower2", "tower3");
    }  

    static void towerOfHanoi(int n , String sourceT1 , String helperT2, String destinationT3){
        if(n==1){
            System.out.println("Transferred disk " + n +" from "+sourceT1+" to "+destinationT3);
            return;
        }
       towerOfHanoi(n-1, sourceT1, destinationT3, helperT2);
       System.out.println("Transferred disk " + n +" from "+sourceT1+" to "+destinationT3);
       towerOfHanoi( n-1, helperT2, sourceT1, destinationT3);
    }
}

