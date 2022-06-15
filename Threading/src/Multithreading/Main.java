package Multithreading;

public class Main {
    public static void main(String[] args) {
        Account_one a = new Account_one();
        intrest_acc b = new  intrest_acc();
        b.start();
        a.start();
        
    }  
}

// In this file I include the main method where the java code of all classes to be run
// we will design 2 accounts payment interaction in java
