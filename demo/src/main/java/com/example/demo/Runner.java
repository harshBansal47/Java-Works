package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       MainClass m1 = context.getBean("main1", MainClass.class);
       MainClass m2 = context.getBean("main2", MainClass.class);
       MainClass m3 = context.getBean("main3", MainClass.class);
       m1.returnDependency();
       m2.returnDependency();
       m3.returnDependency();
    
      MainClass1 m4 = context.getBean("main1_1",MainClass1.class);
      m4.returnDependency();

    }
}