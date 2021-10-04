package be.ehb.demoorm.dao;

import be.ehb.demoorm.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
