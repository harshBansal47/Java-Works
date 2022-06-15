package com.example.demo;

public class MainClass {
    private String name;
    Dependency dependency;

    public void setName(String name) {
        this.name = name;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public void returnDependency(){
        dependency.dependencyDetails();
    }
}
// this class objects have values depends on dependency class