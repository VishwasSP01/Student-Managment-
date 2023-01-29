package com.avangers.StudentManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity addStudent(@RequestBody Student student)
    {
        String response = StudentService.addStudent(student);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

//    Get_Student
    @GetMapping("/get_student/{id}")
    public ResponseEntity getStudent(@PathVariable("id") int id)
    {
        Student student = StudentService.getStudent(id);
        return new ResponseEntity<>(student,HttpStatus.FOUND);
    }

//    Update_Student
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age)
    {
        String response = StudentService.updateStudent(id, age);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

//    Delete_Student
    @DeleteMapping("/Delete_Student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id)
    {
        String respose = StudentService.deleteStudent(id);
        if(respose.equals("Invalid ID"))
        {
            return new ResponseEntity<>(respose,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respose,HttpStatus.FOUND);
    }
}
