package OneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Questions qs = new Questions();
        qs.setId(14);
        qs.setQue("Wher are you from");
        List<Answers> ans = null;
        qs.setAnswer(ans);


        Answers as = new Answers();
        as.setId(15);
        as.setAns("I am from Pune");
        as.setQuestions(qs);

        Answers as1 = new Answers();
        as1.setId(16);
        as1.setAns("I am from Mumbai");
        as1.setQuestions(qs);

        Answers as2 = new Answers();
        as2.setId(17);
        as2.setAns("I am from Delhi");
        as2.setQuestions(qs);

        ans = new ArrayList<Answers>();
        ans.add(as);
        ans.add(as1);
        ans.add(as2);

        qs.setAnswer(ans);


        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

//        Questions q = s.get(Questions.class,1);
//        System.out.println(q.getId());
//        System.out.println(q.getQue());
//
//        for(Answers a : q.getAnswer()){
//            System.out.println(a.getAns());
//        }

        s.save(qs);
        s.save(as);
        s.save(as1);
        s.save(as2);
        t.commit();


        s.close();
        sf.close();

    }
}
