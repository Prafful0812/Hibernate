package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
    @Id
    private int id;
    private String ans;

    @ManyToOne
    private Questions questions;

    public Answers(int id, String ans, Questions questions) {
        this.id = id;
        this.ans = ans;
        this.questions = questions;
    }

    public Answers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "id=" + id +
                ", ans='" + ans + '\'' +
                ", questions=" + questions +
                '}';
    }
}
