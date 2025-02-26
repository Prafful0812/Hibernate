package org.example;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "Details_Students")
public class Students{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column(length = 50, name = " NAME")
    private String name;
    private String department;

    @Transient
    private int passoutyear;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String College;

    @Lob
    private byte[] image;

    public Students(int id, String name, String department, int passoutyear, Date date, String college, byte[] image) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.passoutyear = passoutyear;
        this.date = date;
        College = college;
        this.image = image;
    }

    public Students() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPassoutyear() {
        return passoutyear;
    }

    public void setPassoutyear(int passoutyear) {
        this.passoutyear = passoutyear;
    }

    public String getCollege() {
        return College;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setCollege(String college) {
        College = college;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", passoutyear=" + passoutyear +
                ", date=" + date +
                ", College='" + College + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
