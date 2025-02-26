package ManyToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int Emp_id;
    private String Emp_name;

    @ManyToMany
    private List<Projects> projects;

    public Employee(int emp_id, String emp_name, List<Projects> projects) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        this.projects = projects;
    }

    public Employee() {

    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_id=" + Emp_id +
                ", Emp_name='" + Emp_name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
