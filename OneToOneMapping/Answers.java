package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answers {
    @Id
    private int id;
    private String Answers;

    @OneToOne
    private Questions q;

    public Answers(int id, String answers, Questions q) {
        this.id = id;
        Answers = answers;
        this.q = q;
    }

    public Answers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswers() {
        return Answers;
    }

    public void setAnswers(String answers) {
        Answers = answers;
    }

    public Questions getQ() {
        return q;
    }

    public void setQ(Questions q) {
        this.q = q;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "id=" + id +
                ", Answers='" + Answers + '\'' +
                ", q=" + q +
                '}';
    }
}
