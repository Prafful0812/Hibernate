package Embeddable;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        People pp = new People();
        pp.setId(13);
        pp.setName("ABC");
        pp.setAddress("Pune");

        Certificate ctff = new Certificate();
        ctff.setDepartment("XYZ");
        ctff.setPosition("Lead");
        pp.setCtf(ctff);

        People pp1 = new People();
        pp1.setId(14);
        pp1.setName("Virat");
        pp1.setAddress("Mumbai");

        Certificate ctff1 = new Certificate();
        ctff1.setDepartment("Cricket");
        ctff1.setPosition("Captain");
        pp.setCtf(ctff1);


        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory ff = cfg.buildSessionFactory();
        Session ss = ff.openSession();
        Transaction tt = ss.beginTransaction();

        ss.save(pp);
        ss.save(pp1);

        tt.commit();
        ss.close();
        ff.close();
    }
}
