package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Questions {
    @Id
    private int id;
    private String que;

    @OneToMany(mappedBy = "questions")
    private List<Answers> answer;

    public Questions(int id, String que, List<Answers> answer) {
        this.id = id;
        this.que = que;
        this.answer = answer;
    }

    public Questions() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public List<Answers> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answers> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", que='" + que + '\'' +
                ", answer=" + answer +
                '}';
    }
}
