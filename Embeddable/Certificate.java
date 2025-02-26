package Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String department;
    private String Position;

    public Certificate(String department, String position) {
        this.department = department;
        Position = position;
    }
    public Certificate(){

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "department='" + department + '\'' +
                ", Position='" + Position + '\'' +
                '}';
    }
}
