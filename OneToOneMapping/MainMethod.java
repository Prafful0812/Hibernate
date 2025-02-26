package OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod {
    public static void main(String[] args) {
        Questions que = new Questions();
        que.setId(1210);
        que.setQuestions("What is Your name?");


        Answers ans = new Answers();
        ans.setId(502);
        ans.setAnswers("My name is Prafful");
        que.setAns(ans);
        ans.setQ(que);

        Questions que1 = new Questions();
        que1.setId(1214);
        que1.setQuestions("Where are you from? ");

        Answers ans1 = new Answers();
        ans1.setId(500);
        ans1.setAnswers("I am from Pune");
        que1.setAns(ans1);
        ans1.setQ(que1);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        s.save(que);
        s.save(ans);
        s.save(que1);
        s.save(ans1);
        t.commit();

        Questions newq = s.get(Questions.class,1214);
        System.out.println(newq.getQuestions());
        System.out.println(newq.getAns().getAnswers());




        s.close();
        sf.close();

    }
}
