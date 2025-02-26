package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Questions {
    @Id
    private int id;
    private String Questions;

    @OneToOne
    private Answers ans;

    public Questions(int id, String questions, Answers ans) {
        this.id = id;
        Questions = questions;
        this.ans = ans;
    }

    public Questions() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public Answers getAns() {
        return ans;
    }

    public void setAns(Answers ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", Questions='" + Questions + '\'' +
                ", ans=" + ans +
                '}';
    }
}
