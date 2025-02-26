package ManyToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Projects {
    @Id
    private int project_id;
    private String project_name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employee;

    public Projects(int project_id, String project_name, List<Employee> employee) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.employee = employee;
    }

    public Projects() {

    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", employee=" + employee +
                '}';
    }
}
