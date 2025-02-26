package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.openSession();
        //Transaction t = s.beginTransaction();
//        Students std = s.get(Students.class,2);
//        System.out.println(std);

        Students std = s.load(Students.class,2);
        System.out.println(std.getCollege()+ " " + std.getName());

        //t.commit();
        s.close();
        sf.close();
    }
}
