package be.ehb.demoorm.controllers;

import be.ehb.demoorm.dao.StudentRepo;
import be.ehb.demoorm.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private StudentRepo dao;

    @Autowired
    public StudentController(StudentRepo dao) {
        this.dao = dao;
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<Student> getAllStudents(){
        return dao.findAll();
    }

    @PostMapping("/new")
    @ResponseBody
    public String addStudent(@RequestParam("firstname")String firstname,
                             @RequestParam("lastname")String lastname){

        Student toSave = new Student();
        toSave.setFirstname(firstname);
        toSave.setLastname(lastname);

        dao.save(toSave);

        return "gelukt";
    }
}
