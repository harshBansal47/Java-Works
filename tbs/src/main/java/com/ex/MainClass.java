package com.ex;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args) {
       Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
    }
}
