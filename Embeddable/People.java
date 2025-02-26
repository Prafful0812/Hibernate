package Embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class People {
    @Id
    private int id;
    private String name;
    private String Address;

    private Certificate ctf;

    public People(Certificate ctf, String address, String name, int id) {
        this.ctf = ctf;
        Address = address;
        this.name = name;
        this.id = id;
    }

    public People() {

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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Certificate getCtf() {
        return ctf;
    }

    public void setCtf(Certificate ctf) {
        this.ctf = ctf;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", ctf=" + ctf +
                '}';
    }
}
