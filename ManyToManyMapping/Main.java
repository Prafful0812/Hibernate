package ManyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmp_id(12);
        e1.setEmp_name("Ram");
        Employee e2 = new Employee();
        e2.setEmp_id(14);
        e2.setEmp_name("Laxman");

        Projects p1 = new Projects();
        p1.setProject_id(1);
        p1.setProject_name("Library management system");
        Projects p2 = new Projects();
        p2.setProject_id(2);
        p2.setProject_name("Signal Controlling");

        List<Employee> list1 = new ArrayList<Employee>();
        list1.add(e1);
        list1.add(e2);
        List<Projects> list2 = new ArrayList<Projects>();
        list2.add(p1);
        list2.add(p2);

        e1.setProjects(list2);
        p2.setEmployee(list1);



        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tt = ss.beginTransaction();


        ss.save(e1);
        ss.save(e2);
        ss.save(p1);
        ss.save(p2);
        tt.commit();

        ss.close();
        sf.close();
    }
}
