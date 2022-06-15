package com.example.demo;

public class Dependency {
    private int id ;
    private int num;

    public void setId(int id) {
        this.id = id;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void dependencyDetails(){
      System.out.println(this.id +","+this.num);
    }
}
