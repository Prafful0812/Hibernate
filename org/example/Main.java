package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.IOException;
import java.util.Date;

public class Main{
    public static void main( String[] args ) throws IOException {
        Students std = new Students();
        std.setName("Prafful");
        std.setDepartment("IT");
        std.setPassoutyear(2024);
        std.setDate(new Date());
        std.setCollege("COEP");

        Students std1 = new Students();
        std1.setName("Ram");
        std1.setDepartment("IT");
        std1.setPassoutyear(2024);
        std1.setDate(new Date());
        std1.setCollege("COEP");

        Students std2 = new Students();

        std2.setName("Satish");
        std2.setDepartment("IT");
        std2.setPassoutyear(2024);
        std2.setDate(new Date());
        std2.setCollege("COEP");


//        FileInputStream fis = new FileInputStream("src/main/Lion.png");
//        byte[] data = new byte[fis.available()];
//        fis.read();
//        std.setImage(data);

        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(std);
        s.save(std1);
        s.save(std2);
        t.commit();

        s.close();
        sf.close();

    }
}
