package com.avangers.StudentManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    studentServer  StudentService;

//    Add_student
    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student)
    {
        return StudentService.addStudent(student);
    }

//    Get_Student
    @GetMapping("/get_student/{id}")
    public Student getStudent(@PathVariable("id") int id)
    {
        return StudentService.getStudent(id);
    }

//    Update_Student
    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age)
    {
        return StudentService.updateStudent(id, age);
    }

//    Delete_Student
    @DeleteMapping("/Delete_Student{id}")
    public String deleteStudent(@PathVariable("id") int id)
    {
        return StudentService.deleteStudent(id);
    }
}
