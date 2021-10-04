package be.ehb.demoorm.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Groep {

    @Id
    @GeneratedValue
    private int groupNR;
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Student> students = new ArrayList<>();


    public Groep() {
    }

    public int getGroupNR() {
        return groupNR;
    }

    public void setGroupNR(int groupNR) {
        this.groupNR = groupNR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
