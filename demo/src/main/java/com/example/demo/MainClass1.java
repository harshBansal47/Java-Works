package com.example.demo;

public class MainClass1 {
    private String name;
    Dependency dependency;

    public MainClass1(String name ,Dependency dependency){
         this.name = name;
         this.dependency = dependency;
    }

    public void returnDependency(){
        dependency.dependencyDetails();
    }
}
