package Multithreading;

public class intrest_acc extends Thread {
   
    public void run() {
    try {
        int d = 0;
        while(true){
            System.out.println("Day" + d);
            d++;
            Thread.sleep(1000);
        }
        
    } catch (Exception InterruptedException ) {
        
    }
}
}