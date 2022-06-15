package Multithreading;

public class Account_one extends Thread{
 
  public void run() {
    try {
        int account_one_balance = 250;
    boolean i = false;
    while(!i){
    System.out.println("Account_balance = " + account_one_balance);
    account_one_balance ++;
    Thread.sleep(1000);   
    } 
    } catch (Exception InterruptedException) {
        
    }
  }
}
