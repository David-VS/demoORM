package be.ehb.demoorm.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int studNR;
    @NotBlank
    private String firstname, lastname;

    @ManyToOne
    @JoinColumn(name = "groupNR")
    private Groep group;



    public Student() {
    }

    public int getStudNR() {
        return studNR;
    }

    public void setStudNR(int studNR) {
        this.studNR = studNR;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Groep getGroup() {
        return group;
    }

    public void setGroup(Groep group) {
        this.group = group;
    }
}
